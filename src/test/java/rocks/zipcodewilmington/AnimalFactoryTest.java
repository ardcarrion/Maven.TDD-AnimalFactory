package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDog() {
        // Given (dog data)
        String givenName = "Rufus";
        Date givenBirthDate = new Date();

        // When (a dog is constructed)
        Dog rufus = AnimalFactory.createDog(givenName, givenBirthDate);

        // When (we retrieve data from the cat)
        String retrievedName = rufus.getName();
        Date retrievedBirthDate = rufus.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }

    @Test
    public void createCat() {
        // Given (cat data)
        String givenName = "Luna";
        Date givenBirthDate = new Date();

        // When (a cat is constructed)
        Cat luna = AnimalFactory.createCat(givenName, givenBirthDate);

        // When (we retrieve data from the luna)
        String retrievedName = luna.getName();
        Date retrievedBirthDate = luna.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }
}
