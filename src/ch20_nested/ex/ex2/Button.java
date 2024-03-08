package ch20_nested.ex.ex2;

public class Button {
    private OnClickListener listener;

    public void setOnClickListener(OnClickListener listener) {
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
