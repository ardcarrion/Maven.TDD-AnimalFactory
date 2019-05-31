package rocks.zipcodewilmington;

import org.junit.Assert;
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
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog(null,null,null);
        dogHouse.add(dog);
        dogHouse.remove(dog);
        Integer expected = 0;
        Integer actual = dogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByDogTest(){
        DogHouse dogHouse1 = new DogHouse();
        Dog luna = new Dog(null,null,null);
        dogHouse1.add(luna);
        dogHouse1.remove(luna);
        Integer expected = 0;
        Integer actual = dogHouse1.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogByIdTest() {
        DogHouse dogHouse2 = new DogHouse();
        Integer givenId = 0;
        Dog leo = new Dog(null,null, givenId);
        dogHouse2.add(leo);
        dogHouse2.remove(givenId);
        Integer expected = 0;
        Integer actual = dogHouse2.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getDogByIdTest() {
        DogHouse dogHouse3 = new DogHouse();
        Integer givenId = 0;
        Dog midnight = new Dog(null,null, givenId);
        dogHouse3.add(midnight);
        Dog expected = midnight;
        Dog actual = dogHouse3.getDogById(givenId);
        Assert.assertEquals(expected, actual);
    }

}
