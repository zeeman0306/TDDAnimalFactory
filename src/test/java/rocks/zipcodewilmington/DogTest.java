package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);


    }


    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Milo";
        Date birthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, birthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(birthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);

    }


    @Test
    public void speakTest() {
        // Given (a dog)
        Dog dog = new Dog(null, null, null);
        String givenSpeak = "bark!";

        // When( the dog speaks)
        String whatever = dog.speak();


        // Then (we expect a meow)
        Assert.assertEquals(givenSpeak, whatever);

    }


    @Test
    public void setBirthDateTest() {
        // Given (a dog)
        Date givenBirthDate = new Date();
        Dog dog = new Dog   (null, givenBirthDate, null);

        // When( the dog speaks)
        Date retrievedBirthDate = dog.getBirthDate();


        // Then (we expect a meow)
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);

    }


    @Test
    public void eatTest() {
        // Given (a dog that eats)
        Food dogFood = new Food();
        Dog dog = new Dog(null, null, null);
        int givenNumberOfMealsEaten = dog.getNumberOfMealsEaten();


        // When(the dog eats)
        dog.eat(dogFood);
        int retrieveNumberOfMealsEaten = dog.getNumberOfMealsEaten();


        // Then (we expect the dog to eat the food)
        Assert.assertEquals(givenNumberOfMealsEaten + 1, retrieveNumberOfMealsEaten);

    }


    @Test
    public void getIdTest(){
        // Given (a dog that eats)
        Dog dog = new Dog(null, null, 0);
        int dogId = dog.getId();


        // When(the dog eats)
        int retrieveDogId = dog.getId();


        // Then (we expect the dog to eat food)
        Assert.assertEquals(dogId, retrieveDogId);


    }


    @Test
    public void animalInheritanceTest(){
        //Given(A dog)
        Dog dog = new Dog(null, null,null);


        //When(we ask if the dog inherits from the Mammal class)
        boolean dogAnimalInheritance = (dog instanceof Animal);


        //Then(We expect the output to be true)
        Assert.assertEquals(true, dogAnimalInheritance);


    }


    @Test
    public void mammalInheritanceTest(){
        //Given(A dog)
        Dog dog = new Dog(null, null,null);

        //When(we ask if the dog inherits from the Mammal class)
        boolean dogMammalInheritance = (dog instanceof Mammal);

        //Then (We expect the output to be true)
        Assert.assertEquals(true, dogMammalInheritance);


    }
}
