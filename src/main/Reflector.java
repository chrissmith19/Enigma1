package main;

import java.util.HashMap;

public class Reflector {

    HashMap reflectorMap = new HashMap<String,String>(){{
        put("a","z");
        put("b","y");
        put("c","x");
        put("d","w");
        put("e","v");
        put("f","u");
        put("g","t");
        put("h","s");
        put("i","r");
        put("j","q");
        put("k","p");
        put("l","o");
        put("m","n");
        put("n","m");
        put("o","l");
        put("p","k");
        put("q","j");
        put("r","i");
        put("s","h");
        put("t","g");
        put("u","f");
        put("v","e");
        put("w","d");
        put("x","c");
        put("y","b");
        put("z","a");
    }};

    public String getReflectedLetter(String letter){
        return reflectorMap.get(letter).toString();
    }
}
