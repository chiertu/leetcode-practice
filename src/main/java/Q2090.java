import java.util.Arrays;

public class Q2090 {
    public static int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        long[] sums = new long[nums.length];
        for(int i = 0; i<k+1 && i<nums.length; i++){
            sums[0] = sums[0] + nums[i];
        }
        for(int i = 1; i<nums.length; i++){
            sums[i] = sums[i-1];
            if (i+k<nums.length){
                sums[i] = sums[i] + nums[i + k];
            }
            if (i-k-1>=0){
                sums[i] = sums[i] - nums[i-k-1];
            }
        }


        for (int i = 0; i< nums.length; i++){
            if (i-k<0 || i+k >= ans.length) {
                ans[i] = -1;
            } else {
                ans[i] = (int) (sums[i]/(2*k+1));
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6};
        System.out.println(Arrays.toString(getAverages(arr, 3)));
    }
}
//    PREFIX-SUM
//    public int[] getAverages(int[] nums, int k) {
//        int[] ans = new int[nums.length];
//        long[] sums = new long[nums.length];
//        sums[0] = nums[0];
//        for(int i = 1; i<nums.length; i++){
//            sums[i] = sums[i-1] + nums[i];
//        }
//        for (int i = 0; i< nums.length; i++){
//            if (i-k<0 || i+k >= ans.length) {
//                ans[i] = -1;
//            } else {
//                ans[i] = (int)((sums[i+k] - (i-k-1>=0? sums[i-k-1]:0))/(2*k+1));
//            }
//        }
//
//        return ans;
//    }


//
//    public int[] getAverages(int[] nums, int k) {
//        int n = nums.length;
//        int windowSize = 2 * k + 1;
//
//        long windowSum = 0;
//        int[] result = new int[n];
//        Arrays.fill(result,-1);
//
//        if (n < windowSize) {
//            return result;
//        }
//
//        for (int i = 0; i < n; ++i) {
//            windowSum += nums[i]; // Add nums[i] to the window sum
//
//            if (i - windowSize >= 0) {
//                windowSum -= nums[i - windowSize]; // Remove nums[i - windowSize] from the window sum
//            }
//
//            if (i >= windowSize - 1) {
//                result[i - k] = (int) (windowSum / windowSize); // Calculate and store the average in the result
//            }
//        }
//
//        return result;
//    }