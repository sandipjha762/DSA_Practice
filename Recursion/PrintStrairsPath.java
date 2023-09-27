package Recursion;

public class PrintStrairsPath {
    public static void main(String[] args) {
        int n = 10;
        String str = "";
        // getStairsPath(n, str);
        int arr[] = new int[n+1];
    //    System.out.println(getStairsPathCount(n));
    //    System.out.println(getStairsPathCount(n, arr));
       System.out.println(getStairsPathCountTab(n));

    }

    static void getStairsPath(int n, String str){

        if( n < 0 ){
            return;
        }
        if( n == 0){
            System.out.println(str);
            return;
        }

        getStairsPath(n-1, str+"1");
        getStairsPath(n-2, str+"2");
        getStairsPath(n-3, str+"3");
    }

    static int getStairsPathCount(int n){
        if( n < 0 ){
            return 0;
        }
        if( n == 0){
            // System.out.println(str);
            return 1;
        }
        return getStairsPathCount(n-1) + getStairsPathCount(n-2) + getStairsPathCount(n-3);
    }

    /*
     * DP Memoization
     */

     static int getStairsPathCount(int n, int memo[]){
        if( n < 0 ){
            return 0;
        }
        if( n == 0){
            // System.out.println(str);
            return 1;
        }

        if(memo[n] != 0)
            return memo[n];

        int result = getStairsPathCount(n-1, memo) + getStairsPathCount(n-2, memo) + getStairsPathCount(n-3, memo);
        memo[n] = result;
        return result;
    }

    /*
     * DP Tabulation
     * 3 Steps to get tabluation form
     * 1. Storage & meaning
     * 2. Direction
     * 3. Travel and solve
     */

     

     static int getStairsPathCountTab(int n ){

        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = dp[i-1];
            }else if( i == 2){
                dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            }
        }
        return dp[n];
     }

}
