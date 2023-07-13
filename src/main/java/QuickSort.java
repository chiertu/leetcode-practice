import java.util.Arrays;

public class QuickSort {
    public static void quicksort(int[] arr){
        section_sort(arr, 0, arr.length);
    }

    static void section_sort(int[] arr, int p, int r){
        if (p<r){
            int q = randomized_partition(arr, p, r);
            section_sort(arr, p, q);
            section_sort(arr, q+1, r);
        }
    }

    static int randomized_partition(int[] arr, int p, int r){
        int random_index = (int)(Math.random()*(r-p)+p);
        swap(arr, random_index, r-1);
        int i = p-1;
        for (int j=p; j<r-1; j++){
            if (arr[j]<=arr[r-1]){
                i=i+1;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r-1);
        return i+1;
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 29, 87, 4, 18, 18, 46};
        System.out.println("Before: " + Arrays.toString(arr));
        quicksort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}