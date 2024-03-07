package ch22_library.util;

import java.security.SecureRandom;
import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        // java.util 패키지
            // (java.lang 패키지를 제외한 모든 패키지는 import 해야 사용 가능)
            // 컬렉션 프레임워크를 포함한 여러가지 유용한 클래스들을 포함하고 있다.
        Random random = new Random();

        // 0 부터 99 까지 정수 난수를 생성
        for (int i = 0; i < 100; i++) {
            int randomNum = random.nextInt(100);
            System.out.println(randomNum);
        }

        // 0 부터 5 까지 정수 난수 생성하고 + 1 더하기
        for (int i = 0; i < 10; i++) {
            int diceNum = random.nextInt(6) + 1;
        }

        // 랜덤한 정수 범위의 값을 반환
        int i1 = random.nextInt();
        int i2 = random.nextInt();
        int i3 = random.nextInt();

        // 랜덤한 0.0 ~ 1.0 까지 실수 난수 생성
        double d1 = random.nextDouble();
        double d2 = random.nextDouble();
        double d3 = random.nextDouble();

        // 해당 범위 내에서 실수 난수 생성
        double d4 = random.nextDouble(3.14, 6.28);

        // 해당 범위 난수 생성 : 첫 인자 포함, 마지막 인자 제외
        int diceRangeNum = random.nextInt(1, 7);

        // 랜덤한 참 거짓 생성
        boolean trueFalse = random.nextBoolean();

        // 시드 값 <-- 설정이유) 재현성 확보(디버깅, 테스트 시행), 예측 가능성(시뮬레이션 실험)
            // : 난수 생성의 시작점을 제공하고,
            // 동일한 시드값으로 생성된 Random 객체는 동일한 난수를 생성
        Random random123 = new Random(123);
        int i123 = random123.nextInt(100);

        Random random123_2 = new Random(123);
        int i123_2 = random123_2.nextInt(100);

        Random random456 = new Random(456);
        int i456 = random456.nextInt(100);

        // 시드값 설정 X -> System.currentTimeMillis() 또는 유사한 시간 기반 값의 시드를 자동으로 설정
                    // => 완전한 무작위성 & 보안 보장 X

        // 노이즈 값이 포함된 클래스(보안성 ↑)
        SecureRandom secureRandom;


    }
}
