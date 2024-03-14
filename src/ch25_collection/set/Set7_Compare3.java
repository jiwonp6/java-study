package ch25_collection.set;

import java.util.TreeSet;

public class Set7_Compare3 implements Comparable<Set7_Compare3>{
    // 필드 (Person)
    private String name;
    private int age;

    // 생성자
    public Set7_Compare3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 나이 : " + age;
    }

    @Override
    public int compareTo(Set7_Compare3 other) {
        // 나이 기준으로 정수 비교 : 음수, 0, 양수
        int ageCompared = Integer.compare(this.age, other.age);

        // 나이가 같을 경우 이름으로 비교
        if (ageCompared == 0){
            int nameCompared = this.name.compareTo(other.name);
            return nameCompared;
        }

        // 나이가 다르면 나이순(1) 비교
        return ageCompared;
    }

    public static void main(String[] args) {
        TreeSet<Set7_Compare3> personTreeSet = new TreeSet<>();

        personTreeSet.add(new Set7_Compare3("홍길동", 50));
        personTreeSet.add(new Set7_Compare3("김길동", 30));
        personTreeSet.add(new Set7_Compare3("나길동", 30));
        personTreeSet.add(new Set7_Compare3("다길동", 30));
        personTreeSet.add(new Set7_Compare3("박길동", 20));
        personTreeSet.add(new Set7_Compare3("이길동", 20));

        for (Set7_Compare3 set7Compare3 : personTreeSet) {
            System.out.println(set7Compare3.toString());
        }
    }
}
