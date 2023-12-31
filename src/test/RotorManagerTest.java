package test;

import main.Rotor;
import main.RotorManager;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class RotorManagerTest {

    @Test
    public void rotorHappyCaseEncodeA() {
        RotorManager rotor = new RotorManager(0);
        String encodedLetter = rotor.encodeLetter("a");

        Assert.assertEquals("g", encodedLetter);
    }

    @Test
    public void rotorHappyCaseEncode2LettersConsecutive() {
        RotorManager rotor = new RotorManager(0);
        String encodedLetterFirst = rotor.encodeLetter("a");

        String encodedLetterSecond = rotor.encodeLetter("a");

        Assert.assertEquals("g", encodedLetterFirst);
        Assert.assertEquals("d", encodedLetterSecond);
    }

    @Test
    public void rotorHappyCaseEncodeWithDifferentStartingPosition() {
        RotorManager rotor = new RotorManager(2);
        String encodedLetterFirst = rotor.encodeLetter("a");
        String encodedLetterSecond = rotor.encodeLetter("a");

        Assert.assertEquals("q", encodedLetterFirst);
        Assert.assertEquals("o", encodedLetterSecond);
    }

    @Test
    public void rotorHappyCaseDecode() {
        RotorManager rotor = new RotorManager(0);
        String decodedLetterFirst = rotor.decodeLetter("g");

        Assert.assertEquals("a", decodedLetterFirst);
    }

    @Test
    public void rotorHappyCaseDecode2Letters() {
        RotorManager rotor = new RotorManager(0);
        String decodedLetterFirst = rotor.decodeLetter("g");
        String decodedLetterSecond = rotor.decodeLetter("d");

        Assert.assertEquals("a", decodedLetterFirst);
        Assert.assertEquals("a", decodedLetterSecond);
    }

    @Test
    public void rotorHappyCaseDecode2LettersWithOffset() {
        RotorManager rotor = new RotorManager(2);
        String decodedLetterFirst = rotor.decodeLetter("q");
        String decodedLetterSecond = rotor.decodeLetter("o");

        Assert.assertEquals("a", decodedLetterFirst);
        Assert.assertEquals("a", decodedLetterSecond);
    }

    @Test
    public void rotorHappyCaseEncodeWord() {
        RotorManager rotor = new RotorManager(0);
        String encodedWord = rotor.encodeWord("cat");

        Assert.assertEquals("qdl", encodedWord);
    }

    @Test
    public void rotorHappyCaseEncodeWordWithOffset() {
        RotorManager rotor = new RotorManager(2);
        String encodedWord = rotor.encodeWord("cat");

        Assert.assertEquals("xoy", encodedWord);
    }

    @Test
    public void rotorHappyCaseDecodeWord() {
        RotorManager rotor = new RotorManager(0);
        String encodedWord = rotor.decodeWord("qdl");

        Assert.assertEquals("cat", encodedWord);
    }

    @Test
    public void rotorHappyCaseDecodeWordWithOffset() {
        RotorManager rotor = new RotorManager(2);
        String encodedWord = rotor.decodeWord("xoy");

        Assert.assertEquals("cat", encodedWord);
    }

    @Test
    public void largeOffSet() {
        RotorManager rotor = new RotorManager(24);
        String encodedLetterFirst = rotor.encodeLetter("a");
        String encodedLetterSecond = rotor.encodeLetter("a");

        Assert.assertEquals("h", encodedLetterFirst);
        Assert.assertEquals("j", encodedLetterSecond);
    }

    @Test
    public void longStringEncryption() {
        RotorManager rotor = new RotorManager(0);
        String encodedword = rotor.encodeWord("aaaaaaaaaaaaaaaaaaaaaaaaaaa");

        Assert.assertEquals("gdqoxuscamifrvtpnewkblzyhjg".toLowerCase(), encodedword);
    }

        @Test
        public void largeOffSetDecode() {
                RotorManager rotor = new RotorManager(27);
                String encodedLetter = rotor.decodeLetter("j");

                Assert.assertEquals("y",encodedLetter);
        }
}