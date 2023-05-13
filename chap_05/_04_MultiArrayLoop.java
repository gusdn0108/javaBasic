import javax.swing.text.StyledEditorKit.ForegroundAction;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
            {"a1","a2","a3","a4","a5"},
            {"b1","b2","b3","b4","b5"},
            {"c1","c2","c3","c4","c5"}
        };
        for(int i=0; i<3; i++){// 세로
            for(int j = 0; j <5 ; j++){ // 가로
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }


        String[][] seats2 = new String[][] {
            {"a1","a2","a3"},
            {"b1","b2","b3","b4"},
            {"c1","c2","c3","c4","c5"}
        };

        for(int i  = 0;  i < seats2.length; i++){
            for(int j=0; j < seats2[i].length; j++){
                    System.out.print(seats2[i][j]);
            }
            System.out.println();
        }
        

        System.out.println("--------------------------");

        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};

        for(int i =0; i<seats3.length; i++){
            for(int j =0; j<seats3[i].length; j++){
                seats3[i][j] = eng[i]+(j+1) + " ";
            }
            System.out.println();
        }

        
        // 영화관 좌석 번호 확인

         // 표 구매 
        seats3[7][8] = "__";
        seats3[7][9]="__";

        for(int i =0; i<seats3.length; i++){
            for(int j =0; j<seats3[i].length; j++){
                System.out.print(seats3[i][j]+ " ");
            }
            System.out.println();
        }

       


       
    }

}
