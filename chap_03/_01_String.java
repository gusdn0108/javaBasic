public class _01_String {
public static void main(String[] args) {
        String s = "get the out fuck out here"; // 길이가 21
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());
        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        // 포함 관계
        System.out.println(s.contains("the")); // 포함된다면 true 포함되지않으면 false
        System.out.println(s.contains("like")); // 포함된다면 true 포함되지않으면 false
        System.out.println(s.indexOf("fuck")); // 위치 정보
        System.out.println(s.indexOf("out")); // 위치 정보
        System.out.println(s.indexOf("like")); // 위치 정보
        System.out.println(s.lastIndexOf("out")); // 단어의 마지막 위치 정보 
        System.out.println(s.lastIndexOf("like")); // 단어의 마지막 위치 정보 
        System.out.println(s.startsWith("get")); // 문장의 첫 시작이 이 문장이 맞는가? boolean 형태값으로 리턴해줌 
        System.out.println(s.startsWith("the")); 
        System.out.println(s.endsWith("out")); // 문장의 마지막이 내장함수 안에 들어간 단어가 맞는가? boolean 형태값으로 리턴해줌 
        System.out.println(s.endsWith("here")); 
        
}
    
}