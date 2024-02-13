package ch3_condition;
// #4-1  조건문(2024-02-08)
public class Condition1 {
    public static void main(String[] args) {
        /*
            나이가 18살 이상이면 성인입니다.
            나이가 18살 미만이면 미성년자입니다.
            if age >= 18 "성인입니다."
            if age < 18 "미성년자입니다."
         */
        
        // 변수 설정
        int age = 20;
        
        // 조건문
        if (age >= 18){

            System.out.println("성인입니다.");

        }

        if (age < 18) {

            System.out.println("미성년자입니다.");

        }
    }
}
