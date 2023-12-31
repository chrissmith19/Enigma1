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
//            jgdqoxuscamifrvtpnewkblzyh

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

    public void setRotorNotch(int rotorNotch) {
        this.rotorNotch = rotorNotch;
    }

    public boolean doesStartPositionMatchRotorNotch(){
        if(rotorNotch==startPosition){
            return true;
        }
        else return false;
    }

    public Rotor(int startingPosition) {
        startPosition = startingPosition;
    }

    public void incrementRotor() {
        startPosition = (startPosition + 1) % 26;
    }

    public String encypherLetter(String letter) {
        return valueList.get((keyList.indexOf(letter) + startPosition) % 26).toString();
    }

    public String decypherLetter(String letter) {
        if (valueList.indexOf(letter) >= startPosition) {
            return keyList.get((valueList.indexOf(letter) - startPosition)).toString();
        } else {
            return keyList.get(26 - Math.abs(valueList.indexOf(letter) - startPosition)).toString();
        }
    }

    //        abcdefghijklmnopqrstuvwxyz
//            jgdqoxuscamifrvtpnewkblzyh

    //    default 0 offset
//            0123456789  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
    //        abcdefghij  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
//            jgdqoxusca  m  i  f  r  v  t  p  n  e  w  k  b  l  z  y  h

//    2 offset gear 1 + 1 increment
//            0123456789  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
    //        abcdefghij  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
//            qoxuscamif  r  v  t  p  n  e  w  k  b  l  z  y  h  j  g  d

    //    2 offset gear 1 + 2 increment
//            0123456789  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
    //        abcdefghij  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
//            oxuscamifr  v  t  p  n  e  w  k  b  l  z  y  h  j  g  d  q

    //    2 offset gear 1 + 3 increment
//            0123456789  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
    //        abcdefghij  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
//            xuscamifrv  t  p  n  e  w  k  b  l  z  y  h  j  g  d  q  o

//    2 offset gear 2
//            0123456789  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
    //        abcdefghij  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
//            dqoxuscami  f  r  v  t  p  n  e  w  k  b  l  z  y  h  j  g
//    hpj
//    c
}
