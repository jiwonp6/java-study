package ch16_inheritance.ex1;
// #15 상속 (2024-02-22)
public class Ex1 {
    private static ReferenceBook referenceBook;

    public static void main(String[] args) {
        /*
            <온라인 도서관 시스템 구현>
            요구사항
            온라인 도서관 시스템을 위해 여러 유형의 도서를 관리하는 자바 프로그램을 작성합니다.
            이 시스템은 일반 도서(Book)와 참고서(ReferenceBook)를 다루며,
            도서의 본 정보를 상속받아야 합니다.

            Main 클래스:
            main 메소드에서 다음을 수행합니다:
            일반 도서와 참고서 객체를 각각 생성합니다.
            생성된 모든 도서의 정보를 출력합니다.

            출력 예시
            ===
            Title: The Lord of the Rings, Author: J.R.R. Tolkien, Year: 1954
            Title: Math Handbook, Author: John Doe, Year: 1999, Field: Mathematics
         */
        ReferenceBook referenceBook = new ReferenceBook("Math Handbook", "John Doe", 1999, "Mathematics");
        String field1 = referenceBook.field;
        referenceBook.displayInfo();

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("Math Handbook", "John Doe", 1999);
        book1.displayInfo();
        System.out.println(" ");
        book2.displayInfo();


    }
}
