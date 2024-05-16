package Recursion;

public class coinCombination {
    
    public static void main(String[] args) {
        int n = 2;
        coinComb(n, "");
    }

    static void coinComb(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        coinComb(n-1, ans+"H");
        coinComb(n-1, ans+"T");
    }
}
