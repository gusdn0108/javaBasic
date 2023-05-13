

public class _01_If {
    public static void main(String[] args) {
        // int hour = 15; 오전 10시
        int hour = 15; // 오후 15시

        if (hour < 14){
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("샷추가");
        }
            System.out.println("커피 주문완료");



        if(hour < 14 )
        System.out.println("이왜진?");



        // 오전 2시 이전 , 모닝 커피를 마시지 않은 경우?

        hour = 15 ;
        boolean morningCoffee = true; // 커피 안마심
        if(hour < 14 && morningCoffee == false);{
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피주문완료");
    }

   
    


}