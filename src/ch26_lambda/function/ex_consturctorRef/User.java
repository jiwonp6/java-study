package ch26_lambda.function.ex_consturctorRef;

import java.util.function.BiFunction;
import java.util.function.Function;

public class User {
    // 메소드
    // 매개변수로 문자열 정보를 받아 Member 객체를 반환하는 메소드
    public Member getMember1(Function<String, Member> function){
        String id = "spring";
        return function.apply(id);
    }
    public Member getMember2(BiFunction<String, String, Member> function){
        String id = "spring";
        String name = "홍길동";
        return function.apply(id, name);
    }

}
