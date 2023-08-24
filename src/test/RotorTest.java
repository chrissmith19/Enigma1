package test;

import main.Reflector;
import main.Rotor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class RotorTest {

    @Test
    public void rotorHappyCaseEncodeA() {
        Rotor rotor = new Rotor();
        String encodedLetter = rotor.encodeLetter("a");

        Assert.assertEquals("g",encodedLetter);
    }

    @Test
    public void rotorHappyCaseEncode2LettersConsecutive() {
        Rotor rotor = new Rotor();
        String encodedLetterFirst = rotor.encodeLetter("a");

        String encodedLetterSecond = rotor.encodeLetter("a");

        Assert.assertEquals("g",encodedLetterFirst);
        Assert.assertEquals("d",encodedLetterSecond);
    }

    @Test
    public void rotorHappyCaseEncodeWithDifferentStartingPosition() {
        Rotor rotor = new Rotor(2);
        String encodedLetterFirst = rotor.encodeLetter("a");
        String encodedLetterSecond = rotor.encodeLetter("a");

        Assert.assertEquals("q",encodedLetterFirst);
        Assert.assertEquals("o",encodedLetterSecond);
    }

    @Test
    public void rotorHappyCaseDecode() {
        Rotor rotor = new Rotor();
        String decodedLetterFirst = rotor.decodeLetter("g");

        Assert.assertEquals("a",decodedLetterFirst);
    }

    @Test
    public void rotorHappyCaseDecode2Letters() {
        Rotor rotor = new Rotor();
        String decodedLetterFirst = rotor.decodeLetter("g");
        String decodedLetterSecond = rotor.decodeLetter("d");

        Assert.assertEquals("a",decodedLetterFirst);
        Assert.assertEquals("a",decodedLetterSecond);
    }

    @Test
    public void rotorHappyCaseDecode2LettersWithOffset() {
        Rotor rotor = new Rotor(2);
        String decodedLetterFirst = rotor.decodeLetter("q");
        String decodedLetterSecond = rotor.decodeLetter("o");

        Assert.assertEquals("a",decodedLetterFirst);
        Assert.assertEquals("a",decodedLetterSecond);
    }

    @Test
    public void rotorHappyCaseEncodeWord() {
        Rotor rotor = new Rotor();
        String encodedWord = rotor.encodeWord("cat");

        Assert.assertEquals("qdl",encodedWord);
    }

    @Test
    public void rotorHappyCaseEncodeWordWithOffset() {
        Rotor rotor = new Rotor(2);
        String encodedWord = rotor.encodeWord("cat");

        Assert.assertEquals("xoy",encodedWord);
    }

    @Test
    public void rotorHappyCaseDecodeWord() {
        Rotor rotor = new Rotor();
        String encodedWord = rotor.decodeWord("qdl");

        Assert.assertEquals("cat",encodedWord);
    }

    @Test
    public void rotorHappyCaseDecodeWordWithOffset() {
        Rotor rotor = new Rotor(2);
        String encodedWord = rotor.decodeWord("xoy");

        Assert.assertEquals("cat",encodedWord);
    }
//encoding/decoding long strings and with a large offset

}