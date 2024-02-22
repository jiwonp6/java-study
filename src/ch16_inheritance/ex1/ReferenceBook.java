package ch16_inheritance.ex1;

public class ReferenceBook extends Book{
    /*
        ReferenceBook(참고서) 클래스:
        Book 클래스로부터 상속받습니다.
        추가 필드: field (참고서 분야, 예: "과학", "수학")
        displayInfo() 메소드를 오버라이딩하여, 참고서의 경우 추가적으로 분야도 출력합니다.
     */
    // 필드
    protected String field;

    public ReferenceBook(String title, String author, int year, String field) {
        super(title, author, year);
        this.field = field;
    }

    // 생성자
    public ReferenceBook(String field) {
        this.field = field;
    }

    // 메소드
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\t분야 : " + field);
    }
}
