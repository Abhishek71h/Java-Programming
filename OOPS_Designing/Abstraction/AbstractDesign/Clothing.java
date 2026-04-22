package OOPS_Designing.Abstraction.AbstractDesign;

public class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.2;
    }

    @Override
    double calculateTax() {
        return price * 0.17;
    }

    @Override
    double calculateShippingCost() {
        return 20.0;
    }
}