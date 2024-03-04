package ch20_nested.nested2;

// GUI 컴포넌트를 사용(Swing)
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickFrame extends JFrame {
    // JFrame을 상속받는 클래스 정의
    // 생성자
    public ClickFrame(){
        // 프레임에 버튼 생성하고, 버튼 클릭할 시,
            // 내부 클래스의 이벤트 리스너에서 구현된 메소드가 실행될 수 있도록 추가
        JButton button = new JButton("클릭해보세요.");
        button.addActionListener(new ButtonClickListener());

        // 프레임 내부 GUI 구현
        this.add(button);
        this.setSize(300, 300);
        this.setVisible(true);
    }
    
    // 내부 클래스를 정의하고, ActionListener를 구현
    class ButtonClickListener implements ActionListener{
        // 클릭되었을 때 실행되는 메소드
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("버튼이 클릭되었습니다.");
        }
    }

    // 실행 메소드
    public static void main(String[] args) {
        new ClickFrame();
    }

}
