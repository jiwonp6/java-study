package ch29_io_stream;

import java.io.*;

public class IOStream09_BasicTypeSecondaryStream {
    // 기본 데이터타입 보조스트림
    public static void main(String[] args) {
        try {
            String sourcePath = "src/ch29_io_stream/files/data.db";

            // 1. 파일 출력 스트림 + 보조 스트림 생성
            FileOutputStream fos = new FileOutputStream(sourcePath);
            DataOutputStream dos = new DataOutputStream(fos);

            // 기본 타입을 쓰기
            dos.writeInt(100);
            dos.writeDouble(80.5);
            dos.writeUTF("홍길동");
            dos.writeBoolean(true);

            // 버퍼 비우기
            dos.flush();

            // 닫기
            dos.close();

            // 2. 파일 입력 스트림 + 보조 스트림 생성
            FileInputStream fis = new FileInputStream(sourcePath);
            DataInputStream dis = new DataInputStream(fis);

            // 기본 타입을 읽기 => 반드시 쓴 순서대로 읽어야 함.
            int i = dis.readInt();
            double d = dis.readDouble();
            String s = dis.readUTF();
            boolean b = dis.readBoolean();

            System.out.println("i = " + i);
            System.out.println("d = " + d);
            System.out.println("s = " + s);
            System.out.println("b = " + b);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
