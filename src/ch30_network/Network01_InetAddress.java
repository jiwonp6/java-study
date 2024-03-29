package ch30_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Network01_InetAddress {
    public static void main(String[] args) {
        // InetAddress : IP 주소 관련 클래스
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("localHost = " + localHost);     // IP 주소

            // getAddress, getHostName, getHostAddress
                // : IP 주소의 정보를 바이트배열, 또는 문자열로 반환
            byte[] address = localHost.getAddress();            // byte <- IP
            System.out.println("address = " + Arrays.toString(address));

            String hostName = localHost.getHostName();          // 내 컴퓨터 이름
            System.out.println("hostName = " + hostName);

            String hostAddress = localHost.getHostAddress();    // 내 컴퓨터 IP
            System.out.println("hostAddress = " + hostAddress);

            // getByName : 도메인 주소로 IP 주소 객체 반환
            InetAddress daumIP = InetAddress.getByName("www.daum.net");
            System.out.println("daum Host Name = " + daumIP.getHostName());
            System.out.println("daumIP = " + daumIP.getHostAddress());

            // getAllByName : 호스트 이름에 대한 여러 IP 주소를 배열로 반환
            InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
            for (InetAddress naverIP : naverIPs) {
                System.out.println(naverIP.getHostName() + ": " + naverIP.getHostAddress());
            }


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        String hostName = "www.example.com";
        printAllIP(hostName);


    }
    static void printAllIP(String hostName) {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostName);
            System.out.println(hostName + "에 할당된 IP 주소들입니다.");
            for (InetAddress inetAddress : allByName) {
                System.out.println(inetAddress.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println(hostName + "에 할당된 IP 주소를 찾지 못했습니다.");
        }
    }
}
