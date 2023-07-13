import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        boolean needsSorting = true;
        for (int i = arr.length-1; i>0 && needsSorting; i--){
            needsSorting = false;
            for (int j = 0; j<i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    needsSorting = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 45, 27, 4, 7, 25};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
