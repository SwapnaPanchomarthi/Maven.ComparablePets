package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
Dog dog=new Dog();
    @Test
    public void speak() {

        //Given
        String expected="Bark!";

        //When
        String  actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }
}