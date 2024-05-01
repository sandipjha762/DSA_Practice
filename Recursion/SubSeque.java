package Recursion;

class SubSeque {

    public static void main(String[] args) {
        String str = "abc";
        // subSeq(str, "");
        // permutation(str, "");
        int arr[] = {10, 3, 5, 3, 13};
        // System.out.println(recursionPlay(arr, 0));
        System.out.println(firstOcc(arr, arr.length-1, 3));
    }

    static void subSeq(String str, String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        subSeq(ros, ans);
        subSeq(ros, ans+ch);
    } 

    static void permutation(String str, String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String roq = str.substring(0, i) + str.substring(i+1);
            permutation(roq, ans+ch);
        }

        
    }

    // n = 5
    static int recursionPlay(int arr[], int idx){
        if(arr.length - 1 == idx){
            return arr[idx];
        }
        
        int max = recursionPlay(arr, idx+1);

        if(max < arr[idx]){
            return arr[idx];
        }
        return max;
    }
    //5
    static int firstOcc(int arr[], int idx, int target){

        if(idx < 0){
            return -1;
        }
        
        if(arr[idx] == target)
            return idx;

        int res = firstOcc(arr, idx-1, target);
        return res;
    }


}

