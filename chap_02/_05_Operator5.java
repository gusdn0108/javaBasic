import java.net.SocketTimeoutException;

public class _05_Operator5 {
    public static void main(String[] args) {
        
//결과 = 조건 ? (참인 경우 결과값) : (거짓의 경우 결과값)

int x = 5;
int y = 3;
int max = (x>y) ?  x:y;
System.out.println(max);

int min = (x<y) ? x:y;
System.out.println(min);

x= 3;
y = 3;

boolean b =(x==y) ? true:false;
System.out.println(b);

String s = (x != y) ? "같아요" : "달라요";

System.out.println(s);



}
}

