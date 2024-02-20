package ch08_class.ex5;
// #9 연습문제 (2024-02-16)
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*
            4번 연습문제에서 주문을 입력받아 등록하고 총 결제 금액을 만들 수 있도록 수정
         */
        // 상품 종류 개수 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("상품의 종류는 몇 개입니까?");
        int orderNum = scanner.nextInt();

        ProductOrder[] orders = new ProductOrder[orderNum];

        // createOrder
        for (int i = 0; i < orderNum; i++) {
            System.out.println("주문 상품 정보를 입력하세요.");
            System.out.println("상품명 : ");
            String productName = scanner.next();
            System.out.println("상품가격 :");
            int price = scanner.nextInt();
            System.out.println("상품개수 : ");
            int quantity = scanner.nextInt();
            System.out.println(" ");

            // 배열에 생성된 객체를 할당
            orders[i] = createOrder(productName, price, quantity);
        }

        // printOrder
        printOrder(orders);

        // getTotalPayment
        int totalPayment = getTotalPayment(orders);
        System.out.println("총 결제금액 : " + totalPayment + "원");

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
    private static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + "," +
                    " 가격 :" + order.price + ", 수량 : " + order.quantity);
        }
    }
    // 결제 금액 계산 메소드
    private static int getTotalPayment(ProductOrder[] orders){
        int totalPayment = 0;
        for (ProductOrder order : orders) {
            totalPayment += order.price * order.quantity;
        }
        return totalPayment;
    }

}
