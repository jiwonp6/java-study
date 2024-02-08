package condition;
// #4-8  switch 문(2024-02-08)
public class Condition8 {
    public static void main(String[] args) {
        // 주사위 던지기
        int diceNum = (int) ((Math.random() * 6) + 1);       // 1 ~ 6 까지 랜덤한 난수 생성

        /*
            switch 문은 조건식에 해당하는 특정 값으로 실행할 코드를 선택한다.
            조건식의 결과 값과 case의 값이 일치하면 case의 코드를 실행한다.
            break문은 switch문을 빠져나가게(종료) 한다.
            break문이 없으면 이후의 case 문의 코드도 차례대로 실행된다.
        */
        switch (diceNum){
            case 1 :
                System.out.println("주사위 숫자 1");
                break;
            case 2 :
                System.out.println("주사위 숫자 2");
                break;
            case 3 :
                System.out.println("주사위 숫자 3");
                break;
            case 4 :
                System.out.println("주사위 숫자 4");
                break;
            case 5 :
                System.out.println("주사위 숫자 5");
                break;
            default:
                System.out.println("주사위 숫자 6");
                break;

            /*
            case 6 :
                System.out.println("주사위 숫자 6");
                break;
             */
        }

    }
}
