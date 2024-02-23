package test.Q7;

import test.Q7.ShoppingCart;

public class Q7 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(10);
        Item item1 = new Item("당근", 1500, 3);
        Item item2 = new Item("양파", 2000, 5);

        cart.addItem(item1);
        cart.addItem(item2);

        System.out.println("<장바구니 상품 출력>");
        cart.displayItems();


    }
}
