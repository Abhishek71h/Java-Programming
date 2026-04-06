/*
Question: 1
Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package 
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
have more than one package type. Travel agency and package type combination is unique. All the searches should 
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000​
 */

package TCS_IPA_35_Marks;
import java.util.*;

public class firstSolution {

    public static int findAgencyWithHighestPackagePrice(TravelAgencies arr[]) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].getPrice() > maxi) {
                maxi = arr[i].getPrice();
            }
        }
        return maxi;
    }

    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies arr[], int regNo, String packageType) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i].isFlightFacility() == true) {
                if(arr[i].getRegNo() == regNo && arr[i].getpakageType().equalsIgnoreCase(packageType)) {
                    return arr[i];
                }
            }
        }
        return null;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TravelAgencies arr[] = new TravelAgencies[n];
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            boolean e = sc.nextBoolean();
            sc.nextLine();   
            arr[i] = new TravelAgencies(a, b, c, d, e);
        }
        int regNo = sc.nextInt();
        sc.nextLine();
        String packageType = sc.nextLine();

        // call Method 1
        int ans1 = findAgencyWithHighestPackagePrice(arr);
        System.out.println(ans1);

        // call Method 2
        TravelAgencies ans2 = agencyDetailsForGivenldAndType(arr, regNo, packageType);
        if(ans2 != null) {
            System.out.println(ans2.getAgencyName() + ":" + ans2.getPrice());
        }
    }
}

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getpakageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }
}