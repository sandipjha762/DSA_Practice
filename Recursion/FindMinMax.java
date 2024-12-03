package Recursion;

public class FindMinMax {
    public static void main(String[] args) {
        int arr[] = {15, 12, 17, 8, 9};
        System.out.println(maxValue(arr, 0));
        System.out.println(minValue(arr, 0));
    }

    static int maxValue(int arr[], int idx) {
        if(idx == arr.length-1) {
            return arr[idx];
        }

        return Math.max(arr[idx], maxValue(arr, idx+1));
    }

    static int minValue(int arr[], int idx) {
        if(idx == arr.length-1) {
            return arr[idx];
        }

        return Math.min(arr[idx], minValue(arr, idx+1));
    }
}
