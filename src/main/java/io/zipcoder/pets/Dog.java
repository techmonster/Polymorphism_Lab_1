package io.zipcoder.pets;

/**
 * Created by nathanielholloway on 9/26/16.
 * This class contains the Dog object model.
 */
public class Dog extends Pet {


    public Dog(String name){
        this.name = name;
    }

    @Override
    public String speak() {
        return "Woof, Woof!";
    }
}
