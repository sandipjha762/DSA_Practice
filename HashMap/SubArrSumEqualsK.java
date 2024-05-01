package HashMap;

public class SubArrSumEqualsK {
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = arr.length;
        int count = 0;
        int target = 3;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    // System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                }
                if(sum == target){
                    count++;
                }
                System.out.println();
            }
        }
        System.out.println(count);
    }
}

[1, 2, 3] => 
[1]
[1, 2]
[1, 2, 3]
[2]
[2, 3]
[3]


abc
--c
-bc