import java.io.OutputStream;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문
        // 별(*) 사각형 만들기 !

        /*
         *****
         *****
         *****
         *****
         *****  
        */

        for(int i =0; i < 5; i++){
            for(int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------- for문 분리선 ---------");
        // 별 왼쪽으로 
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        System.out.println("-------- for 문 분리선#2 ---------");


        // 별 오른쪽으로 
        /*
        S****
        SS***
        SSS**
        SSSS*  
        */ 
        for(int i =0; i<5; i++){
            for(int j=0; j<4-i; j++){
                System.out.print(" ");
            }
            for(int k =0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
      }
    }
}
