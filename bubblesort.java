import java.lang.reflect.Array;
import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {9,5,25,53,1,-5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[arr.length - 2]);
    }
}
    //     for (int i = 0; i < arr.length; i++) {
    //         int left = 0;
    //         int right = 1;
    //         while (right < arr.length) {
    //             if(arr[left]>arr[right]){
    //                 //swap
    //                 int temp = arr[left];
    //                 arr[left]=arr[right];   
    //                 arr[right]=temp;
    //             }
    //             left++;
    //             right++;
              
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }
    
// }
