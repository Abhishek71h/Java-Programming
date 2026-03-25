package Arrays;

public class linearSearch {
    public static int linearSearching(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {101, 74, 48, 75, 29, 10, 4};
        int key = 10;
        int ans = linearSearching(arr, key);
        if(ans == 1) {
            System.out.println("Yes Key is Found");
        }
        else System.out.println("No Key is not Found");
    }
}
