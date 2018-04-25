package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
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
        int retrievedNumberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1, retrievedNumberOfDogs);
    }

    @Test
    public void addTest() {
        // Given (some
        Dog dog = AnimalFactory.createDog(null, null);


        // When
        DogHouse.add(dog);
        Dog dog2Point0 = DogHouse.getDogById(dog.getId());

        // Then
        Assert.assertEquals(dog, dog2Point0);


    }

    @Test
     public void removeByIdTest(){
        //Given
         Dog animal = AnimalFactory.createDog(null, null);
         Integer animalId = animal.getId();


        //When
        DogHouse.add(animal);
        DogHouse.remove(animalId);
        Dog animal2Point0 = DogHouse.getDogById(animal.getId());


        //Then
        Assert.assertEquals(null, animal2Point0);


    }

    @Test
     public void removeByDogTest(){
        //Given
        Dog animal = AnimalFactory.createDog(null, null);


        //When
        DogHouse.add(animal);
        DogHouse.remove(animal);
        Dog animal2Point0 = DogHouse.getDogById(animal.getId());


        //Then
        Assert.assertEquals(null, animal2Point0);


    }


    @Test
     public void getDogByIdtest(){
        //Given
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog(null , null);

        //When
        int dogHouseSize = DogHouse.getNumberOfDogs();
        DogHouse.add(animal);
        int retreivedId = animal.getId();


        //Then
        Assert.assertEquals(dogHouseSize, retreivedId);


    }

}
