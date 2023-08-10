import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Array_SpecialTraverse_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;

        while (left <= right && top <= bottom){
            for (int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            for (int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if (top<=bottom){
                for (int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left<=right){
                for (int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++; // i=top is included because top already dropped
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Array_SpecialTraverse_54 newProb = new Array_SpecialTraverse_54();
        int[][] m = new int[3][1];
        m[0] = new int[]{3};
        m[1] = new int[]{2};
        m[2] = new int[]{6};
        System.out.println(newProb.spiralOrder(m));
    }
}
