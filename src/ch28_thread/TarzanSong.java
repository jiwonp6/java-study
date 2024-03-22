package ch28_thread;

public class TarzanSong implements Runnable{
    int max;

    public TarzanSong(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        // String song = "타잔이 %d원짜리 팬티를 입고, %d원짜리 칼을 차고 노래를 한다. 아아아~\n";
        String song = "%s 타잔이 %d원짜리 팬티를 입고, %d원짜리 칼을 차고 노래를 한다. 아아아~\n";
        for (int i = 0; i < max; i++) {
            try {
                Thread.sleep(3000);
                // System.out.printf(song, (i + 1) * 10, (i + 2) * 10);
                System.out.printf(song, Thread.currentThread().getName(), (i + 1) * 10, (i + 2) * 10);
            } catch (InterruptedException e) {      // 인터럽트 발생했을 때의 처리
                System.out.println("그만하겠습니다.");
                return;
            }
        }
    }
}
