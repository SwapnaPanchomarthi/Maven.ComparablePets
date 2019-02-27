package io.zipcoder;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {
    public int compare(Pet o1, Pet o2) {
        String o1Name = o1.getName();
        String o2Name = o2.getName();
        int petNameSort = o1Name.compareTo(o2Name);
        return petNameSort;
    }

}

