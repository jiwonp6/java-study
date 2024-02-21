package ch12_accessModifier.ex5.com.shoppingCart;
// #11 접근제한자 (2024-02-20)
public class Item {
    /* 필드 : 데이터 */
    private String name;
    private int price;
    private int quantity;
    /* 생성자 */
    public Item() { }

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /* 메소드 */
    // getter
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    // 합계구하기
    public long getTotal(){
        return price * quantity;
    }
}
