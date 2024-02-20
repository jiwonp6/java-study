package ch12_accessModifier.ex3.com.library.management;
// #11 접근제한자 (2024-02-20)
public class Library {
    /* 필드 : 데이터 */
    private Book[] books;
    private int index = 0;

    /* 생성자 */
    public Library(int capacity) {
        books = new Book[capacity];
    }

    /* 메소드 */
    public void addBook(Book book){
        books[index] = book;

        index++;
    }

    public void listBooks(){
        for (int i = 0; i < books.length; i++) {
            System.out.println("책 이름 : " + books[i].getTitle() + ", 저자 : " + books[i].getAuthor());
        }
    }

}
