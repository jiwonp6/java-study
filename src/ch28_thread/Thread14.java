package ch28_thread;

import java.util.Arrays;
import java.util.List;

public class Thread14 {
    // 생산자 - 소비자 모델 : 디자인 패턴
    // 생산자 (Producer) : 데이터를 생성하고, 버퍼에 추가
                        // => 버퍼가 가득 차 있으면 대기
    // 소비자 (Consumer) : 버퍼에서 데이터를 꺼내서 사용
                        // => 버퍼가 비어있으면 대기
    // 버퍼 : 생산자가 생성한 데이터를 임시로 저장하는 공간. (유한한 크기)

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        List<String> customerList = Arrays.asList("홍길동", "임꺽정", "이몽룡", "김영희", "김철수");

        customerList.stream()
                    .forEach(customer -> new Thread(new Customer(customer, coffeeMachine)).start());

        // 생산자의 스레드
        new Thread(new Manager(coffeeMachine)).start();

    }
}

class CoffeeMachine {
    final int CUP_MAX = 10;     // 버퍼의 크기 (최대치)
    int cups = CUP_MAX;

    // 커피를 소비
   synchronized public void takeOut(Customer customer) {
        // 1. 버퍼가 비어있을 경우
        while (cups <= 0) {
            System.out.printf("[%d 잔] %s : 준비된 커피가 없습니다.\n", cups, customer.name);
            try {
                wait();     // 버퍼가 비어있으면(커피가 없으면) wait
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {   // 간격 1초
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 2. 버퍼가 있을 경우 (버퍼를 1개 줄임)
        System.out.printf("[%d 잔] %s : 커피 한 잔 테이크아웃.\n", cups, customer.name);
        cups--;

        notifyAll();

        // 모두에게 알리고 대기모드에 들어감
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    // 커피를 생산
    synchronized public void fill() {
        // 커피가 여유 있으면 대기
        while (cups > 3) {
            System.out.printf("[%d 잔] 매니저 : 커피가 준비되어 있습니다.\n", cups);
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {   // 간격 1초
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 버퍼를 가득 채운 후, 다른 스레드에게 알리고 대기
        System.out.printf("[%d 잔] 매니저 : 커피를 준비합니다.\n", cups);
        cups = CUP_MAX;

        notifyAll();

        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

// 소비자
class Customer implements Runnable {
    String name;
    CoffeeMachine coffeeMachine;

    public Customer(String name, CoffeeMachine coffeeMachine) {
        this.name = name;
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void run() {
        while (true) {
            coffeeMachine.takeOut(this);
        }
    }
}

// 생산자
class Manager implements Runnable {
    CoffeeMachine coffeeMachine;

    public Manager(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void run() {
        while (true) {
            coffeeMachine.fill();
        }
    }
}