package Recursion;

/**
 * BuyAndSellStock
 */
public class BuyAndSellStock {

    public static void main(String[] args) {
        int arr[] = {11, 6, 7, 19, 4, 1, 6, 18, 4};
        System.out.println(getMaxProfitUsing1Trans(arr));
    }

 static int getMaxProfitUsing1Trans(int arr[]){
    int n = arr.length;
    int maxProfit = 0;
    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n-1; j++){
            int diff = arr[j] - arr[i];
            maxProfit = maxProfit < diff ? diff : maxProfit;
        }
    }
    return maxProfit;
 } // TC - O(n^2) | SC - O(1)



}