package test.Q5;

public class Q5 {
    public static void main(String[] args) {
        int tot1 = 0;
        int tot2 = 0;
        ProductOrder order1 = new ProductOrder("노트북", 10000000, 1);
        ProductOrder order2 = new ProductOrder("마우스", 15000, 3);
        ProductOrder order3 = new ProductOrder("키보드", 50000, 2);

        System.out.println("<출력방법1>");
        order1.printOrder();
        order2.printOrder();
        order3.printOrder();
        tot1 = order1.getTotPayment() + order2.getTotPayment() + order3.getTotPayment();
        System.out.println("전체 가격 합 : " + tot1);

        System.out.println("\n<출력방법2>");
        ProductOrder[] orders = {order1, order2, order3};
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명 : " + orders[i].productName + ", 가격 : " + orders[i].price
                    + ", 수량 : " + orders[i].quantity);
            tot2 += (orders[i].price * orders[i].quantity);
        }
        System.out.println("전체 가격 합 : " + tot2);
    }
}
