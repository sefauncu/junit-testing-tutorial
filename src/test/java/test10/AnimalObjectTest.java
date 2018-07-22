package test10;

import animal.Animal;
import animal.Cat;
import org.junit.Assert;
import org.junit.Test;

public class AnimalObjectTest {

    @Test
    public void getAnimal(){
        String name = "Pamuk";
        Animal animal = new Cat(name);
        Assert.assertTrue(animal.getName().equals(name));
    }
}
