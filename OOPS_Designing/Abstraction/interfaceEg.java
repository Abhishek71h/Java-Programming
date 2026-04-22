package OOPS_Designing.Abstraction;

interface Bird {
    void fly();

    void eat();
}

class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow Flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow Eating");
    }

}

class Crow implements Bird {

    @Override
    public void fly() {
        System.out.println("Crow Flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow Eating");
    }

}

public class interfaceEg {

    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
    }
    public static void main(String args[]) {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}