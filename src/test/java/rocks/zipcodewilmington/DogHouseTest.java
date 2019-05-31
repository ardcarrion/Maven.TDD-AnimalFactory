package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void addTest() {
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        DogHouse.add(dog);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByDogTest(){
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogByIdTest() {
        String name = "Milo";
        Date birthDate = new Date();
        Integer givenId = 0;
        Dog leo = new Dog(name,birthDate, givenId);
        DogHouse.clear();

        DogHouse.add(leo);
        DogHouse.remove(givenId);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getDogByIdTest() {
        String name = "Milo";
        Date birthDate = new Date();
        Integer givenId = 0;
        Dog midnight = new Dog(name,birthDate, givenId);
        DogHouse.clear();

        DogHouse.add(midnight);
        Dog expected = midnight;
        Dog actual = DogHouse.getDogById(givenId);
        Assert.assertEquals(expected, actual);
    }

}
