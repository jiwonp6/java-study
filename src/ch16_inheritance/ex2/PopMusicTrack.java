package ch16_inheritance.ex2;
// #15 상속 (2024-02-22)
public class PopMusicTrack extends MusicTrack{
    /*
        PopMusicTrack 클래스:
        MusicTrack 클래스로부터 상속받습니다.
        추가 필드: album (앨범 이름)
        play() 메소드를 오버라이딩하여, 앨범 정보도 함께 출력합니다.
     */

    // 필드
    protected String album;

    // 생성자
    public PopMusicTrack(String title, String artist, int duration, String album) {
        super(title, artist, duration);
        this.album = album;
    }

    // 메소드
    @Override
    void play() {
        super.play();
        System.out.println(", (album : " + album + ")");
    }
}
