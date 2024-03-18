package ch25_collection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;
import java.util.Stack;

public class BrowserHistoryGUI extends JFrame {
    Stack<String> history = new Stack<>();

    public BrowserHistoryGUI() {
        // 페이지 방문
        history.push("www.example.com");
        history.push("www.example.com/about");
        history.push("www.example.com/contact");

        this.setTitle("스택으로 구현한 뒤로가기 버튼");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton backButton = new JButton("뒤로 가기");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBack();
            }
        });

        this.add(backButton);

        setVisible(true);
    }

    private void goBack() {
        try {
            System.out.println("현재 페이지: " + history.pop());
            System.out.println("이전 페이지로 돌아갑니다: " + history.peek());
        } catch (EmptyStackException e) {
            System.out.println("더 이상 돌아갈 페이지가 없습니다");
        }
    }

    public static void main(String[] args) {
        new BrowserHistoryGUI();
    }

}
