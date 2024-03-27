package ch29_io_stream;

import java.io.*;
import java.util.Arrays;

public class IOStream12_Serializable {
    public static void main(String[] args) {
        String filePath = "src/ch29_io_stream/files/test7_object.dat";
        try {
            // 파일 기반스트림 - 객체 보조 스트림 연결
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // 객체 생성
            Member member1 = new Member("HGD", "홍길동");
            Member member2 = new Member("LMR", "이몽룡");
            Member member3 = new Member("LKJ", "임꺽정");
            Member[] members = { member1, member2, member3 };

            // 객체를 직렬화하여 파일에 저장
            oos.writeObject(member1);
            oos.writeObject(member2);
            oos.writeObject(member3);
            oos.writeObject(members);

            oos.flush();
            oos.close();
            fos.close();

            // 역직렬화
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // 파일에서 역직렬화를 통해 객체로 복원 (객체 저장 시에는 출력된 순서 그대로 읽어와야 함)
            Member member11 = (Member) ois.readObject();
            Member member12 = (Member) ois.readObject();
            Member member13 = (Member) ois.readObject();
            Member[] member1s = (Member[]) ois.readObject();

            System.out.println(member11);
            System.out.println(member12);
            System.out.println(member13);
            System.out.println(Arrays.toString(member1s));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 객체를 직렬화 하기 위해서는 Serializable 구현해야 함.
    static class Member implements Serializable {
        String id;
        String name;

        public Member(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return id + ": " + name;
        }
    }
}
