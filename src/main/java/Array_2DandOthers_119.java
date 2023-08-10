import javax.swing.*;
import java.util.*;

//  If you are planning to use a class as Hash table key,
//  then it’s a must to override both equals() and hashCode() methods.

// Arrays.asList returns a mutable list
// List.of is returns an immutable list
// Arrays.asList allows null element
// List.of doesn't allow null element
public class Array_2DandOthers_119 {
    private final class RowCol{
        private int row, col;
        public RowCol(int row, int col){
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof RowCol rowColObj)) return false;
            if (this == obj) return true;

            return rowColObj.row == this.row && rowColObj.col == this.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.row, this.col);
        }
    }

    private final Map<RowCol, Integer> cache = new HashMap<>();
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<rowIndex+1;i++){
                result.add(getValueByRowCol(rowIndex, i));
        }
        return result;
    }
    public int getValueByRowCol(int row, int col) {
        RowCol rowCol = new RowCol(row, col);
        if (cache.containsKey(rowCol)) return cache.get(rowCol);
        int computedValue = row==0||col==0||row==col? 1: getValueByRowCol(row-1, col-1) + getValueByRowCol(row-1, col);
        cache.put(rowCol, computedValue);
        return computedValue;
    }


    public static void main(String[] args) {
        Array_2DandOthers_119 problem = new Array_2DandOthers_119();
        System.out.println(problem.getRow(4));

        Array_2DandOthers_199_mathSolution problem1= new Array_2DandOthers_199_mathSolution();
        System.out.println(problem.getRow(4));
    }
}

class Array_2DandOthers_199_mathSolution {
    // line 0: 1
    // line 1: 1,1
    // line 2: 1,2,1
    // line 3: 1,3,3,1

    // 3 = 1 * 3-1+1 / 1
    // 3 = 3 * 3-2+1 / 2
    // 1 = 3 * 3-3+1 / 3
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(List.of(1));
        for (int j=1; j<rowIndex+1; j++){
            result.add(result.get(j-1) * (rowIndex-j+1) / j);
        }
        return result;
    }
}
