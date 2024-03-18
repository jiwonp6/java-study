package ch26_lambda.function.ex_methodRef;

public class MR1 {
    public static void main(String[] args) {
        Person person = new Person();
        // 정적 메소드를 사용하는 경우
        person.action(Computer::staticSumMethod);
            // = person.action((x, y) -> Computer.staticSumMethod(x, y));

        // 인스턴스 메소드를 사용하는 경우
        Computer comInstance = new Computer();
        person.action(comInstance::instanceMultiMethod);

    }
}
