package ch12_accessModifier.c;
// #11 접근제한자 (2024-02-20)
import ch12_accessModifier.a.A;

public class C {
    // 다른 패키지에서는 default 접근제한자에 접근 불가
    // A a = new A();

    /* 외부 패키지에서 접근 */
    A publicA = new A(100);             // public 내부 접근 가능
    // A defaultA = new A();                 // default 내부 접근 불가
    // A privateA = new A("private");     // private 내부 접근 불가
}
