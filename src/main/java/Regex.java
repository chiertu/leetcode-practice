public class Regex {
    public static void main(String[] args) {
        String str = "        just kidding";
        System.out.println(str);
        String newStr = str.replaceAll("^\\s+", "");
        System.out.println(newStr);
    }
}
