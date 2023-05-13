public class _02_elseIf {
    public static void main(String[] args) {
        // else if

        // 한라봉 에이드가 있으면  +1
        // 망고 주스가 있으면 +1
        // 아이스 아메리카노 +1 

        boolean hallabonAde = true;
        boolean mangoAde = true;
        
        if(hallabonAde == false){
            System.out.println("할라봉 에이드 +1");
        }else if(mangoAde == false){
            System.out.println("없으면 망고에이드 주세욤");
        }else {
            System.out.println("그냥 아이스 아메리카노 주세요 ㅠ");
        }
    }
}
