package quiz.quiz3.q2;

public class Button implements OnClickListener{
    OnClickListener onClickListener;

    // 메소드
    public void setOnClickListener(OnClickListener listener){

    }

    void click(OnClickListener listener){
//        if (!listener){
//
//        }
    }

    @Override
    public void onClick() {
        System.out.println("버튼이 클릭되었습니다.");
    }
}
