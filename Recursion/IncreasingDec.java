package Recursion;
public class IncreasingDec {
    // Que: print 5 4 3 2 1 1 2 3 4 5
    public static void main(String[] args) {
    //    IncDec(5);
        // int n = 20;
        // int arr[] = new int[n+1];
        // System.out.println(fact(n, arr));
        System.out.println(power(2, 6));
    }

    static void IncDec(int n){

        if(n == 0)
            return;

        System.out.println(n);
        IncDec(n - 1);
        System.out.println(n);
    }

    static long fact(int n, int arr[]){
        if(n == 1 || n == 0)
            return 1;

        if(arr[n] != 0){
            return arr[n];
        }
        long res = n * fact(n-1, arr);
        return res;
    }
    static long power(int a, int n){

        if(n == 0){
            return 1;
        }

       return n * power(a, n - 1);
    }
}
