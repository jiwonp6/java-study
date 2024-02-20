package ch10_class2.ex4;
// #10 클래스 (2024-02-19)
public class Board {
    /*
        1. Board 클래스의 생성자가 다음과 같이 오버로딩 되어 있습니다.
          생성자마다 중복 코딩 된 부분이 있습니다.
          this()를 활용해서 중복 코드를 제거해보세요 .
        2. main 메서드에서 Board 객체를 생성하는 네 가지 방법을 모두 사용해보세요.
     */
    String title;
    String content;
    String writer;
    String date;
    int hitCount;

    Board(String title, String content) {   // 5 -> 2
        this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);

        this.title = title;
        this.content = content;
//        this.writer = "로그인한 회원아이디";
//        this.date = "현재 컴퓨터 날짜";
//        this.hitCount = 0;
    }

    Board(String title, String content, String writer) { // 5 -> 3
        this(title, content, writer, "현재 컴퓨터 날짜", 0);
        this.title = title;
        this.content = content;
        this.writer = writer;
//        this.date = "현재 컴퓨터 날짜";
//        this.hitCount = 0;
    }

    Board(String title, String content, String writer, String date) {   // 5 -> 4
        this(title, content, writer, date, 0);
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
//        this.hitCount = 0;
    }

    public Board(String title, String content, String writer, String date, int hitCount) {  // 5
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitCount = hitCount;
    }
}
