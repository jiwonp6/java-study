package ch16_inheritance.ex1;

public class Book {
    /*
        Book 클래스:
        공통 필드: title (도서 제목), author (저자), year (출판 연도)
        메소드: displayInfo() - 도서 정보(제목, 저자, 출판 연도)를 출력
     */
    // 필드 (protected 접근제어자를 활용하면, 상속관계에서 접근 가능)
    protected String title;
    protected String author;
    protected int year;

    // 생성자
    public Book() {
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // 메소드
    public void displayInfo(){
        System.out.print("제목 : " + title + "\t저자 : " + author + "\t출판년도 : " + year);
    }


}
