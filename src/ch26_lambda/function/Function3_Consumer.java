package ch26_lambda.function;

import java.util.function.Consumer;

public class Function3_Consumer {
    public static void main(String[] args) {
        // Consumer :
        // 1. 매개변수 하나만 있고, 리턴 값 없는 함수형 인터페이스
        Consumer<Integer> oddEven = number -> {
            if (number % 2 == 0){
                System.out.println(number + "은(는) 짝수입니다.");
            } else {
                System.out.println(number + "은(는) 홀수입니다.");
            }
        };

        oddEven.accept(2);      // 변수에 저장된 함수 실행
        oddEven.accept(5);

        // 2. 매개변수에 객체, 리턴값에 함수
        Button dogButton = new Button("개");     // 버튼 객체 생성
        dogButton.setOnClickListener(() -> System.out.println("멍멍"));

        Consumer<Button> clickButton = button -> button.onClick();
            // 버튼을 클릭하는 함수(람다식)를 함수형 인터페이스(변수)에 저장

        clickButton.accept(dogButton);
            // 버튼 클릭 발생 : 변수에 저장된 함수(객체를 실행하는 람다식)를 실행

    }
}
