package ch18_interface.interface5;

public abstract class Animal {
    // 추상 클래스
    // 추상 메소드
    public abstract void sound();
    // 일반 메소드
    public void move(){
        System.out.println("동물이 이동합니다.");
    }
}
