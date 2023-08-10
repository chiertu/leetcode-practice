public class Array_Change_453 {
    public static int minMoves(int[] nums) {
        if(nums.length == 0) return 0;
        int min = nums[0];
        int sum = 0;
        for (int num: nums){
            if (num < min) min = num;
            sum += num;
        }
        return sum-nums.length*min;
    }
    public static void main(String[] args) {
        System.out.println(minMoves(new int[]{}));
    }
}
