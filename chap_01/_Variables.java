package javaBasic.chap_01;

public class _Variables {
    public static void main(String[] args) {
        String name = "임현우";
        int hour = 15;
        System.out.println(name + "님 , 배송이 시작되었습니다. "+ hour + "시에 방문예정입니다");
        System.out.println(name+ "님, 배송이 완료되었습니다. ");

        /*
        고객이름이 다 다르기때문에 변수로 빼주고싶어...
        main 함수 안에 변수를 정의할수있음.
        프로젝트 할때 클라이언트에서 값받아올때 req.body.username에서 가지고올때랑 비슷한 상황? 이라고 생각하면 편함
        */ 

        double score = 90.5;
        char grade ='A';
        name = "임경빈";
        System.out.println(name + "님의 평균점수는" + score +"점 입니다.");
        System.out.println("학점은"+ grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.14123131414;
        float f = 3.14123131414F;

        System.out.println(d);
        System.out.println(f);

        long i = 1000000000000L;
        i = 1_000_000_000_000L;
        
        System.out.println(i);
    }
    
}
