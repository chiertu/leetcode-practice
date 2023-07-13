public class Q33 {
    public static int search(int[] nums, int target) {
        int pivot = findPivot(0, nums.length-1, nums);
        if (pivot == 0 ) return findNum(0, nums.length-1, nums, target);
        if (target >= nums[0]) {
            return findNum(0, pivot-1, nums, target);
        } else {
            return findNum(pivot, nums.length-1, nums, target);
        }
    }

    public static int findNum(int r, int p, int[] nums, int target){
        if (r == p) return nums[r] == target? r: -1;
        int q = (r+p)/2;
        if (nums[q] == target){
            return q;
        } else if (nums[q] > target){
            return findNum(r, q, nums, target);
        } else {
            return findNum(q+1, p, nums, target);
        }
    }
    public static int findPivot(int r, int p, int[] nums){
        if (r == p) return r;
        if (p-r == 1) return nums[r] > nums[p]? p: r;
        int q = (r+p)/2;
        if (nums[q] > nums[p]){
            return findPivot(q, p, nums);
        } else {
            return findPivot(r, q, nums);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1};
        System.out.println(search(arr, 3));
    }
}
