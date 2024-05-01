package Bit_Manipulation;

public class FindUnique {

    public static void main(String[] args) {
        int arr[] = {2, 7, 8, 3, 8, 3, 2};

        int uniq = arr[0];
        for(int i = 1; i < arr.length; i++){
            uniq = uniq^arr[i];
        }

        System.out.println(uniq);
    }
   


}
