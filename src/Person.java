import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings = new ArrayList<>();
    private List<Person> children = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();


    public Person(String name, String lastName, int age, String sex){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, String sex){
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addParents(Person mother, Person father){
        this.mother = mother;
        this.father = father;
    }

    public void addChild(Person child){
        this.children.add(child);
    }

    public void addPet(Pet pet){
        this.pets.add(pet);
    }

    public void addSibling(Person sibling){
        this.siblings.add(sibling);
    }

    public void getGrandChildren(Person grandChild){
        return
    }

/*    Om de methode `getGrandChildren()` te maken, waarbij je de kleinkinderen van een persoon wilt ophalen, is het belangrijk om goed te begrijpen wat kleinkinderen zijn. Zoals je in de tip al ziet: **kleinkinderen zijn de kinderen van de kinderen van een persoon**.

    Laten we stap voor stap doorlopen hoe je deze methode kunt ontwerpen.

            ### Stap 1: Begrijp de relaties

- **Ouders** hebben kinderen, en deze kinderen kunnen op hun beurt ook weer kinderen hebben. De kinderen van jouw kinderen zijn je kleinkinderen.
            - Je hebt een lijst van kinderen beschikbaar in de `Person`-klasse (zoals `children`), en elk kind is zelf ook een `Person`-object.
- Om de kleinkinderen te vinden, moet je eerst door je eigen lijst van kinderen lopen, en voor elk kind in die lijst moet je weer door hun lijst van kinderen lopen.

### Stap 2: Algoritme in gedachten

1. **Begin bij de ouder:** Je hebt een persoon, bijvoorbeeld `this` (de huidige instantie van de persoon).
            2. **Doorloop de kinderen van deze persoon:** Gebruik een `for`-loop om door alle kinderen te lopen, omdat zij mogelijk weer kinderen hebben.
            3. **Doorloop de kinderen van elk kind:** Voor elk kind van de huidige persoon moet je nogmaals door de kinderen van dat kind lopen (dit zijn de kleinkinderen).
            4. **Verzamel de kleinkinderen:** Wanneer je bij de kinderen van je kinderen bent, voeg je deze toe aan een lijst.

### Stap 3: Gebruik van lussen

- Een **tweede lus** is nodig, omdat je eerst door de lijst van kinderen moet lopen, en daarna door de lijst van hun kinderen (de kleinkinderen).

            ### Stap 4: Teruggeven van de verzamelde kleinkinderen

    Je wilt alle kleinkinderen in een lijst verzamelen en deze uiteindelijk teruggeven.

            ---

            ### Plan voor de methode `getGrandChildren()`:

            1. Maak een lege lijst waarin je de kleinkinderen zult verzamelen.
            2. Loop door de lijst van kinderen van de huidige persoon.
            3. Voor elk kind, kijk of ze kinderen hebben.
4. Voeg deze kinderen (kleinkinderen) toe aan de lijst van kleinkinderen.
            5. Geef de verzamelde lijst van kleinkinderen terug.

---

        ### Probeer eerst zelf een methode te schrijven met behulp van dit plan:

            - Gebruik een `List<Person>` om de kleinkinderen te verzamelen.
- Denk na over de lussen: Eén lus om door je kinderen te gaan, en binnen die lus een andere lus om door de kinderen van je kinderen te gaan.
- Vergeet niet de methode te eindigen door de lijst van kleinkinderen terug te geven.

    Probeer het en laat me weten als je verdere tips of bevestiging nodig hebt!*/

}


