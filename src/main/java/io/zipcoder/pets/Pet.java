package io.zipcoder.pets;

import java.util.ArrayList;

/**
 * Created by nathanielholloway on 9/26/16.
 */
public class Pet {
    ArrayList<Pet> kennel;

    public Pet(){
        kennel = new ArrayList<Pet>();
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "Grrrrr.";
    }

    public void printPets(){
        for (Pet p:kennel) {
            System.out.println("My name is "+p.getName() + " and I say "+ p.speak());

        }
    }
}
