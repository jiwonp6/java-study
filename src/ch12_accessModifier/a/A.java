package ch12_accessModifier.a;
// #11 접근제한자 (2024-02-20)
public class A {
    /* 내부에서 접근 */
    A publicA = new A(100);             // public 내부 접근 가능
    A defaultA = new A();                 // default 내부 접근 가능
    A privateA = new A("private");     // private 내부 접근 가능

    /* 접근제한자에 따른 3가지 종류의 생성자 */
    // public
    public A(int i){
        System.out.println("public A 생성자");
    }
    
    // default
    A(){    // default 는 명시하면 X
        System.out.println("default 클래스 A 생성");
    }

    // private
    private A(String j){
        System.out.println("private A 생성자");
    }
}
