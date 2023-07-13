public class Q7 {
    public static int reverse(int x){
        // Integer.MAX_VALUE is 2...7, and Integer.MIN_VALUE is -1...8
        // the reverse of the max and min values are not valid inputs
        // since they are already outside the integer range.
        int ans = 0;
        while(x!=0){
            int pop = x%10;
            x = x/10;
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10)return 0;
            ans = ans*10+pop;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
    }
}