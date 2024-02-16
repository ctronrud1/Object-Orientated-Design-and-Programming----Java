// ******************************************************************
// Task5_ChangingPeople.java
//
// Demonstrates parameter passing -- contains a method that changes
// two Person objects.
// ******************************************************************
public class Task5_ChangingPeople {
    // ---------------------------------------------------------
    // Sets up two person objects, one integer, and one String
    // object. These are sent to a method that should make
    // some changes.
    // ---------------------------------------------------------
    public static void main(String[] args) {
        Person person1 = new Person("Sally", 13);
        Person person2 = new Person("Sam", 15);
        int age = 21;
        String name = "Jill";

        System.out.println("\nParameter Passing... Original values...");
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("age: " + age + "\tname: " + name + "\n");

        changePeople(person1, person2, age, name);

        System.out.println("\nValues after calling changePeople...");
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("age: " + age + "\tname: " + name + "\n");
    }

    // -------------------------------------------------------------------
    // Changes the first actual parameter to "Jack - Age 101" and changes
    // the second actual parameter to have the age and name given in the
    // third and fourth parameters.
    // -------------------------------------------------------------------
    public static void changePeople(Person p1, Person p2, int age, String name) {
        System.out.println("\nInside changePeople... Original parameters...");
        System.out.println("person1: " + p1);
        System.out.println("person2: " + p2);
        System.out.println("age: " + age + "\tname: " + name + "\n");

        // Change the values of p1 and p2
        p1.changeName("Jack");
        p1.changeAge(101);
        p2.changeName(name);
        p2.changeAge(age);

        System.out.println("\nInside changePeople... Changed values...");
        System.out.println("person1: " + p1);
        System.out.println("person2: " + p2);
        System.out.println("age: " + age + "\tname: " + name + "\n");
    }
}
