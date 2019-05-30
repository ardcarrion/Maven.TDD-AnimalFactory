package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Milo";

        // When (a cat's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the cat)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }


    @Test
    public void speakTest(){
        Cat cat = new Cat(null,null,null);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setBirthDateTest(){
        Cat cat = new Cat(null,null,null);
        Date givenBirthDate = new Date();
        cat.setBirthDate(givenBirthDate);
        Date retrievedBirthDate = cat.getBirthDate();
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }
    @Test
    public void eatTest(){
        Cat cat = new Cat(null, null,null);
        Food givenFood = new Food();
        cat.eat(givenFood);
        Integer expected = 1;
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getIdTest(){
        Integer givenId = 0;
        Cat cat = new Cat(null,null, givenId);
        Integer retrievedId = cat.getId();
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void animalInheritanceTest(){
        Cat cat = new Cat(null,null, null);
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest(){
        Cat cat = new Cat(null, null,null);
        Assert.assertTrue(cat instanceof Mammal);
    }
}
