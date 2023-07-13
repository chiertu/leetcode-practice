import java.util.Arrays;

public class HeapSort {
    static void heapsort(int[] arr){
        build_heap(arr);
        for (int i=arr.length-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }
    static void build_heap(int[] arr){
        int last_non_leaf_node = arr.length/2;
        for (int i = last_non_leaf_node; i>=0; i--){
            heapify(arr, i, arr.length);
        }
    }

    static void heapify(int[] arr, int i, int last_index){
        int l = 2*i+1;
        int r = 2*i+2;
        int largest = i;
        if (l<last_index && arr[l]>arr[largest]){
            largest = l;
        }
        if (r<last_index && arr[r]>arr[largest]){
            largest = r;
        }
        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, last_index);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 34, 8, 12, 29, 78, 1};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        heapsort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}