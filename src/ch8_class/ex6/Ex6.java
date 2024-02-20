package ch8_class.ex6;

import java.util.Scanner;

// #10 클래스 (2024-02-19)
public class Ex6 {
    public static void main(String[] args) {
        // 객체지향 코드로 변경
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        char op;

        calculator.inputNumbers();           // 값을 입력받기
        op = calculator.inputOperator();     // 연산자 받기
        calculator.printCalculateNumber(op);    // 연산하고 출력하기

    }
}
