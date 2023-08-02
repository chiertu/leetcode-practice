import java.util.ArrayList;
import java.util.List;

public class Array_Survey_442 {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));
            } else {
                nums[index] *= -1;
            }
        }
        return result;
    }

    public static List<Integer> findDuplicates_slower(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num: nums){
            int index = Math.abs(num)-1;
            if (nums[index] < 0){
                result.add(Math.abs(num));
            } else {
                nums[index] *= -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }
}
