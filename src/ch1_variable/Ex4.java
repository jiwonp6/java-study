package ch1_variable;
//#2-8 연습문제 4(2024-02-07)
public class Ex4 {
    public static void main(String[] args) {
        /*
            정수 타입의 변수 "number"를 선언하고, 값으로 10을 할당하세요.
            소수 타입의 변수 "decimal"를 선언하고, 값으로 3.14를 할당하세요.
            문자 타입의 변수 "letter"를 선언하고, 값으로 'A'를 할당하세요.
            부울 타입의 변수 "isTrue"를 선언하고, 값으로 true를 할당하세요.
            변수 값 변경:

            "number" 변수의 값을 5로 변경하고, 변경된 값을 출력하세요.
            "decimal" 변수의 값을 2.71828로 변경하고, 변경된 값을 출력하세요.
            "letter" 변수의 값을 'B'로 변경하고, 변경된 값을 출력하세요.
            "isTrue" 변수의 값을 false로 변경하고, 변경된 값을 출력하세요.
         */

        int number = 10;
        float decimal = 3.14f;
        char letter = 'A';
        boolean isTrue = true;

        System.out.printf("Before changed ) " + "number : " + number + ", decimal : " + decimal
               + ", letter : " + letter + ", isTrue : " + isTrue);

        System.out.printf("\n");

        number = 5;
        decimal = 2.71828f;
        letter = 'B';
        isTrue = false;

        System.out.printf("After changed ) " + "number : " + number + ", decimal : " + decimal
               + ", letter : " + letter + ", isTrue : " + isTrue);


    }
}
