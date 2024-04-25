package ch31_JDBC.exBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao{
    Connection conn;
    public BookDaoImpl(Connection conn) {
        this.conn = conn;
    }
    @Override
    public void insert(BookDto book) {
        String sql = "INSERT INTO books (isbn, title, author, publish_year, genre) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, book.getIsbn());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setInt(4, book.getPublish_year());
            pstmt.setString(5, book.getGenre());
            pstmt.executeUpdate();
            System.out.println("도서가 추가되었습니다.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String isbn) {
        String sql = "DELETE FROM books WHERE isbn = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, isbn);
            int i = pstmt.executeUpdate();
            if (i != 0) {
                System.out.println("도서가 삭제되었습니다.");
            }else {
                System.out.println("삭제할 책이 없습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(BookDto book) {
        String sql = "UPDATE books SET title = ?, author = ?, publish_year = ?, genre = ? WHERE isbn = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setInt(3, book.getPublish_year());
            pstmt.setString(4, book.getGenre());
            pstmt.setString(5, book.getIsbn());
            int i = pstmt.executeUpdate();
            if (i!=0) {
                System.out.println("도서 정보가 업데이트되었습니다.");
            } else {
                System.out.println("수정에 실패하였습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<BookDto> lookUpBooks() {
        List<BookDto> books = new ArrayList<>();
        String sql = "SELECT isbn, title, author, publish_year, genre FROM books";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String isbn = rs.getString("isbn");
                String title = rs.getString("title");
                String author = rs.getString("author");
                int publish_year = rs.getInt("publish_year");
                String genre = rs.getString("genre");
                BookDto book = new BookDto(isbn, title, author, publish_year, genre);
                books.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return books;
    }

    @Override
    public BookDto getBookByIsbn(String isbn) {
        BookDto book = null;
        String sql = "SELECT isbn, title, author, publish_year, genre FROM books WHERE isbn = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, isbn);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String title = rs.getString("title");
                String author = rs.getString("author");
                int publish_year = rs.getInt("publish_year");
                String genre = rs.getString("genre");
                book = new BookDto(isbn, title, author, publish_year, genre);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return book;
    }

    @Override
    public List<BookDto> getBookByTitleOrAuthor(String search) {
        List<BookDto> books = new ArrayList<>();
        String sql = "SELECT isbn, title, author, publish_year, genre FROM books WHERE title = ? OR author = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, search);
            pstmt.setString(2, search);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String isbn = rs.getString("isbn");
                String title = rs.getString("title");
                String author = rs.getString("author");
                int publish_year = rs.getInt("publish_year");
                String genre = rs.getString("genre");
                BookDto book = new BookDto(isbn, title, author, publish_year, genre);
                books.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return books;
    }
}
