package ch16_inheritance.ex2;
// #15 상속 (2024-02-22)
public class MusicTrack {
    /*
        MusicTrack 클래스:
        공통 필드: title (트랙 제목), artist (아티스트), duration (재생 시간, 초 단위)
        메소드: play() - 트랙 재생을 나타내는 메시지를 출력(예: "Playing [title] by [artist]")
     */
    // 필드
    protected String title;
    protected String artist;
    protected int duration;

    // 생성자


    public MusicTrack() {
    }
    public MusicTrack(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // 메소드
    void play(){
        System.out.print("Playing [" + title + "] by [" + artist + "]");
    }
}
