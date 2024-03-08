package quiz.quiz2.q1;

public class Quiz1 {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        ReferenceBook rBook = new ReferenceBook("Math Handbook", "John Doe", 1999, "Mathematics");

        book.displayInfo();
        rBook.displayInfo();

    }
}
