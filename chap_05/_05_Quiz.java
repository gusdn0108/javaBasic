public class _05_Quiz {
    public static void main(String[] args) {

        // 신발사이즈는 5단위로 있음.

        int[] sizeArray = new int[10];
        for(int i=0; i<sizeArray.length; i++){
            sizeArray[i]= 250+ (5 * i);
            System.out.print("사이즈"+ sizeArray[i]+  "(재고있음)" + "  ");
        }
        System.out.println();
    }
}
