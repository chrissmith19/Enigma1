package test;

import main.Rotor;
import main.RotorManager;
import org.junit.Assert;
import org.junit.Test;

public class ThreeRotorMultiRotorTest {

    @Test
    public void encodeThreeRotorsOneLetter() {
        RotorManager rotor = new RotorManager(0,0,0);
        String encodedLetter = rotor.encodeLetter("a");

            Assert.assertEquals("k", encodedLetter);
    }

    @Test
    public void encodeThreeRotorsTwoLetters() {
        RotorManager rotor = new RotorManager(0,0,0);
        String encodedLetterfirst = rotor.encodeLetter("a");
        String encodedLettersecond = rotor.encodeLetter("a");

        Assert.assertEquals("k", encodedLetterfirst);
        Assert.assertEquals("p", encodedLettersecond);
    }

    @Test
    public void encodeThreeRotorsWord() {
        RotorManager rotor = new RotorManager(0,0,0);
        String encodedWord = rotor.encodeWord("cat");

        Assert.assertEquals("tpc", encodedWord);
    }

    @Test
    public void decodeThreeRotorsOneLetter() {
        RotorManager rotor = new RotorManager(0,0,0);
        String decodedLetter = rotor.decodeLetter("k");

        Assert.assertEquals("a", decodedLetter);
    }

    @Test
    public void decodeThreeRotorsTwoLetters() {
        RotorManager rotor = new RotorManager(0,0,0);
        String decodedLetterfirst = rotor.decodeLetter("k");
        String decodedLettersecond = rotor.decodeLetter("p");

        Assert.assertEquals("a", decodedLetterfirst);
        Assert.assertEquals("a", decodedLettersecond);
    }

    @Test
    public void decodeThreeRotorsWordEncode() {
        RotorManager rotor = new RotorManager(0,0,0);
        String decodedWord = rotor.decodeWord("tpc");

        Assert.assertEquals("cat", decodedWord);
    }

    @Test
    public void encodeThreeRotorsOneLetterWithOffset() {
        RotorManager rotor = new RotorManager(2,2,2);
        String encodedLetter = rotor.encodeLetter("a");

        Assert.assertEquals("u", encodedLetter);
    }

    @Test
    public void encodeThreeRotorsTwoLettersWithOffset() {
        RotorManager rotor = new RotorManager(2,2,2);
        String encodedLetterfirst = rotor.encodeLetter("a");
        String encodedLettersecond = rotor.encodeLetter("a");

        Assert.assertEquals("u", encodedLetterfirst);
        Assert.assertEquals("n", encodedLettersecond);
    }

    @Test
    public void encodeThreeRotorsWordWithOffSet() {
        RotorManager rotor = new RotorManager(2,2,2);
        String encodedWord = rotor.encodeWord("cat");

        Assert.assertEquals("ani", encodedWord);
    }

    @Test
    public void decodeThreeRotorsOneLetterWithOffSet() {
        RotorManager rotor = new RotorManager(2,2,2);
        String decodedLetter = rotor.decodeLetter("u");

        Assert.assertEquals("a", decodedLetter);
    }

    @Test
    public void decodeThreeRotorsTwoLettersWithOffSet() {
        RotorManager rotor = new RotorManager(2,2,2);
        String decodedLetterfirst = rotor.decodeLetter("u");
        String decodedLettersecond = rotor.decodeLetter("n");

        Assert.assertEquals("a", decodedLetterfirst);
        Assert.assertEquals("a", decodedLettersecond);
    }

    @Test
    public void decodeThreeRotorsWordEncodeWithOffSet() {
        RotorManager rotor = new RotorManager(2,2,2);
        String decodedWord = rotor.decodeWord("ani");

        Assert.assertEquals("cat", decodedWord);
    }

    @Test
    public void decodeThreeRotorsWordEncodeWithOffSetLong() {
        RotorManager rotor = new RotorManager(0,0,0);
        String decodedWord = rotor.encodeWord("aaaaaaaaaaaaaaaaaaaaaaaaaa");

        Assert.assertEquals("kptbhmoqaxdzrglwnvifucsyef", decodedWord);
    }

    @Test
    public void decodeThreeRotorsWordEncodeWithOffSetLongAndNotchNotInMiddle() {
        RotorManager rotorManager = new RotorManager(0,0,0);
        Rotor rotor= new Rotor(0);
        rotor.setRotorNotch(25);
        rotorManager.setRightRotor(rotor);

        String decodedWord = rotorManager.encodeWord("aaaaaaaaaaaaaaaaaaaaaaaaaa");

        Assert.assertEquals("kptbhmoqaxdzrglwnvifucsydf", decodedWord);
    }

    @Test
    public void decodeThreeRotorsWordEncodeWithOffSetLongAndNotchNotInMiddleFormiddleRotor() {
        RotorManager rotorManager = new RotorManager(0,0,0);
        Rotor middleRotor= new Rotor(0);
        middleRotor.setRotorNotch(1);
        rotorManager.setMiddleRotor(middleRotor);
        Rotor rightRotor= new Rotor(0);
        rightRotor.setRotorNotch(2);
        rotorManager.setRightRotor(rightRotor);

        String decodedWord = rotorManager.encodeWord("aaa");

        Assert.assertEquals("ktv", decodedWord);
    }

    @Test
    public void decodeThreeRotorsWordEncodeWithOffSetLongAndNotchNotInMiddleFormiddleRotor2() {
        RotorManager rotorManager = new RotorManager(0,0,0);
        Rotor leftRotor= new Rotor(1);
        leftRotor.setRotorNotch(2);
        rotorManager.setLeftRotor(leftRotor);
        Rotor middleRotor= new Rotor(0);
        middleRotor.setRotorNotch(1);
        rotorManager.setMiddleRotor(middleRotor);
        Rotor rightRotor= new Rotor(0);
        rightRotor.setRotorNotch(2);
        rotorManager.setRightRotor(rightRotor);

        String decodedWord = rotorManager.encodeWord("aaa");

        Assert.assertEquals("bpt", decodedWord);
    }
}