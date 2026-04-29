package access.ex;

public class Item {

    private String itemName;
    private int price;
    private int quantity;

    public Item(String itemName, int price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    //이름 가격 수량을 내뱉는 함수
    public String getItemName(){
        return itemName;
    }

    public int getTotalPrice(){
        return price*quantity;
    }
}
