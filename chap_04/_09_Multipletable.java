
public class _09_Multipletable {
    public static void main(String[] args) {
        // 구구단
        // 2*1=2
        // 2*2=4
        // 2*3=6
        // 이런식으로 짜면 됨

        for(int i=2; i<10; i++){
            for(int j=1; j<10; j++){
                System.out.println(i + "*" + j + " = "+(i*j));
            }
           System.out.println();
        }
    }    
}

