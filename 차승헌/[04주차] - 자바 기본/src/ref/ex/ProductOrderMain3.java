package ref.ex;
import java.util.Scanner;
public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 갯수를 입력하시오: ");
        int orderAmount = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[orderAmount];
        int quantity;
        int price;
        String productName;
        for (int i = 0; i < orderAmount; i++) {
            System.out.println(i + 1 + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            productName = scanner.nextLine();
            System.out.print("가격: ");
            price = scanner.nextInt();
            System.out.print("수량: ");
            quantity = scanner.nextInt();
            scanner.nextLine();
            orders[i] = createOrder(productName, price, quantity);
        }
        printOrders(orders);
        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;
        return product;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품 명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
