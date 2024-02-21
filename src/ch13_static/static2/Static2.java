package ch13_static.static2;

// #12 자바 메모리 영역 구조 (2024-02-21)
public class Static2 {
    public static void main(String[] args) {
        // 일반적인 방법으로 필드에 갯수 정보가 생성될 때마다 공유되지 않는다. 각자 개별의 변수 count이므로 다 1, 1, 1
        Obj obj1 = new Obj("객체1");
        System.out.println(obj1.count1);         // 1
        Obj obj2 = new Obj("객체2");
        System.out.println(obj2.count1);         // 2 => 1
        Obj obj3 = new Obj("객체3");
        System.out.println(obj3.count1);         // 3 => 1

        // 외부에서 생성될 때마다 카운터 객체를 주입하여 개수를 센다.
        Counter counter = new Counter();
        Obj obj4 = new Obj("객체4", counter);
        System.out.println(counter.count);         // 1
        Obj obj5 = new Obj("객체5", counter);
        System.out.println(counter.count);         // 2
        Obj obj6 = new Obj("객체6", counter);
        System.out.println(counter.count);         // 3

        // static 키워드를 적용하게 될 경우 메서드 영역에서 변수 정보를 공유한다.
        Obj obj7 = new Obj();
        System.out.println(obj7.count2);         // 1
        Obj obj8 = new Obj();
        System.out.println(obj8.count2);         // 2
        Obj obj9 = new Obj();
        System.out.println(obj9.count2);         // 3

        // static 필드(= 클래스 변수)는 클래스를 통해 접근 가능하다.
        System.out.println("\n객체의 개수 : " + Obj.count2);

    }
}
