package ch25_collection.set.ex5;

import java.util.Objects;

public class Character {
    // 필드
    private String id;
    private String name;

    // 생성자
    public Character(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // 오버라이딩
    @Override
    public String toString() {
        return "[캐릭터 정보] ID : " + id + ", 이름 : " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(id, character.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
