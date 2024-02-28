package ch18_interface.interface6.after;

public class Sonata implements Car{

    @Override
    public void onEnglish(){
        System.out.println("소나타 엔진을 켭니다.");
    }
    @Override
    public void offEnglish(){
        System.out.println("소나타 엔진을 끕니다.");
    }
    @Override
    public void pressAccel(){
        System.out.println("소나타 엑셀을 밟습니다.");
    }
    @Override
    public void pressBreak(){
        System.out.println("소나타 브레이크를 밟습니다.");
    }
}
