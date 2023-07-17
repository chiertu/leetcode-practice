import java.util.ArrayList;
import java.util.HashMap;

public class Q244 {
    HashMap<String, ArrayList<Integer>> distanceDict = new HashMap<>();
    public Q244(String[] wordsDict) {
        for (int i = 0; i<wordsDict.length; i++){
            if (distanceDict.containsKey(wordsDict[i])){
                distanceDict.get(wordsDict[i]).add(i);
            } else {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(i);
                distanceDict.put(wordsDict[i], arrayList);
            }
        }
    }

    public int shortest(String word1, String word2) {
        ArrayList<Integer> word1Indices = distanceDict.get(word1);
        ArrayList<Integer> word2Indices = distanceDict.get(word2);
        int minDistance = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        while(i < word1Indices.size() && j < word2Indices.size()){
            int word1Index = word1Indices.get(i);
            int word2Index = word2Indices.get(j);
            minDistance = Math.min(minDistance, Math.abs(word1Index-word2Index));
            if (word1Index > word2Index){
                j++;
            } else {
                i++;
            }
        }
        return minDistance;
    }
    public static void main(String[] args) {
        String[] wordsDict = new String[]{"practice", "makes", "perfect", "coding", "makes"};
        Q244 obj = new Q244(wordsDict);
        System.out.println(obj.shortest("coding", "practice"));
        System.out.println(obj.shortest("coding", "makes"));
    }
}
