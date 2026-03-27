package Arrays;

public class maxSubarraySum {
    public static int maxSubarray(int arr[], int n) {
        /* Brute Force Approach
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int currSum = 0;
            for(int j=i; j<n; j++) {
                currSum = currSum + arr[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
        */

        // Kadane Algorithm -> best Approach O(n)
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<n; i++) {
            currSum = currSum + arr[i];
            if(currSum >= maxSum) {
                maxSum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String args[]) {
        int arr[] = {1,-2,6,-1,3};
        int n = arr.length;
        int ans = maxSubarray(arr, n);
        System.out.print("Max Sum of Subarray is: " + ans);
    }
}