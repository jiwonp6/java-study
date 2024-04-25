package ch31_JDBC.exBook;

import java.util.List;

public interface BookDao {
    void insert(BookDto book);
    void delete(String isbn);
    void update(BookDto book);
    List<BookDto> lookUpBooks();
    BookDto getBookByIsbn(String isbn);
    List<BookDto> getBookByTitleOrAuthor(String search);
}
