package ch26_lambda.function;

import java.util.function.Supplier;

public class Function4_Supplier {
    public static void main(String[] args) {
        // Supplier : 입력 없이 결과만 반환
        Supplier randomSupplier = () -> Math.random();
        System.out.println("랜덤값 : " + randomSupplier.get());
    }
}
