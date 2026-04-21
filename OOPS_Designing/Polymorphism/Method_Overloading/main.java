package OOPS_Designing.Polymorphism.Method_Overloading;

public class main {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        System.out.println(c.add(3, 4));
        System.out.println(c.add(3, 4, 3));
        System.out.println(c.add(3, 4, 5, 5.6));
    }
}
