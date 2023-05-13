public class _07_Dowhile {
    public static void main(String[] args) {
        //Dowhile
        int distance = 25;
        int move = 0;
        int height = 2;
        
        // 이동거리+키 < 거리
        while(move+height < distance){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재이동거리"+move);
            move += 3;

        }
            System.out.println("도착했습니다");        




        System.out.println("-------반복문 #1----------");
            // 키가 엄청 큰사람 
            move = 0;
            height = 25; // 키가 25m..
            while(move+height < distance){
                System.out.println("발차기를 계속 합니다");
                System.out.println("현재이동거리"+move);
                move += 3;
    
            }
                    System.out.println("도착했습니다.");


                // Do while 반복문
            do{
                System.out.println("발차기를 계속합니다.");
                System.out.println("현재 이동 거리 :"+move);
                move += 3;
                
            }while(move+height < distance);{   
                System.out.println("도착했습니다.");
            }
    }
}
