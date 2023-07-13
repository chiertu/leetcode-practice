public class Q8 {
    public static int myAtoi(String s) {
        int i = 0;
        boolean isNegative = false;
        // Step 1: strip leading 0s
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        if (i>s.length()-1) return 0;

        // Step 2: determine sign
        if(s.charAt(i) == '-'){
            isNegative = true;
            i++;
        } else if (s.charAt(i) == '+'){
            i++;
        }
        if (i>s.length()-1) return 0;

        // Step 3: determine value
        int ans = 0;
        while (i<s.length() && Character.isDigit(s.charAt(i))){
            int nextDigit = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && nextDigit>Integer.MAX_VALUE%10)){
                return isNegative? Integer.MIN_VALUE: Integer.MAX_VALUE;
            }
            ans = ans*10+nextDigit;
            i++;
        }
        return ans*(isNegative? -1:1);
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("-21474836482"));
    }
}
