package ch12_accessModifier.ex5.com.shoppingCart;
// #11 접근제한자 (2024-02-20)
public class ShoppingCart {
    /* 필드 : 데이터 */
    private Item[] items;
    private int index;

    /* 생성자 */
    public ShoppingCart() { }

    public ShoppingCart(int i) {
        items = new Item[i];
    }

    /* 메소드 */
    // 상품 넣기
    public void addItem(Item item){
        if (index < 9){
            items[index] = item;
            index++;
            System.out.println("상품 추가 완료");
        }else {
            System.out.println("상품 추가 실패 (상품 최대 10개까지 담기 가능)");
        }
    }

    // 장바구니 목록 출력
    public void displayItems(){
        for (int i = 0; i < index; i++) {
            System.out.println("상품명 : " + items[i].getName() + ", 상품가격 : " + items[i].getPrice()
                    + ", 수량 : " + items[i].getQuantity() + ", 합계 : " + items[i].getTotal());

        }
    }

    // 전체 합계
    public void calculateSum(){
        long tot = 0;
        for (int i = 0; i < index; i++) {
            tot += items[i].getTotal();
        }
        System.out.println("전체가격 : " + tot);
    }
}
