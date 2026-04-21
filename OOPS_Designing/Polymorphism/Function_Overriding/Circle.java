package OOPS_Designing.Polymorphism.Function_Overriding;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle Shape Drawing");
    }

    public static void doDrawing(Shape s) {
        s.draw();
    }
}
