package main;

public class RotorManager {

    private int startPosition;
    private Rotor rightRotor;
    private Rotor middleRotor;
    private int numberOfLetters=0;

    public RotorManager(int rightRotorStartPosition, int middleRotorStartPosition){
        this.startPosition=rightRotorStartPosition;
        this.rightRotor =new Rotor(rightRotorStartPosition);
        this.middleRotor =new Rotor(middleRotorStartPosition);
    }
    public RotorManager(int rightRotorStartPosition){
        this.startPosition=rightRotorStartPosition;
        this.rightRotor =new Rotor(rightRotorStartPosition);
    }

    public String encodeLetter(String letter) {
        numberOfLetters+=1;
        rightRotor.incrementRotor();
//        incrementMiddleRotor();
        return rightRotor.encypherLetter(letter);
    }

    public String decodeLetter(String letter) {
        rightRotor.incrementRotor();
//        incrementMiddleRotor();
        return rightRotor.decypherLetter(letter);
    }

    private void incrementMiddleRotor(){
        if(numberOfLetters%26==0){
            middleRotor.incrementRotor();
        }
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
