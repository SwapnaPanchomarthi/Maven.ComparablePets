package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CowTest {
    Cow cow = new Cow();

    @Test
    public void speak() {
        //Given
        String expected="Moo!";

        //When
        String  actual = cow.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }
}