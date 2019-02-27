package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {
    Pet pet = new Pet();

    @Test
    public void setNameTest() {

        //Given
        String name = "Blacky";

        //When
        pet.setName(name);
        String actual = pet.getName();

        //Then
        Assert.assertEquals(name, actual);
        System.out.println(name);
    }

    @Test
    public void getNameTest() {
        //Given
        String name = "Billy";

        //When
        pet.setName(name);
        String actual = pet.getName();

        //Then
        Assert.assertEquals(name, actual);
        System.out.println(name);

    }

    @Test
    public void speakTest() {
    }
}