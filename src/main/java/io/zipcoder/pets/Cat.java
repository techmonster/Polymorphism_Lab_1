package io.zipcoder.pets;

/**
 * Created by nathanielholloway on 9/26/16.
 * This class contains the Cat model.
 */
public class Cat extends Pet {

    public Cat(String name){
        this.name = name;
    }

    @Override
    public String speak() {
        return "Skssss!";
    }
}
