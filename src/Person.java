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

    public List<Person> getGrandChildren(){
        List<Person> grandChildren = new ArrayList<>();

        for (Person kids : children){
        if (!kids.children.isEmpty()){
            grandChildren.addAll(kids.children);
        }
        }
        return grandChildren;
    }

@Override
    public String toString(){
    return name;
}


}


