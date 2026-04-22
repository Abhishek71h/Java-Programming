package OOPS_Designing.Abstraction;

abstract class Bird {
    abstract void fly();

    abstract void eat();
}

class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow Flying");
    }

    @Override
    void eat() {
        System.out.println("Sparrow Eating");
    }

}

class Crow extends Bird {

    @Override
    void fly() {
        System.out.println("Crow Flying");
    }

    @Override
    void eat() {
        System.out.println("Crow Eating");
    }

}

public class AbstractionEg {

    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
    }
    public static void main(String args[]) {
        // Bird b = new Sparrow();
        // b.eat();
        // b.fly();

        // b = new Crow();
        // b.eat();
        // b.fly();

        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}
