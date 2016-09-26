package io.zipcoder.pets;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nathanielholloway on 9/26/16.
 * This is the test for the Pet class.
 */
public class PetTest {

    @Test
    public void speak(){
        Pet thisPet = new Pet();
        Assert.assertNotNull("This should return the String spoken",thisPet);
    }

    @Test
    public void getName(){
        Pet thisPet = new Pet();
        thisPet.setName("This pet's name");
        String expected = "This pet's name";
        String actual = thisPet.getName();
        Assert.assertSame(expected,actual);
    }

    @Test
    public void setName(){
        Pet thisPet = new Pet();
        thisPet.setName("This pet");
        String expected = "This pet";
        String actual = thisPet.getName();
        Assert.assertSame(expected,actual);
    }
}
