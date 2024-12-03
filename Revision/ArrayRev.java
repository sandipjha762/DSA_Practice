package Revision;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class ArrayRev {
    public static void main(String[] args) {
        int arr[] = {7,10, 4, 3, 20, 15};
        int res[] = new int[arr.length];
        // res = reverseWithStack(arr);
        // reverseInPlace(arr);
        // for(int x: res) {
        //     System.out.print(x+" ");
        // }

        permutation("abc", "");

        // System.out.println(minHeap(arr));
    }


    // reverse array arr = [12, 31, 4, 1, 53, 61] 
    /*
     * method 1 : reverse iteration // TC : O(n), SC : O(1)
     * method 2 : using stack // TC : O(n) , SC : O(n)
     * method 3 : in-place: 2 pointer
     */

     static void reverseInPlace(int arr[]) {
        int p1 = 0;
        int p2 = arr.length-1;

        while(p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
     }

     static int[] reverseWithStack(int arr[]) {
        Stack<Integer> st = new Stack<Integer>();
        int res[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        int p1 = 0;
        while (st.size() != 0) {
            int elem = st.pop();
            res[p1++] = elem;
        }

        return res;
     }

     static int minHeap(int arr[]) {
        int k = 3;
        /*
         * 7 10 4 3 20 15
         * insert in minHeap
         * heap min : 3, 4, 7, 10, 15, 20
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // insertion TC : logn
        for(int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
            //  7 10 15 20
        while(k-- > 1) { // k = 3, 2, 1
            pq.remove(); // 3, 4
        }
        return pq.peek();
     }

     static int binarySearch() {
        // 10 20 30 40 50 60
        // target : 20
        /*
         * 1 : find mid, start, end
         * 2. compare arr[mid] and target
         * 3. if arr[mid] > target : high = mid-1
         * 4. else if arr[mid] < target : start = mid+1
         * 5. if arr[mid] == target then Answer
         */
        int arr[] = {10, 20, 30, 40, 50, 60};
        int target = 60;
         int start = 0;
         int end = arr.length-1;
         
         while(start <= end) {
            int mid = (start+end)/2;
            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
         }
         return -1;
     }


     static void permutation(String str, String ans) {

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
       
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String roq = str.substring(0, i) + str.substring(i+1);
            permutation(roq, ans+ch);
        }
        
     }

     
}

// abc

// bc => bc, cb

 //  "abc" => "abc", "acb", "bac", "bca", "cab", "cba"

/*
 * method 1 : iterative method : first elem then compare with iterarion TC : O(n) SC: O(1)
 * method 2 : sort -> first and last element // TC : O(nlogn) SC: O(1); 
 * method 3 : Heap : TC: O(nlogn)
 */


 /*
  * Binary Search
    list must be sorted
   TC :  O(logn)
  */

  // 0 2 1 2 0 // 3 pointers
    // l h
//   regions 0 -> l-1 => 0
//           l -> h => 1
//           h -> n-1 => 2

// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
// Output: -12 -13 -5 -7 -3 -6 11 6 5
