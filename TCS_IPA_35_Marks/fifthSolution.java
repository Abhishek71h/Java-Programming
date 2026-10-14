package TCS_IPA_35_Marks;
import java.util.*;

public class fifthSolution {

    public static Truck[] findTrucks(Truck[] arr, float value) {
        List<Truck> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i].getMilesatravelled() >= value) {
                list.add(arr[i]);
            }
        }
        if(list.size() == 0) return null;

        Collections.sort(list, (a,b) -> Float.compare (
            b.getDriver().getExperience(),
            a.getDriver().getExperience()
        ));

        Truck[] result = list.toArray(new Truck[0]);
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Truck[] arr = new Truck[n];
        for(int i=0; i<arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            float c = sc.nextFloat();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            String f = sc.nextLine();
            float g = sc.nextFloat();
            sc.nextLine();
            Driver driver = new Driver(d,e,f,g);
            arr[i] = new Truck(a,b,c,driver);
        }
        float value = sc.nextFloat();
        Truck[] ans = findTrucks(arr, value);
        System.out.println("_____________________");
        if(ans != null) {
            for(int i=0; i<ans.length; i++) {
                System.out.println(ans[i].getId());
                System.out.println(ans[i].getName());
                System.out.println(ans[i].getMilesatravelled());
                System.out.println(ans[i].getDriver().getId());
                System.out.println(ans[i].getDriver().getName());
            }
        }
        else System.out.println("No Truck Found");
    }
}

class Driver {
    private int id;
    private String name;
    private String contact;
    private float experience;

    public Driver(int id, String name, String contact, float experience) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getContact() {
        return contact;
    }
    public float getExperience() {
        return experience;
    }
}

class Truck {
    private int id;
    private String name;
    private float milesatravelled;
    private Driver driver;

    public Truck(int id, String name, float milesatravelled, Driver driver) {
        this.id = id;
        this.name = name;
        this.milesatravelled = milesatravelled;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getMilesatravelled() {
        return milesatravelled;
    }
    public Driver getDriver() {
        return driver;
    }
}