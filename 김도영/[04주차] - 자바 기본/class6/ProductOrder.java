package class6;

public class ProductOrder {
    String productName;
    int price;
    int quantity;

    static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "야호";
        order1.price = 100;
        order1.quantity = 100;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "good";
        order2.price = 200;
        order2.quantity = 200;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "aeaweag";
        order3.price = 300;
        order3.quantity = 300;
        orders[2] = order3;

        int total = 0;
        for (ProductOrder order: orders){
            System.out.println("상품명: "+order.productName+"가격: "+order.price+"수량: "+order.quantity);
            total += order.price * order.quantity;
        }

        System.out.println("총 결제 금액:"+ total);
    }
}
