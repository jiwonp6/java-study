package ch18_interface.ex3;

public abstract class Character { 
    // 필드 : 이름
    protected String name;

    // 생성자
    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
