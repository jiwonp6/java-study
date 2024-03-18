package ch26_lambda.function;

public class Button {
    // 필드
    private String text;
    private Runnable onClickListener;   // 람다식 함수

    // 생성자
    public Button(String text) {
        this.text = text;
    }

    // 세터
    public void setOnClickListener(Runnable onClickListener) {
        this.onClickListener = onClickListener;
    }

    // 게터
    public String getText() {
        return text;
    }

    // 클릭 이번트 발생 시 실행 메소드
    public void onClick() {
        onClickListener.run();
    }

}
