public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자 
        boolean 김치찌개 = true;
        boolean 된장찌개 = false;
        boolean 제육볶음 = true;


        System.out.println(김치찌개 || 된장찌개 || 제육볶음); // 하나라도 ture 면 괜찮은 식당!
        System.out.println(김치찌개&&된장찌개&&제육볶음); // 3가지 모두 있으면 최애 식당!
        // and 연산
        System.out.println((5>3)&& (3>1)); // 5는 3보다 크고 3은 1보다 크다
        System.out.println((5>3)&& (3<1)); // 5는 3보다크고 3은 1보다 작다

        // or 연산
        System.out.println((5>3)|| (3>1)); // 5는 3보다 크다 , 3은 1보다 크다 
        System.out.println((5>3)|| (3<1)); // 5는 3보다 크다 , 3은 1보다 작다
        
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(5==5));
        System.out.println(!(5==3));

        


    }
}
