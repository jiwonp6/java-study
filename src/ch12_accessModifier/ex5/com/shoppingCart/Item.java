package ch12_accessModifier.ex5.com.shoppingCart;
// #11 접근제한자 (2024-02-20)
public class Item {
    /* 필드 : 데이터 */
    String name;
    int price;
    int quantity;
    /* 생성자 */
    public Item() { }

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /* 메소드 */
    public void setName(String name) {
        this.name = name;
    }
}
