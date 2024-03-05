package ch22_library.lang.lang3_equals;

public class Person{
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
