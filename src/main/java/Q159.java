import java.util.*;

public class Q159 {
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        int left = 0;
        int right = 0;
        int length = 0;
        TreeMap<Character, Integer> twoChar = new TreeMap<>();
        while (right < s.length()){
            if (twoChar.size() == 2 && !twoChar.containsKey(s.charAt(right))){
                left = Collections.min(twoChar.values()) + 1;
                twoChar.remove(s.charAt(left-1));
            }
            twoChar.put(s.charAt(right), right);
            length = Math.max(length, right - left + 1);
            right++;
        }
        return length;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringTwoDistinct("eceba"));
    }
}
