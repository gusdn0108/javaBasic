import java.beans.Expression;
import java.io.OutputStream;
import java.net.Socket;

import javax.lang.model.util.ElementScanner6;

public class _03_Switch {
    public static void main(String[] args) {
        // switch case
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        int ranking = 4; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금 ");
        } else if(ranking == 2 || ranking == 3){
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료");



        ranking = 4;
        switch(ranking){
            case 1:
            System.out.println("전액 장학금");
            break;
            case 2: 
            System.out.println("반액 장학금");
            break;
            case 3:
            System.out.println("반액장학금");
            break;

            default:
            System.out.println("장학금 대상 아님");

        }
        System.out.println("조회 완료");

        // 중고상품의 등급에 따른 가격을 책정 (1급 : 최상  , 4급 : 최하)
         int price = 7000;
         int grade = 2;
        switch(grade){
            case 1 : 
            price +=  1000;
            case 2 :
            price += 1000;
             case 3 :
             price += 1000;
             break;
        }
        System.out.println(grade + " 등급 제품의 가격"+ price + "원");
        
        int score = 95;
        if(score >= 90)
        System.out.println("A");
        else if ( score >= 85){
            System.out.println("B");
        }
    }
}
