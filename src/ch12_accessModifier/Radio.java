package ch12_accessModifier;
// #11 접근제한자 (2024-02-20)
public class Radio {
    // 필드
    private int volume;     // 요구사항 : 음량이 10을 넘어서는 안됨.
                            // private으로 접근 제한자 변경 : 내부에서는 사용 가능 + 외부는 불가
    // 메소드
    public void volumeUp(){
        if (volume >= 10){
            System.out.println("최대 볼륨입니다.");
            return;     // 메소드 종료
        }else {
            volume++;
            System.out.println("볼륨을 증가합니다.");

        }
    }
    public void volumeDown(){
        volume--;
        System.out.println("볼륨을 증가합니다.");
    }
    public void printVolume(){
        System.out.println("현재 볼륨 : " + volume);
    }

}
