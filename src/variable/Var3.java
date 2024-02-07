package variable;
//#2-3 변수의 사용(2024-02-07)
public class Var3 {
    public static void main(String[] args) {

        int hour = 3;
        int min = 10;

        System.out.println(hour + "시간" + min + "분" + "\n");
        
        // 시간을 분으로 변환해 저장
        int totMin = (hour * 60) + min;

        System.out.println("총 " + totMin + "분" + "\n");

        // 분을 초로 변환해 저장
        int totSec = totMin * 60;

        System.out.println("총 " + totSec + "초");

    }
}
