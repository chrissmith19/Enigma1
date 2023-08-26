package test;

import main.Rotor;
import main.RotorManager;
import org.junit.Assert;
import org.junit.Test;

public class RotorTest {

    @Test
    public void rotorHappyCaseEncodeA() {
        Rotor rotor = new Rotor(0);
        String encodedLetter = rotor.encypherLetter("a");

        Assert.assertEquals("j",encodedLetter);
    }

    @Test
    public void rotorHappyCaseEncodeWithDifferentStartingPosition() {
        Rotor rotor = new Rotor(2);
        String encodedLetterFirst = rotor.encypherLetter("a");

        Assert.assertEquals("d",encodedLetterFirst);
    }

    @Test
    public void rotorHappyCaseDecode() {
        Rotor rotor = new Rotor(0);
        String decodedLetterFirst = rotor.decypherLetter("j");

        Assert.assertEquals("a",decodedLetterFirst);
    }

    @Test
    public void rotorHappyCaseDecode2LettersWithOffset() {
        Rotor rotor = new Rotor(2);
        String decodedLetterFirst = rotor.decypherLetter("q");

        Assert.assertEquals("b",decodedLetterFirst);
    }

    //increment rotor test
}