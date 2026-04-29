package ref.ex;
import java.util.Scanner;
public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] order = new ProductOrder[n];

        for(int i=0; i<n;i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String product = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            order[i] = createOrder(product,price,quantity);
        }
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
