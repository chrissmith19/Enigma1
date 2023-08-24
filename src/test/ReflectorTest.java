package test;

import main.Reflector;
import main.RotorValues;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ReflectorTest {

    @Test
    public void reflectorHappyCaseA() {
        Reflector reflector = new Reflector();
        String reflectedLetter = reflector.getReflectedLetter("a");
        Assert.assertEquals("z", reflectedLetter);
    }


    @Test
    public void reflectorHappyCaseF() {
        Reflector reflector = new Reflector();
        String reflectedLetter = reflector.getReflectedLetter("f");
        Assert.assertEquals("u", reflectedLetter);
    }

    @Test
    public void test(){
        char a= 'a';
        System.out.print(a);
        a+=1;
        System.out.print(a);
    }

    @Test
    public void testEnum(){
        System.out.print(RotorValues.rotor1.toString());
    }

    @Test
    public void poctest2(){
        ArrayList keyList = new ArrayList(){{
            add("a");
            add("b");
            add("c");
            add("d");
        }};
        ArrayList valueList = new ArrayList(){{
            add("d");
            add("c");
            add("a");
            add("b");
        }};

        String key = "a";
        int keyPosition = keyList.indexOf(key);
        keyPosition+=1;
        String value = valueList.get(keyPosition).toString();

        System.out.print(key+" -> " + value);
    }



}