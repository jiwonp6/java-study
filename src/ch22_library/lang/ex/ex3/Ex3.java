package ch22_library.lang.ex.ex3;

public class Ex3 {
    /*
        hashCode() 메서드와 equals() 메서드를 오버라이딩하여 구현하세요.
        => 오버라이딩 안하면 다 다름 (주소값 반환)
        age만 사용하는 경우, name, age 필드 모두 사용하는 경우
     */
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("John Doe", 30);
        Person person3 = new Person("John Doe", 20);
        Person person4 = new Person("John Smith", 30);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person4.hashCode());

        System.out.println(person1.equals(person2));    // age : true   || name & age : true
        System.out.println(person1.equals(person3));    // age : false  || name & age : false
        System.out.println(person1.equals(person4));    // age : true   || name & age : false
    }
}
