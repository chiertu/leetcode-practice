public class Q12 {
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < values.length && num > 0; i++){
            str.append(symbols[i].repeat(num / values[i]));
            num = num/values[i];
        }
        return str.toString();
    }
    public static void main(String[] args) {

    }
}
