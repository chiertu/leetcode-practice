import java.util.Arrays;

public class Array_SpecialTraverse_498 {
    public static void main(String[] args) {
        Array_SpecialTraverse_498 newProb = new Array_SpecialTraverse_498();
        int[][] m = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.toString(newProb.findDiagonalOrder(m)));
    }

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        if (m == 1) return mat[0];

        int count = n==1? m-1:m+n-2;
        int[] result = new int[m*n];
        int row = 0;
        int k = 0;
        for (int v=0; v<=count; v++){
            if (v>=n){
                row = v%2==0? Math.min(m-1, v):v-n+1;
            } else {
                row = v%2==0? Math.min(m-1, v): 0;
            }
            while (row>=0 && v-row>=0 && row<=m-1 && v-row<=n-1){
                result[k++] = mat[row][v-row];
                row += v%2==0? -1:1;
            }
        }
        return result;
    }
}
