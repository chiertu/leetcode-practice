import com.sun.source.tree.Tree;

import java.util.TreeSet;
//Time is taken to push and pop elements from the ordered set
//depends on the number of elements in it,
//and as here the ordered set will have at most three elements in it,
//those operations are considered constant time operations.
public class Array_Traverse_414 {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> maxNums = new TreeSet<>();
        for (int num: nums){
            if (maxNums.contains(num)) continue;
            maxNums.add(num);
            if (maxNums.size() > 3) maxNums.remove(maxNums.first());
        }
        return maxNums.size() == 3? maxNums.first(): maxNums.last();
    }
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2,2,5,3,5}));
    }
}
