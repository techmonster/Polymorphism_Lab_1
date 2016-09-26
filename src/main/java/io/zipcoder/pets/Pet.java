package io.zipcoder.pets;

/**
 * Created by nathanielholloway on 9/26/16.
 * This class contains the Pet object model.
 */
public class Pet {

     String name;
    public Pet(){

    }
    public Pet(String name){
        this.name = name;
    }


    public static Pet createPet(String type, String name){
        if (type.equalsIgnoreCase("Dog")) {
            return new Dog(name);
        }
        if(type.equalsIgnoreCase("Cat")){
            return new Cat(name);
        }
        if(type.equalsIgnoreCase("Monkey")){
            return new Monkey(name);
        }
        return null;
    }
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
