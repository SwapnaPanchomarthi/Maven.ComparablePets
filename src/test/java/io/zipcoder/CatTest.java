package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat cat = new Cat();
    @Test
    public void speak() {

        //Given
        String expected="Meow!";

        //When
       String  actual = cat.speak();
        System.out.println(cat.getName());

        //Then
        Assert.assertEquals(expected, actual);
    }
}