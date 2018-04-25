package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

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
        Date birthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, birthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(birthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);

    }

    @Test
    public void setNameTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        String givenName = "Zula";

        // When
        cat.setName(givenName);

        // Then
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);


    }

    @Test
    public void speakTest() {
        // Given (a cat)
        Cat cat = new Cat(null, null, null);
        String givenSpeak = "meow!";

        // When( the cat speaks)
        String whatever = cat.speak();

        // Then (we expect a meow)
        Assert.assertEquals(givenSpeak, whatever);

    }

    @Test
    public void setBirthDateTest() {
        // Given (a cat)
        Date givenbirthDate = new Date();
        Cat cat = new Cat(null, givenbirthDate, null);

        // When( we retrieve the birthday)
        Date retrievedBirthDate = cat.getBirthDate();


        // Then (we expect to retrieve the birthday we set)
        Assert.assertEquals(givenbirthDate, retrievedBirthDate);

    }

    @Test
    public void eatTest(){
        // Given (a cat that eats)
        Cat cat = new Cat(null, null, null);
        Food catFood = new Food();
        int givenNumberOfMealsEaten = cat.getNumberOfMealsEaten();


        // When(the cat eats)
        cat.eat(catFood);
        int retrieveNumberOfMealsEaten = cat.getNumberOfMealsEaten();


        // Then (we expect the cat to eat food)
        Assert.assertEquals(givenNumberOfMealsEaten + 1, retrieveNumberOfMealsEaten);
    }

    @Test
    public void getIdTest(){
        // Given (a cat that has an ID)
        int givenId = 2468;
        Cat cat = new Cat(null, null, givenId);


        // When(we retrieve the ID)
        int retrieveCatId = cat.getId();


        // Then (we expect to get the ID we set for the cat)
        Assert.assertEquals( givenId , retrieveCatId);
    }

    @Test
    public void animalInheritanceTest(){
        //Given(A cat)
        Cat cat = new Cat(null, null,null);


        //When(we ask if the cat inherits from the Mammal class)
        boolean catAnimalInheritance = (cat instanceof Animal);


        //Then(We expect the output to be true)
        Assert.assertEquals(true, catAnimalInheritance);

    }

    @Test
    public void mammalInheritanceTest(){
        //Given(A cat)
        Cat cat = new Cat(null, null,null);


        //When(we ask if the cat inherits from the Mammal class)
        boolean catMammalInheritance = (cat instanceof Mammal);


        //Then(We expect the output to be true)
        Assert.assertEquals(true, catMammalInheritance);


    }

}
