package ch24_generic.ex4;

public class Book implements Media{
    // 필드
    private String title;
    private String author;

    // 생성자
    public Book( String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
