import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    void addParents() {
        //Arrange
        Person personTestDad = new Person("Piet", "Jansen", 30, "Man");
        Person personTestMom = new Person("Annie", "Jansen", 34, "Vrouw");
        Person personTestKid = new Person("Job", "Jansen", 5, "Man");
        //Act
        personTestKid.addParents(personTestMom, personTestDad);
        //Assert
        assertEquals(personTestMom, personTestKid.getMother());
        assertEquals(personTestDad, personTestKid.getFather());

    }

    @Test
    void addChild() {
        //Arrange
        Person personTestDad = new Person("Piet", "Jansen", 30, "Man");
        Person personTestMom = new Person("Annie", "Jansen", 34, "Vrouw");
        Person personTestKid = new Person("Job", "Jansen", 5, "Man");
        //Act
        personTestMom.addChild(personTestKid);
        personTestDad.addChild(personTestKid);
        //Assert
        assertEquals("Job", personTestMom.getChildren().getFirst().getName());
        assertEquals("Job", personTestDad.getChildren().getFirst().getName());

    }

    @Test
    void addPet() {
        //Arrange
        Person dogOwner = new Person("Jan", "de Jong", 24, "Man");
        Pet dog = new Pet("Lizzy", 3, "Labrador");
        //Act
        dogOwner.addPet(dog);
        //Assert
        assertEquals("Lizzy", dogOwner.getPets().getFirst().getName());
    }

    @Test
    void addSibling() {
        //Arrange
        Person brother = new Person("Kaj", "Maassen", 22, "Man");
        Person sister = new Person("Bo", "Maassen", 26, "Vrouw");
        //Act
        brother.addSibling(sister);
        //Assert
        assertEquals("Bo", brother.getSiblings().getFirst().getName());
    }

    @Test
    void getGrandChildren() {
        Person personTestDad = new Person("Piet", "Jansen", 60, "Man");
        Person personTestMom = new Person("Annie", "Jansen", 64, "Vrouw");
        Person personTestKid = new Person("Job", "Jansen", 25, "Man");
        Person personTestGrandKid = new Person("Jorris", "Jansen", 5, "Man");

        //Act
        personTestMom.addChild(personTestKid);
        personTestDad.addChild(personTestKid);
        personTestKid.addChild(personTestGrandKid);
        //Assert
        assertEquals("Jorris", personTestMom.getGrandChildren().getFirst().getName());
        assertEquals("Jorris", personTestDad.getGrandChildren().getFirst().getName());

    }
}