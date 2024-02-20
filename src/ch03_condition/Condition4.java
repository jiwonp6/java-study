package ch03_condition;
// #4-4  조건문4(2024-02-08)
public class Condition4 {
    public static void main(String[] args) {
        // 변수 설정
        int age = 10;

        // 조건문
        if (age <=7) {

            System.out.println("미취학아동입니다.");

        } else if (age <= 13){

            System.out.println("초등학생입니다.");

        } else if (age <= 16){

            System.out.println("중학생입니다.");

        } else if (age <= 19){

            System.out.println("고등학생입니다.");

        } else {

            System.out.println("성인입니다.");

        }
    }
}
