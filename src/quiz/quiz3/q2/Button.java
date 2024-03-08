package quiz.quiz3.q2;

public class Button {
    private ch20_nested.ex.ex2.OnClickListener listener;

    public void setOnClickListener(ch20_nested.ex.ex2.OnClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        // null일 때 예외처리
        if (listener == null) {
            return;
        }
        listener.onClick();
    }
}
