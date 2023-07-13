import java.lang.reflect.Array;
import java.util.Arrays;

public class Q10 {
    public static boolean isMatch(String s, String p) {
        int[][] DP = new int[s.length()+1][p.length()+1];
        DP[0][0] = 1;


        for (int j = 2; j<p.length()+1; j = j+2){
            if (p.charAt(j-1) == '*' &&  DP[0][j-2] == 1) DP[0][j] = 1;
        }

        for (int j = 1; j<p.length()+1; j++){
            for (int i = 1; i<s.length()+1; i++){
                System.out.println("["+i+"]["+j+"] iteration" );
                if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.'){
                    DP[i][j] = DP[i-1][j-1];
                } else if (p.charAt(j-1) == '*'){
                    // if matches with the * section
                    if (p.charAt(j-2) == '.' || p.charAt(j-2) == s.charAt(i-1)){
                        DP[i][j] = DP[i-1][j];
                    }
                    // if no match with the * section
                    if (j-3>=0 && DP[i][j] == 0) {
                        DP[i][j] = DP[i][j-2];
                    }
                }
                DPtoString(DP);
            }

        }
        return DP[s.length()][p.length()]==1;
    }


    public static void DPtoString(int[][] DP) {
        for (int[] ints : DP) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void main(String[] args) {
        System.out.println(isMatch("a", "ab*a*c*a"));
    }
}
