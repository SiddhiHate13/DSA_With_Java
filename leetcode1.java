
import java.util.*;

public class leetcode1 {
    public static void main(String[] args) {
        int[]arr = {123,4523,5,25,2345};
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
        }
    }

