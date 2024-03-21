package ch28_thread;

public class Thread4_setName {
    // 스레드에 이름 주기
    // getName, setName 등
    // 스레드가 생성될 때 이름 할당받음
    // 디버깅할 때, 스레드 구분할 때 사용
    // 개발자가 setName 등을 통해 명시적으로 이름 지정 가능
    public static void main(String[] args) {
        // 이 코드를 실행하는 메인 스레드의 스레드 객체 참조
        Thread mainThread = Thread.currentThread();
        System.out.println("mainThread name: " + mainThread.getName());

        // 스레드 이름 가져오기
        Thread thread0 = new Thread() {
            @Override
            public void run() {
                // 인스턴스 내부에서 이름 반환하여 출력
                System.out.println("thread0 name: " + getName());
            }
        };

        thread0.start();

        // 람다식에서 스레드를 생성하고 이름 가져오는 경우
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("thread1 name: " + Thread.currentThread().getName());
            }
        };
        thread1.start();

        // 스레드 이름 설정
        Thread threadChat = new Thread() {
            @Override
            public void run() {
                // 인스턴스 내부에서 이름 반환하여 출력
                System.out.println("threadChat name: " + getName());
            }
        };
        // 작업 스레드의 이름을 변경하여 설정
        threadChat.setName("Chatting");

        threadChat.start();

        // 생성자에서 이름을 주는 방법
        Thread thread = new Thread("스레드 이름");
        System.out.println("thread name: " + thread.getName());

        Thread thread2 = new Thread(
                () -> {
                    System.out.println("thread2 name: " + Thread.currentThread().getName());
                }, "스레드 이름2"
        );
        thread2.start();

    }
}
