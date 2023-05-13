public class _06_quiz2 {
    public static void main(String[] args) {
    // 키가 115cm 이므로 놀이기구에 탑승 불가능합니다 .
    // 키가 121cm 이므로 놀이기구에 탑승 가능합니다.
    int varidation = 120;
    int a  = 125;
    int b = 119;
    
    // 결과 = 조건 ? (참인 경우 결과값) : (거짓의 경우 결과값
    String getParty = ( a < varidation) ? "키가 "+ a + "이므로 놀이기구에 탑승 가능합니다" : "키가 "+b+" 이므로 놀이기구에 탑승 불가능합니다 ";
    System.out.println(getParty);
    String getParty2 = ( b < varidation) ? "키가 "+ a + "이므로 놀이기구에 탑승 가능합니다" : "키가 "+b+" 이므로 놀이기구에 탑승 불가능합니다 ";
    System.out.println(getParty2);

    // 식을 잘 못 짯는데 잘 돌아감.. 왜지???

    // 정답


    int height = 115;
    String result = (height > 120) ? "탑승 가능합니다 " : "탑승 불가능합니다 ";
    System.out.println("키가"+height+"cm 이므로 "+result);
    height = 121;
    String result2 = (height > 120) ? "탑승 가능합니다 " : "탑승 불가능합니다 ";
    System.out.println("키가"+height+"cm 이므로"+ result2);

    
    }
}
