package Arrays;

public class getLargest {
    public static int getLargestValue(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int arr[] = {24, 17, 130, 100, 87};
        int ans = getLargestValue(arr);
        System.out.println("Largest Value of Array is: " + ans);
    }
}
