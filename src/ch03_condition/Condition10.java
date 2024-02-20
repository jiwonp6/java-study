package ch03_condition;
// #4-10 switch 문3(2024-02-08)
public class Condition10 {
    public static void main(String[] args) {
        // 주사위 던지기
        int diceNum = (int) ((Math.random() * 6) + 1);       // 1 ~ 6 까지 랜덤한 난수 생성

        // 향상된 switch 문 : 자바 14버전 이후부터 도입
        switch (diceNum) {
            case 1 -> System.out.println("주사위 숫자 1");
            case 2 -> System.out.println("주사위 숫자 2");
            case 3 -> System.out.println("주사위 숫자 3");
            case 4 -> System.out.println("주사위 숫자 4");
            case 5 -> System.out.println("주사위 숫자 5");
            default -> System.out.println("주사위 숫자 6");
        }
    }
}
