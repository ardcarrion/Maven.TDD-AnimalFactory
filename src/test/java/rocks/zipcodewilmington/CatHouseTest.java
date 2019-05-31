package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void addTest() {
        String givenName = "Luna";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(givenName,birthDate);
        CatHouse.clear();
        CatHouse.add(cat);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByCatTest() {
        String givenName = "Luna";
        Date birthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName,birthDate,givenId);
        CatHouse.clear();

        CatHouse.add(cat);
        CatHouse.remove(cat);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {
        String givenName = "Leo";
        Date birthDate = new Date();
        Integer givenId = 0;
        Cat leo = new Cat(givenName, birthDate, givenId);
        CatHouse.clear();

        CatHouse.add(leo);
        CatHouse.remove(givenId);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest() {
        String givenName = "Leo";
        Date birthDate = new Date();
        Integer givenId = 0;
        Cat leo = new Cat(givenName, birthDate, givenId);
        CatHouse.clear();

        CatHouse.add(leo);
        Cat expected = leo;
        Cat actual = CatHouse.getCatById(givenId);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest() {
        Cat ninja = new Cat(null,null,0);
        Cat newCat = new Cat(null,null,1);
        CatHouse.clear();
        CatHouse.add(ninja);
        CatHouse.add(newCat);
        Integer expected = 2;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

}
