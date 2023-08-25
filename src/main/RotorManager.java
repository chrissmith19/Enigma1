package main;

public class RotorManager {

    private int startPosition;
    private Rotor rotor;

    public RotorManager(int startPosition){
        this.startPosition=startPosition;
        this.rotor=new Rotor(startPosition);
    }

    public String encodeLetter(String letter) {
        rotor.incrementRotor();
        return rotor.encypherLetter(letter);
    }

    public String decodeLetter(String letter) {
        rotor.incrementRotor();
        return rotor.decypherLetter(letter);
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
