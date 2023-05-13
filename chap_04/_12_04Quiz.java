public class _12_04Quiz {
    public static void main(String[] args) {
        int hour = 10;
        boolean isSmaller = true;  // 경차
        boolean withDisabledPerson = false; // 장애인 차량 여부
        
        int fee = hour * 4000; // 시간당 4000원 곱하기 
        
        // 30000 원 초과 시 일일 최대 요금으로 수정
        if(fee > 30000){
            fee =30000;
     }

     System.out.println("주차요금은 "+fee+"입니다");
     if(isSmaller||withDisabledPerson){
        fee /= 2;
     }

     System.out.println("경차와 장애인 차량 주차요금은 "+ fee+ "입니다");
    }
} 
