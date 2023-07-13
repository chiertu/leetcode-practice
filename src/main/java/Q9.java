public class Q9 {
    public static boolean isPalindromeNumber(int x){
        // Special cases:
        if(x<0 || (x%10==0 && x!=0))return false;
        // HINT: reverse half of the input
        int rev = 0;
        while(x>rev){
            rev = rev*10 + x%10;
            x=x/10;
        }
        // if x has an even number of digits, the loop will break when reaching x == rev
        // if x has an odd number of digits, the loop will break when rev has one more digit than x
        return x == rev || x == rev/10;
    }
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(121));
    }
}
