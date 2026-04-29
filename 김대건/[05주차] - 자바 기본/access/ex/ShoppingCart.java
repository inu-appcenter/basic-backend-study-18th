package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount = 0;
    private int totalPrice;

    public void addItem(Item item){
        if(itemCount >= items.length){
            System.out.println("장바구니가 꽉 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;

    }

    public void displayItem(){
        System.out.println("장바구니 상품 출력");

        for (Item item : items) {
            if(item == null)
                break;

            System.out.println("상품명: "+ item.getItemName() +", 합계: "+ item.getTotalPrice());


        }
        System.out.println("전체 가격의 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i = 0; i < itemCount;i++){
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
