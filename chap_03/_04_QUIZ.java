public class _04_QUIZ {
    public static void main(String[] args) {
        String birth = "970108-2081827";
        String id = "030708-4567890";
        System.out.println(birth.substring(0,8));
        System.out.println(id.substring(0,id.indexOf("-")+2));
        System.out.println(id.indexOf("-")+2); // 왜 8이나옴??
        
    }
}
