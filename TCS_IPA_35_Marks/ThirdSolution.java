/*
4
501
Brand1
4.8
101
Rolling Chair
900.0
502
Brand1
3.5
102
Study Chair
1900.0
503
Brand2
4.0
103
Recliner
4500.0
504
Brand2
3.9
104
Dinning Chair
500.0
Brand1

Output:
Most Expensive Chair: Study Chair(Rs. 1900.0) by Brand 1
 */

package TCS_IPA_35_Marks;
import java.util.*;

public class ThirdSolution {

    public static Chair findMostExpensiveChairDetails(Chair arr[], String brandName) {
        Chair maxChair = null;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].getBrand().getBrandName().equalsIgnoreCase(brandName)) {
                if(maxChair == null || arr[i].getPrice() > maxChair.getPrice()) {
                    maxChair = arr[i];
                }
            }
        }
        return maxChair;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Chair arr[] = new Chair[n];

        for(int i=0; i<n; i++) {
            int brandId = sc.nextInt();
            sc.nextLine();
            String brandName = sc.nextLine();
            double rating = sc.nextDouble();

            int chairId = sc.nextInt();
            sc.nextLine();
            String type = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();

            Brand b = new Brand(brandId, brandName, rating);
            Chair c = new Chair(chairId, type, price);
            c.setBrand(b);

            arr[i] = c;
        }
        String brandName = sc.nextLine();
        Chair result = findMostExpensiveChairDetails(arr, brandName);
        if(result != null) {
            System.out.println("Most Expensive Chair: " + result.getType() + "(Rs. " + result.getPrice() + ") by " + result.getBrand().getBrandName());
        } else {
            System.out.println("No chairs found for the given brand.");
        }
    }
}

class Brand {
    private int brandId;
    private String brandName;
    private double rating;

    public Brand(int brandId, String brandName, double rating) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.rating = rating;
    }

    public int getBrandId() {
        return brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public double getRating() {
        return rating;
    }
}

class Chair {
    private int chairId;
    private String type;
    private double price;
    private Brand brand;

    public Chair(int chairId, String type, double price) {
        this.chairId = chairId;
        this.type = type;
        this.price = price;
    }

    public int getChairId() {
        return chairId;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}