package OOPS_Designing.Abstraction.AbstractDesign;

public class OnlineStore {
    public static void main(String args[]) {
        Product electronics = new Electronic("Smartphone", 500);
        Product Clothing = new Clothing("T-Shirt", 200);

        System.out.println(electronics.calculateTax());
        System.out.println(Clothing.calculateShippingCost());
    }
}
