public class _05_While {
    public static void main(String[] args) {
        // while 
        // 수영하는 모습
        int distance = 25;
        int move = 0; // 현재 이동거리 
        while(move < distance){// 현재 이동거리가 전체 거리보다 작다는 조건 
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리는 "+move+"입니다");
            move +=3; //3미터씩 이동
        }
        System.out.println("도착하였습니다!");

        // 무한 루프
        move = 0;
        while(move < distance){// 현재 이동거리가 전체 거리보다 작다는 조건 
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리는 "+move+"입니다");
        } 
        System.out.println("도착하였습니다.");
    }
}
