package io.zipcoder;

public class Pet {

    private String name;

    public Pet(String name){
        this.name=name;
    }


    public Pet(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String speak() {
        return null;

    }

    @Override
    public String toString() {
        //return "Pet{" + "name='" + name + '\'' + '}';
        return name;
    }
}
