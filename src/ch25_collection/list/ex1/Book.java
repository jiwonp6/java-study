package ch25_collection.list.ex1;

public class Book implements Media{
    // 필드
    private String title;
    private String author;

    // 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 오버라이드
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDetail() {
        return "Author : " + author;
    }

}
