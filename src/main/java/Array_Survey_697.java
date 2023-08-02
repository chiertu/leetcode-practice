import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Array_Survey_697 {
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> positionList = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if (!positionList.containsKey(nums[i])){
                ArrayList<Integer> position = new ArrayList<>();
                positionList.put(nums[i], position);
            }
            positionList.get(nums[i]).add(i);
        }
        int maxDegree = 0;
        int minLength = Integer.MAX_VALUE;
        for (Map.Entry<Integer, ArrayList<Integer>> entry:
                positionList.entrySet()){
            if (entry.getValue().size() > maxDegree){
                maxDegree = entry.getValue().size();
                minLength = entry.getValue().get(maxDegree-1) - entry.getValue().get(0) + 1;
            } else if (entry.getValue().size() == maxDegree){
                int length = entry.getValue().get(maxDegree-1) - entry.getValue().get(0) + 1;
                if (length < minLength) minLength = length;
            }
        }
        return minLength;
    }
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1}));
    }
}
