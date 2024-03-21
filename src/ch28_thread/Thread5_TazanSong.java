package ch28_thread;

public class Thread5_TazanSong {
    public static void main(String[] args) {
        // 생성자에서 이름 주기
        Thread thread = new Thread(new TazanSong(5), "TazanSong");
                                                        // = thread.setName("타잔송");
        thread.start();
        System.out.println(thread.getName());
    }
}
