package quiz.quiz7.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Quiz02 {
    public static void main(String[] args) {
        List<CoffeeOrder> coffeeOrderList = new ArrayList<>(
                List.of(
                        new CoffeeOrder("에스프레소", 2),
                        new CoffeeOrder("아메리카노", 3),
                        new CoffeeOrder("카푸치노", 5),
                        new CoffeeOrder("라떼", 4)
                )
        );

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        coffeeOrderList.forEach(executorService::execute);

        executorService.shutdown();

    }
    static class CoffeeOrder implements Runnable{
        private String coffeeName;
        private int second;

        public CoffeeOrder(String coffeeName, int amount) {
            this.coffeeName = coffeeName;
            this.second = amount;
        }

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            String ready = threadName + ">" + coffeeName + " 준비 시작.";
            String complete = threadName + ">" + coffeeName + " 준비 완료!";

            try {
                System.out.println(ready);
                Thread.sleep(second*1000);
                System.out.println(complete);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
