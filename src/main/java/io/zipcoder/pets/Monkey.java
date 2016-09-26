package io.zipcoder.pets;

/**
 * Created by nathanielholloway on 9/26/16.
 * This contains the Monkey object model.
 */
public class Monkey extends Pet {

    public Monkey(String name){
        this.name = name;
    }

    @Override
    public String speak() {
        return "Ooo Ooo ah ahh ahhh ahhh!";
    }
}
