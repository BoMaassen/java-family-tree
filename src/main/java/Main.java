public class Main {

    public static void main(String[] args) {
        Person dad = new Person("Frank", " Maassen", 59, "Man");
        Person mom = new Person("Ellen", " Maassen", 58, "Vrouw");
        Person child = new Person("Bo", " Maassen", 26, "Vrouw");
        Person child2 = new Person("Daan", "Hendriks", 27, "Man");
        Person grandchild = new Person("grandchild", "Maassen", 1, "vrouw");

        child.addParents(dad, mom);
        dad.addChild(child);
        mom.addChild(child);
        grandchild.addParents(child2,child);
        child2.addChild(grandchild);
        child.addChild(grandchild);
        System.out.println(dad.getGrandChildren());
        System.out.println(dad.getChildren());


    }
}
