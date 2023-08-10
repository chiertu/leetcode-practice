public class Array_Change_665 {
    public static boolean checkPossibility(int[] nums) {
        boolean modified = false;
        if (nums.length < 2) return true;
        for (int i=1; i<nums.length-1; i++){
            if (nums[i]>=nums[i-1]){
                if (nums[i+1]<nums[i] && nums[i+1] >= nums[i-1]){
                    if (modified) {
                        return false;
                    } else {
                        nums[i] = nums[i-1];
                        modified = true;
                    }
                } else if (nums[i+1] < nums[i-1]) {
                    if (modified) {
                        return false;
                    } else {
                        nums[i+1] = nums[i];
                        modified = true;
                    }
                }
            } else {
                if (nums[i+1] >= nums[i-1]){
                    if (modified) {
                        return false;
                    } else {
                        nums[i] = nums[i-1];
                        modified = true;
                    }
                } else if (nums[i+1] >= nums[i]){
                    if (modified) {
                        return false;
                    } else {
                        nums[i-1] = nums[i];
                        modified = true;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPossibility(new int[]{4,2,3}));
        System.out.println(checkPossibility(new int[]{4,2,1}));
    }
}
