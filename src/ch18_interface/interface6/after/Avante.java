package ch18_interface.interface6.after;

public class Avante implements Car{ // 구현 클래스(상세사항, Detail)
    @Override
    public void onEnglish(){
        System.out.println("아반떼 엔진을 켭니다.");
    }
    @Override
    public void offEnglish(){
        System.out.println("아반떼 엔진을 끕니다.");
    }
    @Override
    public void pressAccel(){
        System.out.println("아반떼 엑셀을 밟습니다.");
    }
    @Override
    public void pressBreak(){
        System.out.println("아반떼 브레이크를 밟습니다.");
    }
}
