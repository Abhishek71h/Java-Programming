package OOPS_Designing.Inheritance.Transport;

public class Vehicle {
    public String name; 
    public String model;
    public int noOfTyres;

    public Vehicle () {
        this.name = "";
        this.model = "";
        this.noOfTyres = 0;
    }

    public Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine() {
        System.out.println("Engine is Starting of : " + name + ": " + model);
    }

    void stopEngine() {
        System.out.println("Engine is Stoping of : " + name + ": " + model);
    }
}
