public class Array_Survey_41 {
    public static int firstMissingPositive(int[] nums) {
        // clean up
        // eliminate int <= 0, eliminate int >= n
        // o(n)
        int n = nums.length;
        for (int i=0; i<n; i++){
            if (nums[i] <= 0 || nums[i] > n) nums[i] = 0;
        }

        // marking number occurrence at indices
        for (int i=0; i<n; i++){
            if (nums[i] != 0 && nums[i] != -n-1){
                int index = Math.abs(nums[i]) - 1;
                int mark = nums[index];
                if (mark == 0) {
                    nums[index] = -n-1;
                } else if (mark > 0) {
                    nums[index] *= -1;
                }
            }
        }

        for (int i=0; i<n; i++){
            if (nums[i] >= 0) return i+1;
        }

        return n==0? 1:n+1;
    }
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{})); // return 1
        System.out.println(firstMissingPositive(new int[]{0, -1})); // return 1
        System.out.println(firstMissingPositive(new int[]{1, 3, 4})); // return 2
        System.out.println(firstMissingPositive(new int[]{1, 2, 3, 4})); // return 5
    }
}
