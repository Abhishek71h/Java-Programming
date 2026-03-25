package Arrays;

public class binarySearch {
    public static int binarySearching(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        while(start <= end) {
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] < key) {
                start = mid + 1;  
            }
            else {
                end = mid - 1;
            }
            mid = (start + end)/2;
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {10,20,30,40,50,60};
        int key = 60;
        int ans = binarySearching(arr, key);
        if(ans != -1) {
            System.out.println("Yes key is found at index: " + ans);
        }
        else System.out.println("No key is not found");
    }
}
