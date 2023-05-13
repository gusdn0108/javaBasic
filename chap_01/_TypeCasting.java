package javaBasic.chap_01;

public class _TypeCasting {
    public static void main(String[] args) {
        // 형변환 
        // 정수형 -> 실수형
        // 실수형 -> 정수형

        // int score = 93+ 98.8;
        // 정수형 + 실수형으로 연산하려고하면 오류가 발생 형 변환을 해줘야함

        // example
        int score = 93;
        System.out.println(score); //93
        System.out.println((float)score);
        System.out.println((double) score);
     
        
        // float,double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);


        // 정수 + 실수 계산
        score = 93 + (int)98.8;
        System.out.println(score);

        score_d = (double)93 + 98.8;

        System.out.println(score_d);


        double convertedScoreDouble = score;
        System.out.println(convertedScoreDouble);

        // 크기 
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)
        //수동 형변환을 할때는 앞에 직접 값을 넣어줘야함 

        System.out.println(convertedScoreInt);

    
        // 숫자를 문자열로 
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);

        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로 
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d  = Double.parseDouble("98.8");
        System.out.println(d); 

        // 오류
        int error  = Integer.parseInt("자바");
        System.out.println(error);
    }
}
