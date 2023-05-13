public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열

        // 소규모 영화관 좌석
        // a1 - a5
        // b1 - a5
        // c1 - c5

        String[] seatA = {"a1","a2","a3","a4","a5"};
        String[] seatB = {"b1","b2","b3","b4","b5"};
        String[] seatC = {"c1","c2","c3","c4","c5"};


        // 3 x 5 크기의 2차원 배열 
        String[][] seats = new String[][] {
            {"a1","a2","a3","a4","a5"},
            {"b1","b2","b3","b4","b5"},
            {"c1","c2","c3","c4","c5"}
        };

        // B2에 접근하려면??

        // 3차원 배열 만들기 
        String[][][] marray = new String[][][] {
            {{},{},{}},
            {{},{},{}},
            {{},{},{}}
        };
        // 3차원 배열 만들기 (세로x가로x높이)
        String[][][] marray2 = new String[3][3][3];
    }
}