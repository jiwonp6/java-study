package ch20_nested.nested1;

public class Main {
    public static void main(String[] args) {
        // var 키워드 : 지역 변수의 타입 추론 기능
            // OuterClass.NestedStaticClass <= 원래
        // 1. static 중첩 클래스 : OuterClass 인스턴스 생성 없이도 바로
            // . 접근을 통해 클래스를 생성할 수 있음.
        var nested = new OuterClass.NestedStaticClass();

        nested.printMessage();

        // 2. (인스턴스) 내부 클래스 : 외부 클래스 인스턴스를 먼저 생성하고
            // 생성된 인스턴스에서 접근할 수 있다.
        OuterClass outerInstance = new OuterClass();
        // var instanceInnerClass = new OuterClass.InstanceInnerClass();
        var instanceInnerClass = outerInstance.new InstanceInnerClass();
        instanceInnerClass.printMessage();

        // 3. 지역 클래스 : 외부 클래스에서 지역 메소드에 접근해서 사용 가능, 지역 내부에서 사용이 완료됨
        outerInstance.displayMessage();

        // 4. 다른 클래스에서 정적 중첩 클래스 생성 시
        School.Student student = new School.Student("박길동", 70);

    }
}
