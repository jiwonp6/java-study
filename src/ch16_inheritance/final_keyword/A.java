package ch16_inheritance.final_keyword;
// #15 상속 (2024-02-22)
// 클래스에 선언된 final의 경우 더 이상 상속받을 수 없음을 나타낸다.
// final public class A <- 불가능!
public class A {
    final public void method(){
        System.out.println("final 메서드");
    }
    public void method(int value){
        System.out.println("메서드");
    }
}
