package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTrackerTest {
    PetTracker petTracker = new PetTracker();
    @Test
    public void addPetDogTest() {
        //Given
        Pet pet = new Pet("Blacky");
            int expected = 1;
       //When
        petTracker.addPet(pet);
        int actual = petTracker.getNumOfPets();
        //Then
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }
@Test
    public void addPetCatTest() {
        //Given
        Pet pet = new Pet("Billy");
        int expected = 1;
        //When
        petTracker.addPet(pet);
        int actual = petTracker.getNumOfPets();
        //Then
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }
@Test
    public void addPetCowTest() {
        //Given
        Pet pet = new Pet("MooMoo");
        int expected = 1;
        //When
        petTracker.addPet(pet);
        int actual = petTracker.getNumOfPets();
        //Then
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }
    @Test
    public void getNumOfPets() {

            //Given
            Pet pet = new Pet("Blacky");
            Pet pet1 = new Pet("Billy");
             Pet pet2 = new Pet("MooMoo");

        int expected = 3;
            //When
            petTracker.addPet(pet);
            petTracker.addPet(pet1);
             petTracker.addPet(pet2);
        int actual = petTracker.getNumOfPets();
            //Then
            Assert.assertEquals(expected, actual);
            System.out.println(actual);

    }
}