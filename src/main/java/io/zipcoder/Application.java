package io.zipcoder;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    List<String> pets = new ArrayList<String>();
    public void play() {
        // Pet petname = new Pet();


        Scanner input = new Scanner(System.in);

        System.out.println("How many pets do you have ");

        int n = input.nextInt();

        System.out.println("What kind of pets do you have? ");

        for (int i = 0; i <= n; i++) {

            String s = input.nextLine();
            pets.add(s);
        }

        for(int i=0;i<pets.size();i++){
            System.out.println(pets.get(i));
        }
        System.out.println("What is pet name?");

        // System.out.println("Enter 1 for Dog, 2 for Cat and 3 for Cow");

        for(int i=0;i<n;i++) {
            String name = input.nextLine();
        }

        System.out.println("Enter 1 for dog 2 for cat 3 for cow ");
        for(int i=0;i<n;i++){
             int k=input.nextInt();
             String selectPet;
            Pet p= new Pet();
            Dog dog= new Dog();
            Cat cat = new Cat();
            Cow cow = new Cow();
            Pet pet1 = new Pet("Blacky");
            Pet pet2 = new Pet("Browny");
            Pet pet3 = new Pet("Whitie");


              switch (k) {
                  case 1:
                      selectPet = "Dog";
                      p.setName(pet1.toString());
                     // p.setName(pets.get(j));
                      System.out.println(p.getName());
                      System.out.println(dog.speak());
                      break;

                  case 2:
                      selectPet = "Cat";
                      p.setName(pet2.toString());
                      System.out.println(p.getName());
                      System.out.println(cat.speak());
                      break;

                  case 3:
                      selectPet = "Cow";
                      p.setName(pet3.toString());
                      System.out.println(p.getName());
                      System.out.println(cow.speak());
                      break;
                  default:
                      selectPet = "Invalid pet";
                      System.out.println("Invalid pet");

                      break;
              }

        }

    }



}