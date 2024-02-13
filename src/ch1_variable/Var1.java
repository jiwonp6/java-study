package ch1_variable;
//#2-1 변수 선언(2024-02-07)
public class Var1 {
    public static void main(String[] args) {

        int age;    // 정수를 저장할 수 있는 age 이름의 변수 선언
        double value;   // 실수를 저장할 수 있는 value라는 이름의 변수 선언

        int x, y, z;    // 같은 종류의 변수 한꺼번에 선언 가능

        int score;  // 변수 선언 Declare, 같은 이름의 변수는 한 번만 가능
        score = 90; // 변수 초기화 initilize
        System.out.printf("first score : " + score + "\n");
        score = 100;
        System.out.printf("changed score : " + score + "\n");
        
        int num = 100;  // 선언과 초기화 동시에 가능
        System.out.printf("num : " + num + "\n");

        int result = score + num;   // 다른 변수의 값을 불러들여 연산, 저장
        System.out.printf("score + num : " + result);
        
    }
}
