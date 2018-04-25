package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
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
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Lula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);


        // Then
        int retrievedNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, retrievedNumberOfCats);
    }

    @Test
    public void addTest() {
        // Given (some
        Cat cat = AnimalFactory.createCat(null, null);


        // When
        CatHouse.add(cat);
        Cat cat2Point0 = CatHouse.getCatById(cat.getId());

        // Then
        Assert.assertEquals(cat, cat2Point0);


    }

    @Test
    public void removeByIdTest(){
        //Given
        Cat animal = AnimalFactory.createCat(null, null);
        Integer animalId = animal.getId();


        //When
        CatHouse.add(animal);
        CatHouse.remove(animalId);
        Cat animal2Point0 = CatHouse.getCatById(animal.getId());


        //Then
        Assert.assertEquals(null, animal2Point0);


    }

    @Test
    public void removeByCatTest(){
        //Given
        Cat animal = AnimalFactory.createCat(null, null);


        //When
        CatHouse.add(animal);
        CatHouse.remove(animal);
        Cat animal2Point0 = CatHouse.getCatById(animal.getId());


        //Then
        Assert.assertEquals(null, animal2Point0);


    }


    @Test
    public void getCatByIdtest(){
        //Given
        CatHouse.clear();
        Cat animal = AnimalFactory.createCat(null , null);

        //When
        int catHouseSize = CatHouse.getNumberOfCats();
        CatHouse.add(animal);
        int retreivedId = animal.getId();


        //Then
        Assert.assertEquals(catHouseSize, retreivedId);


    }
}

