import javax.swing.tree.TreeModel;
import java.util.TreeSet;

public class Array_Traverse_628 {
    // Clarify variable types. For integers, think about the largest integer
    // that could appear in the whole program
    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int num: nums){
            if (num >= max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num >= max2){
                max3 = max2;
                max2 = num;
            } else if (num >= max3){
                max3 = num;
            }

            if (num <= min1){
                min2 = min1;
                min1 = num;
            } else if (num <= min2){
                min2 = num;
            }
        }
        return Math.max(max1*max2*max3, min1*min2*max1);
    }

    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{3,6,9,11}));
        System.out.println(maximumProduct(new int[]{-9,-2,-1,0,11}));
        System.out.println(maximumProduct(new int[]{-20,-17,-9,-2,-1}));
    }
}
