package ch29_io_stream;

import java.io.*;

public class IOStream08_imgCopy {
    // 성능향상 Buffered 보조 스트림
    public static void main(String[] args) {
        try {
            String origin1 = "src/ch29_io_stream/files/taisho.jpg";
            String target1 = "src/ch29_io_stream/files/taisho_copy1.jpg";

            FileInputStream fis = new FileInputStream(origin1);
            FileOutputStream fos = new FileOutputStream(target1);

            // 이미지 파일을 복사
            long takenTime = copyAndMeasureTime(fis, fos);
            System.out.println("이미지 파일 복사 시간: " + takenTime + "나노초");

            // 입출력 스트림 종료
            fis.close();
            fos.close();

            // 입출력 스트림 + 보조 스트림 (버퍼 스트림)
            String target2 = "src/ch29_io_stream/files/taisho_copy2.jpg";
            FileInputStream fis2 = new FileInputStream(origin1);
            FileOutputStream fos2 = new FileOutputStream(target2);

            BufferedInputStream bis = new BufferedInputStream(fis2);
            BufferedOutputStream bos = new BufferedOutputStream(fos2);

            // 이미지 파일을 복사 : 버퍼 스트림 사용
            long bufferTime = copyAndMeasureTime(bis, bos);
            System.out.println("버퍼 스트림 사용 이미지 파일 복사 시간: " + bufferTime + "나노초");

            bis.close();
            bos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static long copyAndMeasureTime(InputStream inputStream, OutputStream outputStream){
        long startTime = System.nanoTime();

        // 입력스트림에서 읽기를 완료한 후, 출력 스트림에서 읽은 데이터를 출력
        while (true) {
            int data = 0;
            try {
                data = inputStream.read();
                if (data == -1) break;
                outputStream.write(data);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        long endTime = System.nanoTime();

        // 걸린시간 측정
        long takenTime = endTime - startTime;

        return takenTime;
    }
}
