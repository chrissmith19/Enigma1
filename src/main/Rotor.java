package main;


import java.util.ArrayList;

public class Rotor {


    ArrayList keyList = new ArrayList() {{
        add("a");
        add("b");
        add("c");
        add("d");
        add("e");
        add("f");
        add("g");
        add("h");
        add("i");
        add("j");
        add("k");
        add("l");
        add("m");
        add("n");
        add("o");
        add("p");
        add("q");
        add("r");
        add("s");
        add("t");
        add("u");
        add("v");
        add("w");
        add("x");
        add("y");
        add("z");
    }};
    //        abcdefghijklmnopqrstuvwxyz
//        JGDQOXUSCAMIFRVTPNEWKBLZYH
    ArrayList valueList = new ArrayList() {{
        add("j");
        add("g");
        add("d");
        add("q");
        add("o");
        add("x");
        add("u");
        add("s");
        add("c");
        add("a");
        add("m");
        add("i");
        add("f");
        add("r");
        add("v");
        add("t");
        add("p");
        add("n");
        add("e");
        add("w");
        add("k");
        add("b");
        add("l");
        add("z");
        add("y");
        add("h");
    }};

    int startPosition;
    int rotorNotch = 0;

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public Rotor() {
    }

    public Rotor(int startingPosition) {
        startPosition = startingPosition;
    }

    public void incrementRotor(){
            startPosition = (startPosition + 1) % 26;
    }

    public String encypherLetter(String letter){
        return valueList.get(keyList.indexOf(letter) + startPosition).toString();
    }

    public String decypherLetter(String letter){
        return keyList.get(valueList.indexOf(letter) - startPosition).toString();
    }

}
