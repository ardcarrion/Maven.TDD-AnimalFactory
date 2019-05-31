package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

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
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat(null,null,null);
        catHouse.add(cat);
        Integer expected = 1;
        Integer actual = catHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByCatTest() {
        CatHouse catHouse1 = new CatHouse();
        Cat luna = new Cat(null,null,null);
        catHouse1.add(luna);
        catHouse1.remove(luna);
        Integer expected = 0;
        Integer actual = catHouse1.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {
        CatHouse catHouse2 = new CatHouse();
        Integer givenId = 0;
        Cat leo = new Cat(null,null, givenId);
        catHouse2.add(leo);
        catHouse2.remove(givenId);
        Integer expected = 0;
        Integer actual = catHouse2.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest() {
        CatHouse catHouse3 = new CatHouse();
        Integer givenId = 0;
        Cat midnight = new Cat(null,null, givenId);
        catHouse3.add(midnight);
        Cat expected = midnight;
        Cat actual = catHouse3.getCatById(givenId);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest() {
        CatHouse catHouse4 = new CatHouse();
        Cat ninja = new Cat(null,null,0);
        Cat newCat = new Cat(null,null,1);
        catHouse4.add(ninja);
        catHouse4.add(newCat);
        Integer expected = 2;
        Integer actual = catHouse4.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

}
