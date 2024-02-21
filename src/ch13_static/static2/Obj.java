package ch13_static.static2;

import ch13_static.static2.Counter;

// #12 자바 메모리 영역 구조 (2024-02-21)
public class Obj {
    // 필드
    String name;    // 객체의 이름

    int count1;      // 객체의 개수
                       // 인스턴스 멤버변수인 경우 : 개수가 공유되지 않는다.(힙영역 객체 내부에 저장)
    static int count2;      // 객체의 개수 : static
                           // 메소드 영역의 static 영역에 저장되며, 모든 객체에서 공유되게 된다.

    // 생성자
    // 1. 일반적인 방법용
    Obj(String name){
        this.name = name;   // 생성하면서 이름 초기화
        count1++;            // 객체 갯수 증가
    }

    // 2. 카운터 객체를 주입용
        // 숫자를 세는 다른 객체를(공유됨) 매개변수로 가져와서 생성될 때마다 계수기의 개수 증가
    Obj(String name, Counter counter){
        this.name = name;
        counter.count++;
    }

    // 3. static 키워드 적용용
    Obj(){
        //this.name = name;   // 생성하면서 이름 초기화
        count2++;            // 객체 갯수 증가
    }
}
