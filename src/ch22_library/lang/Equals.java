package ch22_library.lang;

public class Equals {
    // Object 클래스의 equals 메소드는 객체의 동등성을 비교하는데 사용
    // 기본 구현 값은 this == obj (실제로 같은 객체인지 비교)
    // 오버라이딩을 통해 논리적 동등성을 구현할 수 있다.
    Object1 object;

    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 30);
        Person person2 = new Person("홍길동", 30);
        Person person3 = new Person("홍길동", 60);
        Person person4 = null;

        Cat cat = new Cat("홍길동", 30);

        // 동등성 비교
        System.out.println(person1.equals(person2));    // false -> 주소가 다르기 때문
        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person4));
        System.out.println(person1.equals(cat));


    }
}

class Person{
    // 필드
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메소드
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } else if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        } else  {
            return ((Person) obj).name.equals(name) && (((Person) obj).age == age);    // 다운 캐스팅
        }
    }
}

class Cat{
    // 필드
    private String name;
    private int age;

    // 생성자
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
