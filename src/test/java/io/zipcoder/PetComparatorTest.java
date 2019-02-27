package io.zipcoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetComparatorTest {
    PetTracker petTracker = new PetTracker();
    @Test
    public void compareTest() {
        //Given
        Pet pet = new Pet("Blacky");
        Pet pet1 = new Pet("Billy");
        Pet pet2 = new Pet("MooMoo");


        //When
        petTracker.addPet(pet);
        petTracker.addPet(pet1);
        petTracker.addPet(pet2);
    }
}