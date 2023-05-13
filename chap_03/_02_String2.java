import javax.annotation.processing.SupportedOptions;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "         Tonight ma Santa's gonna bring a new          ";
        // 문자열 변환
        System.out.println(s.replace("Santa","party"));
        System.out.println(s.substring(8));
        System.out.println(s.substring(s.indexOf("gonna")));
        System.out.println(s.indexOf("ma"));
        System.out.println(s.indexOf("new"));
        System.out.println((s.substring(s.indexOf("ma"),s.indexOf("new"))));
        System.out.println(s.trim());

        String s1  = "party";
        String s2 = "time";        

        System.out.println(s1+s2);
        System.out.println(s1.concat(",").concat(s2));

    }
}
