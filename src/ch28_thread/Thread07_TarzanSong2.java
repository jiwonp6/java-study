package ch28_thread;

import java.util.Scanner;

public class Thread07_TarzanSong2 {
    public static void main(String[] args) {
        // 스레드의 대기와 정지
        Thread tarzanThread = new Thread(new TarzanSong(10), "TarzanSong");

        tarzanThread.start();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (input.equals("the end?")){
                System.out.println("노래가 끝났나요?");
                // isAlive : 스레드 종료 여부에 따라, 진행중이면 true, 종료되면 false 리턴
                if (tarzanThread.isAlive()) {
                    System.out.println("아직 안끝났어요.");
                } else {
                    System.out.println("끝났습니다.");
                }
            }

            if (input.equals("still singing")){
                System.out.println("계속 듣자.");
                try {
                    // 해당 스레드의 작업이 종료될 때까지 현재 스레드를 대기 시킴
                    // 스레드의 작업 순서를 조정할 수 있음
                    tarzanThread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if (input.equals("stop")) {
                System.out.println("그만하자.");
                //
                tarzanThread.interrupt();
            }


            if (input.equals("q")) break;

            // 입력한 내용을 반복
            System.out.println(Thread.currentThread().getName() + " : " + input);
        }
    }
}
