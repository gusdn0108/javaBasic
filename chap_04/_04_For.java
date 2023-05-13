import java.io.OutputStream;

public class _04_For {
    public static void main(String[] args) {
        // 반복문 
        // 옷가게
        System.out.println("어서오세요 이쁜 옷가게입니다 ~");
        // 또 다른 손님이 들어오게 되면? 
        System.out.println("안녕하세요 이쁜 옷가게입니다!");
        // 만약 인사법이 바뀐다면?
        System.out.println("환영합니다 이쁜 옷가게입니다 !");

        for(int i = 0;i<10;i++){
            System.out.println("안녕하세요 이쁜 옷가게입니다!"+i);
        }   
        // 짝수만 출력
        for(int i = 0;i<10;i+= 2){
            System.out.println(i+"짝수");
            // 0 ,2 ,4 ,6 ,8
        }

        // 홀수만 출력
        for(int i = 1; i <10; i+=2){
            System.out.println(i+"홀수");
        }

        // 거꾸로 숫자 ( 카운터 다운)
        for (int i = 5; i >0 ; i--) {
            System.out.println(i);
        }
        

        // 숫자의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지의 총합은"+sum+"입니다");
        }

        System.out.println("1부터10까지의 모든 숫자의 합은 "+sum+"입니다");
    }
}
