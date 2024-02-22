package ch16_inheritance.final_keyword;
// #15 상속 (2024-02-22)
public class B extends A{
    // final 메소드는 오버라이드(재정의) 불가능
//    @Override
//    public void method(){
//        System.out.println("final 메서드 재정의");
//    }
    
    @Override
    public void method(int value){
        System.out.println("메서드 재정의");
    }
}
