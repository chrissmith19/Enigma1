package main;

public class RotorManager {

    private Rotor rightRotor;
    private Rotor middleRotor;
    private Rotor leftRotor;


    public RotorManager(int rightRotorStartPosition, int middleRotorStartPosition, int leftRotorStartPosition) {
        this.rightRotor = new Rotor(rightRotorStartPosition);
        this.middleRotor = new Rotor(middleRotorStartPosition);
        this.leftRotor = new Rotor(leftRotorStartPosition);
    }

    public RotorManager(int rightRotorStartPosition, int middleRotorStartPosition) {
        this.rightRotor = new Rotor(rightRotorStartPosition);
        this.middleRotor = new Rotor(middleRotorStartPosition);
    }

    public RotorManager(int rightRotorStartPosition) {
        this.rightRotor = new Rotor(rightRotorStartPosition);
    }

    public String encodeLetter(String letter) {
        incrementRotors();
        return encypherLetter(letter);
    }

    private String encypherLetter(String letter) {

        if (leftRotor != null) {
            return leftRotor.encypherLetter(middleRotor.encypherLetter(rightRotor.encypherLetter(letter)));
        } else if (middleRotor != null) {
            return middleRotor.encypherLetter(rightRotor.encypherLetter(letter));
        } else return rightRotor.encypherLetter(letter);
    }

    public String decodeLetter(String letter) {
            incrementRotors();
        return decypherLetter(letter);
    }

    private String decypherLetter(String letter) {

        if (leftRotor!=null) {
            return rightRotor.decypherLetter(middleRotor.decypherLetter(leftRotor.decypherLetter(letter)));
        } else if (middleRotor!=null) {
            return rightRotor.decypherLetter(middleRotor.decypherLetter(letter));
        } else return rightRotor.decypherLetter(letter);
    }

    private void incrementRotors() {
        rightRotor.incrementRotor();
        if (middleRotor!=null && rightRotor.doesStartPositionMatchRotorNotch()) {
            middleRotor.incrementRotor();
            if (leftRotor!=null&& middleRotor.doesStartPositionMatchRotorNotch()) {
                leftRotor.incrementRotor();
            }
        }

    }

    public void setRightRotor(Rotor rightRotor) {
        this.rightRotor = rightRotor;
    }

    public void setMiddleRotor(Rotor middleRotor) {
        this.middleRotor = middleRotor;
    }

    public String encodeWord(String word) {
        String encodedWord = "";
        for (int i = 0; i < word.length(); i++) {
            String encodedLetter = encodeLetter(String.valueOf(word.charAt(i)));
            encodedWord += encodedLetter;
        }
        return encodedWord;
    }

    public String decodeWord(String word) {
        String decodedWord = "";
        for (int i = 0; i < word.length(); i++) {
            String decodedLetter = decodeLetter(String.valueOf(word.charAt(i)));
            decodedWord += decodedLetter;
        }
        return decodedWord;
    }
}
