package ch29_io_stream.ex_serializable;

import java.io.*;

public class Serial1 {
    public static void main(String[] args) {
        String filePath = "src/ch29_io_stream/ex_serializable/person.ser";

        Person person1
                = new Person("홍길동", 30, 180, 70, false, new Career("코리아 컴퍼니", 10));
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            BufferedOutputStream bos = new BufferedOutputStream(fos);   // 성능향상
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(person1);

            oos.close();
            bos.close();
            fos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
