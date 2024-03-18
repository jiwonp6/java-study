package ch26_lambda.function;

import ch26_lambda.function.ex_consturctorRef.Member;
import ch26_lambda.function.ex_consturctorRef.User;

public class Function10_ConstructorRef {
    public static void main(String[] args) {
        /*
            생성자 참조 => 객체를 생성하고 리턴하도록 단순하게 구성된 경우
            람다식을 생성자 참조로 대치할 수 있음.

            (a, b) -> { return new className (a, b) };
            = className :: new (생성자 참조)
         */
        // 객체
        User user = new User();

        // 람다식으로 매개변수 자리에 객체 생성 리턴
        Member member1 = user.getMember1((id) -> new Member(id));
        Member member2 = user.getMember2((id, name) -> new Member(id, name));

        // 메소드 참조로 변경할 경우
        Member member3 = user.getMember1(Member::new);
        Member member4 = user.getMember2(Member::new);

    }
}
