package io.zipcoder.pets;

/**
 * Created by nathanielholloway on 9/26/16.
 */
public class Pet {
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
}
