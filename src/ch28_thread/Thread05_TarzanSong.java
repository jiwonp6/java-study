package ch28_thread;

public class Thread05_TarzanSong {
    public static void main(String[] args) {
        // 생성자에서 이름 주기
        Thread thread = new Thread(new TarzanSong(5), "TarzanSong");
                                                        // = thread.setName("타잔송");
        thread.start();
        System.out.println(thread.getName());
    }
}
