package Sliding_Window;

public class MaxSumofKSubarray {
    public static void main(String[] args) {
        int arr[] = {-1, 2, 3, -5, 1, -2, 4, -3, 3};
        int k = 4;
        // System.out.println(getMaxSumofSizeK(arr, k));
        System.out.println(secondMethod(arr, k));

    }

    static int secondMethod(int arr[], int k) {
        int maxSum = 0;
        for(int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        
        int lo = 0, hi = k;

        int currSum = maxSum;
        while(hi < arr.length-1) {
            currSum = currSum - arr[lo];
            lo++;
            hi++;
            currSum = currSum + arr[hi];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    static int getMaxSumofSizeK (int arr[], int k) {
        int maxSum = 0;
        for(int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        int currSum = maxSum;
        for(int i = k; i < arr.length; i++) {
            currSum = currSum - arr[i-k] + arr[i];

            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
