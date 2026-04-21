package OOPS_Designing.Basics;

public class basics {
    public static void main(String args[]) {
        // Create an Object
        Human obj1 = new Human();
        // By the help of dot(.) operator we can access data member of class
        obj1.age = 20;
        System.out.println("Age of Human is: " + obj1.age);
        obj1.weight = 98;
        System.out.println("weight of Human is: " + obj1.weight);
        // Accessing methods of class
        obj1.eat();

        Human obj2 = new Human(20, 100);
        System.out.println("Age of Human is: " + obj2.age);
        System.out.println("weight of Human is: " + obj2.weight);

        System.out.println("Number of object created: " + Human.count);

        Human.update();
        System.out.println("Number of object created: " + Human.count);
    }
}

class Human {
    // data member
    int age;
    int weight;
    // static data member belongs to class rather than objects
    // static data member has 3 properties
    //(a): It is one for all objects
    //(b): It represent class property
    //(c): It requires less space
    static int count = 0;

    // behaviour
    void sleep() {
        System.out.println("Human is Sleeping");
    }
    void eat() {
        System.out.println("Human is Eating");
    }

    // Default Constructor

    // 2 Types: (a): no-arg Constructor & (b): parameterized Constructor

    // no-arg Constructor
    public Human() {
        count++;
        System.out.println("Inside the no-arg Constructor creating object");
    }

    // parameterized Constructor
    public Human(int age, int weight) {
        this(); // accessing -> data members, data functions and constructor
        count++;
        this.age = age;
        this.weight = weight;
    }

    // static methods -> It only change static members
    static void update() {
        count++;
    }
}