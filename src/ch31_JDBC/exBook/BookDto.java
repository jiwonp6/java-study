package ch31_JDBC.exBook;

public class BookDto {
    private String isbn;
    private String title;
    private String author;
    private int publish_year;
    private String genre;

    public BookDto(String isbn, String title, String author, int publish_year, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publish_year = publish_year;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublish_year() {
        return publish_year;
    }

    public void setPublish_year(int publish_year) {
        this.publish_year = publish_year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
