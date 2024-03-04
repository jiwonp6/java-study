package ch20_nested.nested1;

public class OuterClass {
    // 1. 정적 중첩 클래스
    static class NestedStaticClass{
        // 정적 중첩 클래스 내부 메소드
        public void printMessage(){
            System.out.println("1. 정적 중첩 클래스의 메시지입니다.");
        }
    }

    // 2. 내부 클래스(Inner Class) : 외부 클래스의 인스턴스에 종속적인 클래스
    class InstanceInnerClass{
        public void printMessage(){
            System.out.println("2. 내부 클래스의 메시지입니다.");
        }
    }

    // 3. 지역 클래스(Local Class) : 메소드 내부에서 정의
    public void displayMessage(){
        // 메소드 지역 재부에서 선언되었으며, 메소드 내부에서만 사용할 수 있다.
        class LocalClass{
            void printMessage(){
                System.out.println("3. 지역 클래스의 메시지입니다.");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printMessage();

    }
        // localClass.printMessage();   <= 외부에서 사용불가
}
