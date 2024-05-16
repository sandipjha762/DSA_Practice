package Two_Pointer;

public class segregate012 {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 0, 0, 1, 0, 1, 1, 2};
        int arr[] = {0, 1, 1, 1, 0, 1, 0, 0, 1, 0};
        // segregate012(arr);
        segregate01(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }

    }

    static void segregate012(int arr[]) {

        int lo = 0;
        int mid = 0;
        int hi = arr.length-1;

        while(mid <= hi){
            if(arr[mid] == 0){
                swap(lo, mid, arr);
                lo++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(mid, hi, arr);
                hi--;
            }
        }
    }

    static void segregate01(int arr[]) {
        int lo = 0;
        int hi = arr.length-1;

        while(lo <= hi) {
            if(arr[lo] == 0){
                lo++;
            }else{
                swap(lo, hi, arr);
                hi--;
            }
        }
    }

    static void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
