package ch8_class.ex4;
// #9 연습문제 (2024-02-16)
public class Ex4 {
    public static void main(String[] args) {
        /*
            3번 연습문제를 리팩토링 해주세요.
            createOrder 메소드를 통해 상품주문 객체를 생성해주세요.
            printOrder 메소드를 통해 상품 정보를 출력해주세요.
            getTotalPayment 메소드를 통해 총 결제 금액을 구해주세요.
         */

        // createOrder
        ProductOrder productOrder1 = createOrder("노트북", 1000000, 2);
        ProductOrder productOrder2 = createOrder("마우스", 15000, 3);
        ProductOrder productOrder3 = createOrder("키보드", 50000, 1);

        // printOrder
        printOrder(productOrder1);
        printOrder(productOrder2);
        printOrder(productOrder3);

        // getTotalPayment
        int totPrice = getTotalPayment(productOrder1) + getTotalPayment(productOrder2) + getTotalPayment(productOrder3);
        System.out.println("총 결제 금액 : " + totPrice);

    }

    /* 메소드 */
    // 상품주문 객체 생성 메소드
    private static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
    // 상품 정보 출력 메소드
    private static void printOrder(ProductOrder productOrder){
        System.out.printf("상품명 : %s\t 가격 : %d원\t 개수 : %d개\n",
                productOrder.productName, productOrder.price, productOrder.quantity);
    }
    // 결제 금액 계산 메소드
    private static int getTotalPayment(ProductOrder productOrder){
        int totPayment = 0;
        totPayment += (productOrder.price * productOrder.quantity);

        return totPayment;
    }

}
