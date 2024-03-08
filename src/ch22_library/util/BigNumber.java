package ch22_library.util;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        // Long의 최대값 최소값 범위
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // 범위를 넘어가는 매우 큰수를 다루기 위한 클래스
        // BigInteger
        // Long longNum = 9223572036854775808L;     넘을 수 없음
        BigInteger bigInt1 = new BigInteger("9223572036854775808");
        BigInteger bigInt2 = new BigInteger("7224456456854685408");

        // 덧셈
        BigInteger sum = bigInt1.add(bigInt2);
        System.out.println("합 : " + sum);

        // 뺄셈
        BigInteger sub = bigInt1.subtract(bigInt2);
        System.out.println("차 : " + sub);

        // 곱셈
        BigInteger multiply = bigInt1.multiply(bigInt2);
        System.out.println("곱 : " + multiply);

        // 나눗셈
        BigInteger divide = bigInt1.divide(bigInt2);
        System.out.println("몫 : " + divide);    // 정수

        // 거듭제곱
        BigInteger pow = BigInteger.valueOf(2).pow(64);
        System.out.println("2 ^ 64 : " + pow);

        // 최대공약수
        BigInteger gcd = bigInt1.gcd(bigInt2);
        System.out.println("최대공약수 : " + gcd);

        // 부동 소수점 정밀도 오류
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
        System.out.println("0.7 - 0.3 = " + (0.7 - 0.3));
        System.out.println("0.2 * 0.4 = " + (0.2 * 0.4));
        System.out.println("0.9 / 0.3 = " + (0.9 / 0.3));

        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        BigDecimal bigDecimal2 = new BigDecimal("0.2");

        System.out.println("\n0.1 + 0.2 = " + bigDecimal1.add(bigDecimal2));
        System.out.println("0.1 - 0.2 = " + bigDecimal1.subtract(bigDecimal2));
        System.out.println("0.1 * 0.2 = " + bigDecimal1.multiply(bigDecimal2));
        System.out.println("0.1 / 0.2 = " + bigDecimal1.divide(bigDecimal2));

        // 금융계산이나 과학계산에 필요한 고정밀도 연산에 쓰임

    }
}
