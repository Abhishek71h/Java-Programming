package OOPS_Designing.Abstraction.AbstractDesign;

public class Electronic extends Product {

    public Electronic(String name, double price) {
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.1;
    }

    @Override
    double calculateTax() {
        return price * 0.15;
    }

    @Override
    double calculateShippingCost() {
        return 10.0;
    }
}