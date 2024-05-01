package Recursion;
import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int arr[] = new int[n+1];
        // System.out.println(fib(n));
        // System.out.println(fibMomo(n, arr));
        System.out.println(fibTab(n));

    }

    static int fib(int n) {

        if(n == 0 || n == 1){
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    } // TC 2^n

    /*
     * DP Memoization Technique
     */

     static int fibMomo( int n, int res[]){

        if(n == 0 || n == 1)
            return n;

        if(res[n] != 0){
            return res[n];
        }
        int result = fibMomo(n-1, res) + fibMomo(n-2, res);
        res[n] = result;
        return res[n];
     }

     static int fibTab(int n){

        int first = 0;
        int second = 1;
        // int oldSum = 1;
        for(int i = 2; i < n; i++){
            int newSum = first + second;
            
            first = second;
            second = newSum;
        }
        return first+second;
     }
}