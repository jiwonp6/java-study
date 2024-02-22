package ch16_inheritance.ex2;
// #15 상속 (2024-02-22)
public class ClassicalMusicTrack extends MusicTrack{
    /*
        ClassicalMusicTrack 클래스:
        MusicTrack 클래스로부터 상속받습니다.
        추가 필드: composer (작곡가)
        play() 메소드를 오버라이딩하여, 작곡가 정보도 함께 출력합니다.
     */
    // 필드
    protected String composer;

    // 생성자

    public ClassicalMusicTrack(String title, String artist, int duration, String composer) {
        super(title, artist, duration);
        this.composer = composer;
    }

    // 메소드
    @Override
    void play() {
        super.play();
        System.out.println(", (composer : " + composer + ")");
    }
}
