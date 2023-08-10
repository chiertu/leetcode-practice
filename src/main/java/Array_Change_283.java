import java.util.Arrays;

public class Array_Change_283 {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (int num:nums){
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while (i<nums.length){
            nums[i] = 0;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{};
        System.out.println(Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
