package quiz2.q1;

public class ReferenceBook extends Book{
    String field;

    public ReferenceBook(String title, String author, int year, String field) {
        super(title, author, year);
        this.field = field;
    }

    @Override
    public void displayInfo() {
        System.out.println("도서제목 : " + title + ", 저자 : " + author + ", 출판연도 : " + year + ", 분야 : " + field);
    }
}
