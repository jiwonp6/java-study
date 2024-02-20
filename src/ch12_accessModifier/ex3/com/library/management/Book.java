package ch12_accessModifier.ex3.com.library.management;
// #11 접근제한자 (2024-02-20)
public class Book {
    /* 필드 : 데이터 */
    private String title;
    private String author;

    /* 생성자 */
    public void book(){}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /* 메소드 */
    // getter
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    // setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
