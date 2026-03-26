package Arrays;

public class pairsArray {
    public static void pairs(int arr[], int n) {
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int arr[] = {2,4,6,8,10};
        int n = arr.length;
        pairs(arr, n);
    }
}
