package io.zipcoder;

public enum PetEnum {
    Dog("Blacky", 2,"Bark"), Cat("Browny", 1, "Meow"), Cow("Whitie", 12, "Moo");

public String name;
public int age;
public String speak;

    PetEnum() {


    }

    PetEnum (String petName, int petAge, String petSpeak){
    petName=name;
    petAge = age;
    petSpeak=speak;
    }
    PetEnum  (String petName){
        petName=name;

    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getSpeak(){
        return speak;
    }
}


