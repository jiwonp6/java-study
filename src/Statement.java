// ex2. 실행문
public class Statement {
    public static void main(String[] args) {
        // 실행문 끝에는 반드시 세미콜론을 붙여서 실행문이 끝났음을 표시해야 한다.
        // System.out.println("Hello") <- 작동안됨
        System.out.println("<실행문 수행>");

        // 실행문의 종류
        int x;  // x라는 변수를 선언
        x = 1;  // x에 1을 저장

        int y = 2; // y를 선언하고 2를 저장 (동시)

        int result = x + y; // result를 선언하고 x와 y를 더해서 저장
        
        System.out.printf("result = "+result);  //출력
    }
}
