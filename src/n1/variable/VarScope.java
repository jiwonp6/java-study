package n1.variable;
//#2-9 변수의 사용범위(2024-02-07)
public class VarScope {
    public static void main(String[] args) {    // 메소드 블록
        /*
            - 자바의 모든 변수는 중괄호 블록 내에서 선언되고 사용됩니다.
            - 변수는 블록 내 어디서나 선언할 수 있지만,
                사용할 때에는 자신이 선언된 위치로 부터 자신이 속한 블록 내부에서만 사용 가능
            - 해당 블록을 벗어나면 선언된 변수가 소멸된다.
         */
        int value = 10;     // 지역(local) 변수
        value = 20;

        System.out.println(value);

        if (value >= 20) {
            int localVal = 30;
            System.out.println("value + localVal : " + (value + localVal));
            // 바깥 블록에서 선언한 변수는 내부에서 사용 가능
        }else {
            System.out.println("value : " + value);
        }

        // System.out.println(localVal);   <- 블록 벗어난 localVal 사용불가!

    }
    // value <- 블록을 벗어나면 사용불가
}
