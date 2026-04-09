package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] order = new ProductOrder[3];
        order[0] = createOrder("두부",2000,2);
        order[1] = createOrder("김치",5000,1);
        order[2] = createOrder("콜라",1500,2);

        printOrders(order);
        System.out.println("총 결제 금액: "+getTotalAmount(order));
    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for(int i=0; i< orders.length;i++){
            System.out.println("상품명: "+ orders[i].productName+", 가격: "+orders[i].price+", 수량: "+orders[i].quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int sum_price=0;
        for(int i=0; i< orders.length; i++){
            sum_price += (orders[i].price) * (orders[i].quantity);
        }
        return sum_price;
    }
}
