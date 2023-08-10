import java.util.Arrays;

public class Array_2DandOthers_661 {
    public static int[][] imageSmoother(int[][] img) {
        int rowCount = img.length;
        int colCount = img[0].length;
        int[][] result = new int[rowCount][colCount];
        for (int row=0; row<rowCount; row++){
            for (int col=0; col<colCount; col++){
                int sum = 0;
                int count = 0;
                for (int nrow=row-1; nrow<=row+1; nrow++){
                    for (int ncol=col-1; ncol<=col+1; ncol++){
                        if (nrow < rowCount && nrow >= 0 && ncol >= 0 && ncol < colCount){
                            sum += img[nrow][ncol];
                            count++;
                        }
                    }
                }
                result[row][col] = sum/count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] test1 = new int[3][3];
        test1[0] = new int[]{1, 1, 1};
        test1[1] = new int[]{100, 0, 1};
        test1[2] = new int[]{1, 1, 1};
        System.out.println(Arrays.deepToString(imageSmoother(test1)));
    }
}
