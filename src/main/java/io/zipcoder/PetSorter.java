package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;

public class PetSorter {
    private Pet[] pet;
   //protected Comparator<Pet> comparator=((Comparator<Pet>) new PetComparator());

    public PetSorter(Pet[] pets){
        this.pet=pets;
    }

    public Pet[] sort(Comparator<Pet> compar) {
     Arrays.sort(this.pet, compar);
     return pet;
 }

}







