package ch16_inheritance.ex2;
// #15 상속 (2024-02-22)
public class Ex2 {
    /*
        <음악 플레이어 시스템 구현>
        요구사항
        음악 플레이어 시스템을 위한 자바 프로그램을 작성합니다.
        이 시스템은 모든 음악 트랙(MusicTrack)을 관리하며,
        특별한 유형의 트랙으로 ClassicalMusicTrack과 PopMusicTrack을 다룹니다.
        이 세 유형의 트랙은 음악의 기본 정보를 공유하지만,
        각각의 특성에 맞는 추가 정보도 관리해야 합니다.

        MusicPlayer 클래스:
        main 메소드에서 다음을 수행합니다:
        각 유형의 트랙 객체를 생성합니다.
        생성된 모든 트랙을 재생합니다.

        출력 예시
        ===
        Playing Symphony No. 9 by Beethoven, Composer: Beethoven
        Playing Shape of You by Ed Sheeran, Album: Divide

     */
    public static void main(String[] args) {
        MusicTrack musicTrack1 = new MusicTrack("Symphony No. 9", "Beethoven", 3);
        MusicTrack musicTrack2 = new MusicTrack("Shape of You", "Ed Sheeran", 3);
        musicTrack1.play();
        System.out.println(" ");
        musicTrack2.play();
        System.out.println(" ");

        PopMusicTrack popMusicTrack = new PopMusicTrack("Shape of You", "Ed Sheeran", 3, "Divide");
        popMusicTrack.play();

        ClassicalMusicTrack classicalMusicTrack = new ClassicalMusicTrack("Symphony No. 9", "Beethoven", 3, "Beethoven");
        classicalMusicTrack.play();



    }

}
