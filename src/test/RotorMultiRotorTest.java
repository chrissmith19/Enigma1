package test;

import main.Rotor;
import main.RotorManager;
import org.junit.Assert;
import org.junit.Test;

public class RotorMultiRotorTest {

    @Test
    public void encodeTwoRotorsOneLetter() {
        RotorManager rotor = new RotorManager(0,0);
        String encodedLetter = rotor.encodeLetter("a");

            Assert.assertEquals("u", encodedLetter);
    }

    @Test
    public void encodeTwoRotorsTwoLetters() {
        RotorManager rotor = new RotorManager(0,0);
        String encodedLetterfirst = rotor.encodeLetter("a");
        String encodedLettersecond = rotor.encodeLetter("a");

        Assert.assertEquals("u", encodedLetterfirst);
        Assert.assertEquals("q", encodedLettersecond);
    }

    @Test
    public void encodeTwoRotorsWord() {
        RotorManager rotor = new RotorManager(0,0);
        String encodedWord = rotor.encodeWord("cat");

        Assert.assertEquals("pqi", encodedWord);
    }

    @Test
    public void decodeTwoRotorsOneLetter() {
        RotorManager rotor = new RotorManager(0,0);
        String decodedLetter = rotor.decodeLetter("u");

        Assert.assertEquals("a", decodedLetter);
    }

    @Test
    public void decodeTwoRotorsTwoLetters() {
        RotorManager rotor = new RotorManager(0,0);
        String decodedLetterfirst = rotor.decodeLetter("u");
        String decodedLettersecond = rotor.decodeLetter("q");

        Assert.assertEquals("a", decodedLetterfirst);
        Assert.assertEquals("a", decodedLettersecond);
    }

    @Test
    public void decodeTwoRotorsWordEncode() {
        RotorManager rotor = new RotorManager(0,0);
        String decodedWord = rotor.decodeWord("pqi");

        Assert.assertEquals("cat", decodedWord);
    }

    @Test
    public void encodeTwoRotorsOneLetterWithOffset() {
        RotorManager rotor = new RotorManager(2,2);
        String encodedLetter = rotor.encodeLetter("a");

        Assert.assertEquals("e", encodedLetter);
    }

    @Test
    public void encodeTwoRotorsTwoLettersWithOffset() {
        RotorManager rotor = new RotorManager(2,2);
        String encodedLetterfirst = rotor.encodeLetter("a");
        String encodedLettersecond = rotor.encodeLetter("a");

        Assert.assertEquals("e", encodedLetterfirst);
        Assert.assertEquals("p", encodedLettersecond);
    }

    @Test
    public void encodeTwoRotorsWordWithOffSet() {
        RotorManager rotor = new RotorManager(2,2);
        String encodedWord = rotor.encodeWord("cat");

        Assert.assertEquals("hpj", encodedWord);
    }

    @Test
    public void decodeTwoRotorsOneLetterWithOffSet() {
        RotorManager rotor = new RotorManager(2,2);
        String decodedLetter = rotor.decodeLetter("e");

        Assert.assertEquals("a", decodedLetter);
    }

    @Test
    public void decodeTwoRotorsTwoLettersWithOffSet() {
        RotorManager rotor = new RotorManager(2,2);
        String decodedLetterfirst = rotor.decodeLetter("e");
        String decodedLettersecond = rotor.decodeLetter("p");

        Assert.assertEquals("a", decodedLetterfirst);
        Assert.assertEquals("a", decodedLettersecond);
    }

    @Test
    public void decodeTwoRotorsWordEncodeWithOffSet() {
        RotorManager rotor = new RotorManager(2,2);
        String decodedWord = rotor.decodeWord("hpj");

        Assert.assertEquals("cat", decodedWord);
    }

    @Test
    public void decodeTwoRotorsWordEncodeWithOffSetLong() {
        RotorManager rotor = new RotorManager(0,0);
        String decodedWord = rotor.encodeWord("aaaaaaaaaaaaaaaaaaaaaaaaaa");

        Assert.assertEquals("uqpvzkedjfcxnbwtrolmgihysm", decodedWord);
    }

    @Test
    public void decodeTwoRotorsWordEncodeWithOffSetLongAndNotchNotInMiddle() {
        RotorManager rotorManager = new RotorManager(0,0);
        Rotor rotor= new Rotor(0);
        rotor.setRotorNotch(25);
        rotorManager.setRightRotor(rotor);

        String decodedWord = rotorManager.encodeWord("aaaaaaaaaaaaaaaaaaaaaaaaaa");

        Assert.assertEquals("uqpvzkedjfcxnbwtrolmgihycm", decodedWord);
    }
}