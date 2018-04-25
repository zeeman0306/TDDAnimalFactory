package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        //Given(a dog)
        String dogName = "";
        Date dogBirthdate = new Date();
        int givenDogID = AnimalFactory.createDog(dogName, dogBirthdate).getId();


        //When(we invoke the .createDog method)
        int retrieveDogID = DogHouse.getNumberOfDogs();


        //Then(the name and birthdate values should match)
        Assert.assertEquals(givenDogID, retrieveDogID);


    }

    @Test
    public void createCatTest(){
        //Given(a cat)
        String catName = "";
        Date catBirthdate = new Date();
        int givenCatID = AnimalFactory.createCat(catName, catBirthdate).getId();


        //When(we invoke the .createCat method)
        int retrieveCatID = CatHouse.getNumberOfCats();


        //Then(the name and birthdate values should match)
        Assert.assertEquals(givenCatID, retrieveCatID);


    }
}
