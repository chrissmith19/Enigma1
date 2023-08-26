package test;

import main.Rotor;
import main.RotorManager;
import org.junit.Assert;
import org.junit.Test;

public class RotorMultiRotorTest {

    @Test
    public void rotorHappyCaseEncodeA() {
        Rotor rotor = new Rotor(0);
        String encodedLetter = rotor.encypherLetter("a");

        Assert.assertEquals("j", encodedLetter);
    }

    @Test
    public void rotorHappyCaseEncode2LettersConsecutive() {
        RotorManager rotor = new RotorManager(0);
        String encodedLetterFirst = rotor.encodeLetter("a");

        String encodedLetterSecond = rotor.encodeLetter("a");

        Assert.assertEquals("g", encodedLetterFirst);
        Assert.assertEquals("d", encodedLetterSecond);
    }
}