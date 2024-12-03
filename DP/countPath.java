package DP;

public class countPath {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n+1];
        // printPath(n, "");
        // System.out.println(countPath(n));
        // System.out.println(countPathDP(n, arr));
        System.out.println(countPathTabulation(n));
    }

    static void printPath(int n, String res) { 

        if(n == 0){
            System.out.println(res);
            return;
        }
        if(n < 0)
            return;

        for(int i = 1; i <= 3; i++){
            printPath(n-i, res+i);
        }
    }

    static int countPath(int n) {

        if(n == 0){
            return 1;
        }
        if(n < 0)
            return 0;

        int count = 0;
        for(int i = 1; i <= 3; i++){
            count += countPath(n-i);
        }
        return count;
    }

    static int countPathDP(int n, int res[]) {

        if(n == 0){
            return 1;
        }
        if(n < 0)
            return 0;

        if(res[n] != 0){
            return res[n];
        }

        int count = 0;
        for(int i = 1; i <= 3; i++){
            count += countPathDP(n-i, res);
        }
        return res[n] = count;
    }

    static int countPathTabulation (int n){

        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        return dp[n];
    }
}
