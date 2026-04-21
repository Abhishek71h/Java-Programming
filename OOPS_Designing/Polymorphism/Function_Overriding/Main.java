package OOPS_Designing.Polymorphism.Function_Overriding;

public class Main {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.draw();
        c.doDrawing(c);
    }
}
