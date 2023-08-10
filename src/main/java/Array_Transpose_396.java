public class Array_Transpose_396 {
    public int maxRotateFunction(int[] nums) {
        // 0[0], 1[1], 2[2], 3[3], 4[4]  +[0]+[1]+[2]+[3]
        // 1[0], 2[1], 3[2], 4[3], 0[4]  +[0]+[1]+[2].   +[4]
        // 2[0], 3[1], 4[2], 0[3], 1[4]  +[0]+[1].   +[3]+[4]
        // 3[0], 4[1], 0[2], 1[3], 2[4]
        // 4[0], 0[1], 1[2], 2[3], 3[4]
        int sum = 0;
        int sumAll = nums[0];
        for (int i=1; i<nums.length; i++){
            sum += i*nums[i];
            sumAll += nums[i];
        }
        int maxSum = sum;
        for (int i=nums.length-1; i>0; i--){
            sum -= (nums.length)*nums[i];
            sum += sumAll;
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Array_Transpose_396 newProblem = new Array_Transpose_396();
        System.out.println(newProblem.maxRotateFunction(new int[]{4,3,2,6}));
    }
}
