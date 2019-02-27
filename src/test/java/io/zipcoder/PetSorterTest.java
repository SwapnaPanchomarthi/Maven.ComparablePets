package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.*;

public class PetSorterTest {
    PetTracker petTracker = new PetTracker();

    @Test
    public void sortTest() {
        Pet[] pet = new Pet[3];

        Pet pet3 = new Pet("Blacky");
        Pet pet1 = new Pet("Catty");
        Pet pet2 = new Pet("Awe");


        //When
        petTracker.addPet(pet3);
        petTracker.addPet(pet1);
        petTracker.addPet(pet2);
        Pet[] petsToSort = {pet2, pet3, pet1};

        PetSorter petSorter = new PetSorter(petsToSort);
        Comparator<Pet> comparator = ((Comparator<Pet>) new PetComparator());
        //PetComparator petcomp = new PetComparator();
        Pet[] actual = petSorter.sort(comparator);


        System.out.println(Arrays.toString(actual));

        //then
        Assert.assertEquals(petsToSort, actual);

    }

}