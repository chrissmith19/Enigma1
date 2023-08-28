package main;

public class RotorManager {

    private int startPosition;
    private Rotor rightRotor;
    private Rotor middleRotor;
    private int numberOfRotors=1;

    public RotorManager(int rightRotorStartPosition, int middleRotorStartPosition){
        this.startPosition=rightRotorStartPosition;
        this.rightRotor =new Rotor(rightRotorStartPosition);
        this.middleRotor =new Rotor(middleRotorStartPosition);
        this.numberOfRotors= 2;
    }
    public RotorManager(int rightRotorStartPosition){
        this.startPosition=rightRotorStartPosition;
        this.rightRotor =new Rotor(rightRotorStartPosition);
    }

    public String encodeLetter(String letter) {
        rightRotor.incrementRotor();
        if(middleRotor!=null){incrementMiddleRotor();};
        return encypherLetter(letter);
    }

    private String encypherLetter(String letter){

        if(this.numberOfRotors>1){
            return middleRotor.encypherLetter(rightRotor.encypherLetter(letter));
        }
        else return rightRotor.encypherLetter(letter);
    }

    public String decodeLetter(String letter) {
        rightRotor.incrementRotor();
        incrementMiddleRotor();
        return decypherLetter(letter);
    }

    private String decypherLetter(String letter){

        if(this.numberOfRotors>1){
            return rightRotor.decypherLetter(middleRotor.decypherLetter(letter));
        }
        else return rightRotor.decypherLetter(letter);
    }

    private void incrementMiddleRotor(){
        if (rightRotor.doesStartPositionMatchRotorNotch()) {
            middleRotor.incrementRotor();
        }
    }

    public void setRightRotor(Rotor rightRotor) {
        this.rightRotor = rightRotor;
    }

    public void setMiddleRotor(Rotor middleRotor) {
        this.middleRotor = middleRotor;
    }

    public String encodeWord(String word) {
        String encodedWord="";
        for (int i = 0; i < word.length(); i++) {
            String encodedLetter = encodeLetter(String.valueOf(word.charAt(i)));
            encodedWord+=encodedLetter;
        }
        return encodedWord;
    }

    public String decodeWord(String word) {
        String decodedWord="";
        for (int i = 0; i < word.length(); i++) {
            String decodedLetter = decodeLetter(String.valueOf(word.charAt(i)));
            decodedWord+=decodedLetter;
        }
        return decodedWord;
    }
}
