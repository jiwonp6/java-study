package quiz.quiz2.q1;

public class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("도서제목 : " + title + ", 저자 : " + author + ", 출판연도 : " + year);
    }
}
