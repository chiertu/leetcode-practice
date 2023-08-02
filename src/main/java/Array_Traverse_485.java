public class Array_Traverse_485 {
//    Time Complexity: O(N)O(N)O(N), where NNN is the number of elements in the array.
//    Space Complexity: O(1)O(1)O(1). We do not use any extra space.

//    use special numbers such as 0s and 1s, +1 is counting, *0 is clearing
//    convert numbers to strings and use string methods

    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) return 0;
        int max = 0;
        int left = 0;
        while(left < nums.length){
            if(nums[left] == 1){
                int right = left+1;
                while(right < nums.length && nums[right] == 1) right++;
                max = Math.max(max, right - left);
                left = right;
            }
            left++;
        }
        return max;
    }

    public static int solution(int[] nums){
        int sum = 0, maxSum = 0;
        for(int n : nums) {
            sum += n;
            sum *= n;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}
