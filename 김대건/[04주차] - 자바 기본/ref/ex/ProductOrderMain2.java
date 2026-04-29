package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = createOrder("두부",2000,2);
        productOrders[1] = createOrder("김치",5000,1);
        productOrders[2] = createOrder("콜라",1500,2);

        printOrders(productOrders);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + "원, 수량: " + order.quantity);
        }
        int totalAmount = getTotalAmount(orders);
        System.out.println("합계: " + totalAmount + "원");
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }
}
