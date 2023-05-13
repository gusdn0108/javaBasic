package javaBasic.chap_02;

import java.net.SocketTimeoutException;

public class _01_Operator {
 public static void main(String[] args) {
    // 산술 연산자


    // 일반 연산자

    System.out.println(5+5);
    System.out.println(4-2);
    System.out.println(4*4);
    System.out.println(4/2);
    System.out.println(5/2); // 정수가능 연산일때는 뒤에 있는 소수점은 버려짐
    System.out.println(2/4);
    System.out.println(4 % 2); // 나머지 연산 : 4를 2로 나눳을때 나머지를 구하는 연산식 
    System.out.println(5 % 2 );

    // 우선 순위 연산
    System.out.println( 2 + 2 * 2 ); // 6
    System.out.println((2+2)*2 );

    int a = 20;
    int b = 30;
    int c ;
    
    c = a+b;
    System.out.println(c);

    c = a-b;
    System.out.println(c);

    c = a*b;
    System.out.println(c);

    c = a/b;
    System.out.println(c);

    c = a%b;
    System.out.println(c);

    // 증감 연산 ++ 
    int val ;
    val = 10 ;
    System.out.println(val); // 10 
    System.out.println(++val); // 11
    System.out.println(val); // 11

    val = 10;
    System.out.println(val); // 10
    System.out.println(val++); // 10
    System.out.println(val); // 11 

    val = 10;
   System.out.println(val); // 10 
   System.out.println(--val); // 9
   System.out.println(val); // 9
   
   val = 10;
   System.out.println(val); // 10
   System.out.println(val--); // 10
   System.out.println(val); // 9

   // 예제 문제 : 은행 대기표

   int waiting = 0;
   System.out.println("대기 번호" + waiting++ + " 번 입니다");
   System.out.println("대기 번호" + waiting++ + " 번 입니다");
   System.out.println("대기 번호" + waiting++ + " 번 입니다");

   System.out.println("총 대기인원" + waiting+"입니다");

   
}
    
}