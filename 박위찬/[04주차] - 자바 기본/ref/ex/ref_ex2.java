package ref.ex;

import java.util.Scanner;

public class ref_ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("입력할 갯수를 적으세요");
        int N = input.nextInt();
        input.nextLine();
        ProductOrder[] product = new ProductOrder[N];

        for (int i=0; i<N; i++){
            System.out.println((i+1)+"번 상품 이름을 적으세요");
            String productName = input.nextLine();
            System.out.println((i+1)+"번 상품 가격을 적으세요");
            int price = input.nextInt();
            System.out.println((i+1)+"번 상품 수량을 적으세요");
            int quantity = input.nextInt();
            product[i] = createOrder(productName, price, quantity);
            input.nextLine();
        }

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

