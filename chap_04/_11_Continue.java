import javax.swing.plaf.TextUI;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정 
        // for
        int max = 20; // 최대 치킨 판매량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow =17; // 대기번호 17번손님이 노쇼

        for(int i = 0; i<=50; i++){
            System.out.println(i+"번 손님 , 주문하신 치킨 나오셨습니다.");
    
            // 치킨을 가져가야하는 상황 하지만 손님이 없다면..?
            if(i==noShow){
                System.out.println(" 주문하신 고객님께서 치킨을 찾아가지 않았습니다 , 다음 순번 고객님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++;
            if(sold==max){
                System.out.println("금일 재료가 모두 소진되었습니다!");
                break;
            }

        }

        System.out.println("영업을 종료합니다!");
        System.out.println("--------------------------");

        // while문
        sold=0;
        int index = 0; // 손님 번호
        while(true){
            index++;
            System.out.println(index+ "번 손님, 주문하신 치킨 나오셨습니다.");

            // 손님이 없다면?
            if(index==noShow){
                System.out.println(index+"번째 손님이 부재중이니 , 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            // 판매처리
            sold++;
            if(sold == max){
                System.out.println("금일 재료가 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

    }
}
