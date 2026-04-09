package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if (itemCount >= items.length){
            System.out.println("더 담을 수 없음");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i=0; i<itemCount; i++){
            Item item = items[i];
            System.out.println("상품명 : "+item.getName()+" 합계 : "+item.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());

    }
    private int calculateTotalPrice() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            total +=item.getTotalPrice();
        }
        return total;
    }
}
