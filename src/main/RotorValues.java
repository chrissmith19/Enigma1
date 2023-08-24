package main;

import java.util.ArrayList;

public enum RotorValues {
    rotor1(new String[]{"a", "b"});

    private final String[] myArray;

    RotorValues(String[] myArray) {
        this.myArray = myArray;
    }

}
