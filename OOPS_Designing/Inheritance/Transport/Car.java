package OOPS_Designing.Inheritance.Transport;

public class Car extends Vehicle {
    public int noOfDoors;
    public String trasmissionType;

    public Car(String name, String model, int noOfTyres, int noOfDoors, String trasmissionType) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.trasmissionType = trasmissionType;
        //super.startEngine();
    }

    public void startAc() {
        System.out.println("AC started of : " + name);
    }
}
