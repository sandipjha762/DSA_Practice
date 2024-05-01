package Recursion;

public class StringSubsequence {
    
    public static void main(String[] args) {
        subSeq("abc", "");
    }

    static void subSeq(String str, String ans){

        if(str.length() == 0){
            System.out.println(ans+" ");
            return;
        }

        subSeq(str.substring(1), ans);
        subSeq(str.substring(1), ans+str.charAt(0));

    }
}
