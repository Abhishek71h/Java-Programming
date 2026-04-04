package OOPS_Designing;

public class inheritance {
    public static void main(String args[]) {
        // Create an Object
        //Human obj1 = new Human();
        // By the help of dot(.) operator we can access data member of class
        // obj1.age = 20;
        // System.out.println("Age of Human is: " + obj1.age);
        // obj1.weight = 98;
        // System.out.println("weight of Human is: " + obj1.weight);
        // Accessing methods of class
        // obj1.eat();

        // Human obj2 = new Human(20, 100);
        // System.out.println("Age of Human is: " + obj2.age);
        // System.out.println("weight of Human is: " + obj2.weight);

        // Single-Level Inhertance
        Male alpha = new Male();
        alpha.sleep();

        // Multi-Level Inhertance
        Scorpio fav = new Scorpio();
        fav.intro();
    }
}

class Male extends Human {

}

class Human {
    // data member
    int age;
    int weight;

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
        System.out.println("Inside the no-arg Constructor creating object");
    }

    // parameterized Constructor
    public Human(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }
}

class Mahindra extends Car{
    int rating;

    void intro() {
        System.out.println("Car is Mahindra");
    }
}

class Scorpio extends Mahindra{

}

class Car {
    String color;
    int weight;

    void run() {
        System.out.println("Car is running");
    }

    void breakCar() {
        System.out.println("Car is breaking");
    }
}