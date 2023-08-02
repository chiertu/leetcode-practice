import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Survey_645 {
    //
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int cor = nums[i]-1;
            if (nums[i] != nums[cor]){
                int temp = nums[i];
                nums[i] = nums[cor];
                nums[cor] = temp;
            } else {
                i++;
            }
            System.out.println("i: " + i + ", nums: " + Arrays.toString(nums));
        }
        for (int j=0; j<nums.length; j++){
            if (nums[j] != j+1) return new int[]{nums[j], j+1};
        }
        return new int[]{-1, -1};
    }

    // use the original arr as a record keeper
    // if the number at index i has a negative sign
    // it means that i is present in this array
    public static int[] findErrorNums_solution(int[] nums) {
        int[] result = new int[2];
        for (int num: nums){
            if (nums[Math.abs(num)-1] < 0){
                result[0] = Math.abs(num);
            } else {
                nums[Math.abs(num)-1] *= -1;
            }
        }
        for (int i = 0; i<nums.length; i++){
            if (nums[i] > 0) result[1] = i+1;
        }
        return result;
    }
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{3,2,2})));
    }
}
