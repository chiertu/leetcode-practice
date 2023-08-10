import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Array_2DandOthers_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascal.add(firstRow);

        for (int numRow=1; numRow<=numRows-1; numRow++){
            List<Integer> preRow = pascal.get(numRow-1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // add first 1
            if (preRow.size()>1){
                for (int i=0; i<preRow.size()-1; i++){
                    newRow.add(preRow.get(i)+preRow.get(i+1));
                }
            }
            newRow.add(1); // add last 1
            pascal.add(newRow);
        }
        return pascal;
    }
    public static void main(String[] args) {

    }
}
