package ch26_lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Function8_WithCollection {
    public static void main(String[] args) {
        // Collection 프라임워크와 함께 사용
        List<String> nameList = new ArrayList<>();
        nameList.addAll(
                List.of("홍길동", "임꺽정", "전우치")
        );

        // Consumer 타입(함수형 인터페이스 = 함수)을 매개변수로 받음
        Consumer<String> printConsumer = s -> System.out.println(s);
        nameList.forEach(printConsumer);    // 변수에 저장하여 대입
        // = nameList.forEach(s -> System.out.println(s));  // 람다식으로 바로 대입

    }
}
