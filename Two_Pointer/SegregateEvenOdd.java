package Two_Pointer;


public class SegregateEvenOdd {

    public static void main(String[] args) {
        
        int nums[] = {3, 1, 2, 4};
        
        int i = 0;  // fist pointer at 0th position
        int j = nums.length - 1; // second pointer at last position
        
        while (i < j) {
            while (i < j && nums[i] % 2 == 0)
                i++;
            while (i < j && nums[j] % 2 == 1)
                j--;
            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        for(int res : nums){
            System.out.print(res +" ");
        }

    }

}
