// reverse array method
// while(start<end) {swap}
public class Array_Transpose_189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateSolution(int[] nums, int k){
        k = k % nums.length;
        int count = 0;
        for (int start=0; count<nums.length; start++){
            int curr = start;
            int currValue = nums[start];
            do {
                int next = (curr+k)%nums.length;
                int temp = nums[next];
                nums[next] = currValue;
                currValue = temp;
                curr = next;
                count++;
            } while (curr != start);
        }
    }
    public static void main(String[] args) {

    }
}
