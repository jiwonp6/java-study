package n3.condition;
// #4-7  조건문7(2024-02-08)
public class Condition7 {
    public static void main(String[] args) {
        // 주사위 던지기
        int diceNum = (int) ((Math.random() * 6) + 1);       // 1 ~ 6 까지 랜덤한 난수 생성

        // System.out.println(diceNum);

        if (diceNum == 1){
            System.out.println("주사위 숫자 1");
        } else if (diceNum == 2) {
            System.out.println("주사위 숫자 2");
        } else if (diceNum == 3) {
            System.out.println("주사위 숫자 3");
        } else if (diceNum == 4) {
            System.out.println("주사위 숫자 4");
        } else if (diceNum == 5) {
            System.out.println("주사위 숫자 5");
        } else if (diceNum == 6) {
            System.out.println("주사위 숫자 6");
        }
    }
}
