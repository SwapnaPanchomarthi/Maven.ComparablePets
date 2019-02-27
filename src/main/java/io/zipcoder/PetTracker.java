package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class PetTracker {

    List<Pet> petList = new ArrayList<Pet>();
    int numOfPets = 3;
    Pet pet = new Pet();
    private Pet pet1;

    public PetTracker(){

    }

    public void addPet(Pet pet1){
        this.pet1=pet1;

                petList.add(pet1);

        }

        public int getNumOfPets(){
        return petList.size();
        }
    }

