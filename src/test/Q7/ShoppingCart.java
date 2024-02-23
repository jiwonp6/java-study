package test.Q7;

public class ShoppingCart {
    // 필드
    Item[] items = new Item[10];
    int index;
    int tot = 0;

    // 생성자
    public ShoppingCart(int i) {
        items = new Item[i];
    }

    // 메소드
    void addItem(Item item){
        if (index < 10){
            items[index] = item;
            index++;
            System.out.println("상품추가완료");
        }else {
            System.out.println("상품추가 실패 (장바구니가 가득 찼습니다.)");
        }
    }
    void displayItems(){
        for (int i = 0; i < index; i++) {
            System.out.printf("상품명 : %s, 합계 : %s\n", items[i].productName, (items[i].price * items[i].quantity));
            tot = tot + (items[i].price * items[i].quantity);
        }
        System.out.println("전체 가격 합 : " + tot);
    }
}
