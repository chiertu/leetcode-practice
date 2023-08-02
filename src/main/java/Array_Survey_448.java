import java.util.ArrayList;
import java.util.List;

public class Array_Survey_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int n=0; n<nums.length; n++){
            int index = Math.abs(nums[n])-1;
            if(nums[index]>0) nums[index] *= -1;
        }
        for(int n=0; n<nums.length; n++){
            if(nums[n]>0) result.add(n+1);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
