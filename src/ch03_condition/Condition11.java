package ch03_condition;
// #4-11 삼항 연산자 ~ 조건문(2024-02-08)
public class Condition11 {
    public static void main(String[] args) {
        // 삼항 연산자도 조건문처럼 사용 가능
        int age = 18;
        String status = ((age >= 18) ? "성인" : "미성년자");

        System.out.println(status + "입니다.");
    }
}
