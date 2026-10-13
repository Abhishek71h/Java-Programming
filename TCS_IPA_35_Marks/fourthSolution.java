package TCS_IPA_35_Marks;
import java.util.*;

public class fourthSolution {

    public static int countOfLaptopsByBrand(Laptop[] arr, String brand) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].getBrand().equalsIgnoreCase(brand) && arr[i].getRating() > 3) {
                count++;
            }
        }
        return count;
    }

    public static Laptop[] searchLaptopByOsType(Laptop[] arr, String osType) {
        List<Laptop> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i].getOsType().equalsIgnoreCase(osType)) {
                list.add(arr[i]);
            }
        }
        if(list.size() == 0) {
            return null;
        }
        Collections.sort(list, (a,b) -> Integer.compare(
            b.getLaptopId(),
            a.getLaptopId()
        ));
        return list.toArray(new Laptop[0]);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Laptop [] arr = new Laptop[n];
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            int e = sc.nextInt();
            sc.nextLine();
            arr[i] = new Laptop(a, b, c, d, e);
        }
        String brand = sc.nextLine();
        String osType = sc.nextLine();

        int ans1 = countOfLaptopsByBrand(arr, brand);
        if(ans1>0) {
            System.out.println(ans1);
        }
        else {
            System.out.println("The given brand is not available");
        }

        Laptop[] ans2 = searchLaptopByOsType(arr, osType);
        if(ans2 != null) {
            for(int i=0; i<ans2.length; i++) {
                System.out.println(ans2[i].getLaptopId());
                System.out.println(ans2[i].getRating());
            }
        }
        else {
            System.out.println("The given os is not available");
        }
        sc.close();
    }
}

class Laptop {
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    public int getLaptopId() {
        return laptopId;
    }
        public String getBrand() {
        return brand;
    }
        public String getOsType() {
        return osType;
    }
        public double getPrice() {
        return price;
    }
        public int getRating() {
        return rating;
    }
}