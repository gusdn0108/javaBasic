public class _03_StringCompare {
public static void main(String[] args) {
    String s1  = "ENFP";
    String s2 = "INTJ";

    System.out.println(s1.equals("ENFP")); // true
    s1 = "1234";
    s2 = "1234";
    
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1 == s2); // true

    s1 = new String("1234");
    s2 = new String("1234");

    System.out.println(s1.equals(s2)); // true
    System.out.println(s1 == s2); // false : 왜 false 로 나옴??



}
   
}