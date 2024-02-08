package operator;
// #3-11 삼항연산자 (2024-02-08)
public class Operator11 {
    public static void main(String[] args) {
        // 3개의 피연산자를 필요로 하는 연산자
        // 조건식 ? 참일 경우 : 거짓일 경우

        int score = 85;

        // 성적이 90점 이상 => 참이면 A, 거짓이면 B
        String grade = (score > 90) ? "A" : "B";

        System.out.println("grade = " + grade);
        
        // 삼항연산자는 조건문으로 풀어서 사용가능

    }
}
