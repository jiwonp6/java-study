package ch29_io_stream.ex_io_stream;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Ex3_2 {
    public static void main(String[] args) {
        Map<String, Integer> userMessageMap = new HashMap<>();

        String filePath = ("src/ch29_io_stream/files/chat.log");
        String resultFilePath = ("src/ch29_io_stream/files/chatSummary.txt");

        // 파일을 읽고 분석하여 분석 결과를 Map에 데이터를 저장
        try (BufferedReader br = new BufferedReader(new FileReader(filePath));){
            String line;
            // 종료 조건을 축약하여 while 조건문에 대입
            while ((line = br.readLine()) != null) {
                String userName = line.split(":")[1].split("]")[1].trim();
                // Map <유저이름 : 횟수>  -> 횟수 기본값 0, 사용자명을 키로 만날때마다 +1
                userMessageMap.put(userName, userMessageMap.getOrDefault(userName, 0) + 1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 분석된 결과를 file에 정해진 포맷으로 쓰기
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(resultFilePath))) {
            for (Map.Entry<String, Integer> entry : userMessageMap.entrySet()) {
                bw.write(entry.getKey() + ": " + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
