package ch26_lambda.function;

public class Function2_ExButton {
    public static void main(String[] args) {
        // 매개변수 X, 반환 값 X
        Runnable dogSound = () -> System.out.println("멍멍");
        Runnable duckSound = () -> System.out.println("꽥꽥");

        dogSound.run();
        duckSound.run();

        // 클릭 리스너의 매개변수에 "함수"를 설정 : 기존 선언된 변수
        Button dogButton = new Button("개");
        dogButton.setOnClickListener(dogSound);

        // 클릭 리스너의 매개변수에 "함수"를 설정 : 람다식으로 새롭게 선언
        Button duckButton = new Button("오리");
        duckButton.setOnClickListener(() -> {
            System.out.println(duckButton.getText() + "의 울음소리");
            System.out.println("꽥꽥");
        });

        dogButton.onClick();
        duckButton.onClick();



    }
}
