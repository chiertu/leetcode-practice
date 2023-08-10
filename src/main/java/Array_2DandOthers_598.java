public class Array_2DandOthers_598 {
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] op: ops){
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m*n;
    }
    public static void main(String[] args) {

    }
}
