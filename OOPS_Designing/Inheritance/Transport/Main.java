package OOPS_Designing.Inheritance.Transport;

public class Main {
    public static void main(String args[]) {
        Car c = new Car("Maruti", "800", 4, 5, "Automatic");
        c.startEngine();
        c.startAc();
        c.stopEngine();

        MotorCycle m = new MotorCycle("Royal-Enfield", "Bullet", 2, "U", "Soft");
        m.startEngine();
        m.Wheelie();
        m.stopEngine();
    }
}
