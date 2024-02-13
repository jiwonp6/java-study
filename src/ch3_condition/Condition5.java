package ch3_condition;
// #4-5  조건문5(2024-02-08)
public class Condition5 {
    public static void main(String[] args) {
        
        // 변수 설정
        int score = 60;

        // 점수가 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 70점 미만이면 D

        if(score >= 90){

            System.out.println("A");

        } else if (score >=80) {

            System.out.println("B");

        } else if (score >=70) {

            System.out.println("C");

        } else {

            System.out.println("D");

        }
    }
}
