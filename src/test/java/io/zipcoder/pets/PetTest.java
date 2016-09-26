package io.zipcoder.pets;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by nathanielholloway on 9/26/16.
 * This is the test for the Pet class.
 */
public class PetTest {


        @Test
        public void speakDogTest() {
            Pet thisPet = new Dog("Frank");
            String expected = "Woof, Woof!";
            String actual = thisPet.speak();
            assertEquals(expected, actual);
        }

        @Test
        public void speakCatTest() {
            Pet thisPet = new Cat("BOB");
            String expected = "Skssss!";
            String actual = thisPet.speak();
            assertEquals(expected, actual);
        }

        @Test
        public void setPetName() {
            Pet thisPet = new Cat("Fred");
            thisPet.setName("Fred");
            String expected = "Fred";
            String actual = thisPet.getName();
            assertEquals(expected, actual);
        }

        @Test
        public void getPetName() {
            Pet thisPet = new Dog("Dan");
            thisPet.setName("Dan");
            String expected = "Dan";
            String actual = thisPet.getName();
            assertEquals(expected, actual);
        }

        @Test
        public void addPetTest(){
            PetOwner thisOwner = new PetOwner();
            Pet dog = new Dog("Frank");
            Pet cat = new Cat("Bob");
            Pet monkey = new Monkey("Dan");
            boolean petAdded = thisOwner.add(dog);
            assertTrue(petAdded);
        }



}
