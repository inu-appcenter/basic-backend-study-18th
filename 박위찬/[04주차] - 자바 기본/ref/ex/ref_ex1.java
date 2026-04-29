package ref.ex;

import ref.ex.ProductOrder;

public class ref_ex1 {
    public static void main(String[] args){

        int sum = 0;
        ref.ex.ProductOrder[] product = new ref.ex.ProductOrder[3];
        product[0] = createOrder("두부", 2000, 2);
        product[1] = createOrder("김치", 5000, 1);
        product[2] = createOrder("콜라", 1500, 2);

        printOrders(product);
        int total = getTotalAmount(product);
        System.out.println("합계 : "+total);
    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;

        return product;
    }
    static void printOrders(ProductOrder[] product){
        for (ProductOrder order : product) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] product) {
        int sum = 0;
        for (ProductOrder order : product) {
            sum += order.price * order.quantity;
        }

        return sum;
    }

}

