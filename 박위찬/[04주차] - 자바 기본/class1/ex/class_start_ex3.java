package class1.ex;

public class class_start_ex3 {
    public static void main(String[] args){

        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;


        ProductOrder[] product = new ProductOrder[3];
        product[0] = product1;
        product[1] = product2;
        product[2] = product3;

        int sum = 0;

        for (ProductOrder s : product) {
            System.out.println("상품명: " + s.productName + ", 가격: " + s.price + ", 수량: " + s.quantity);
            sum += s.price * s.quantity;
        }
        System.out.println("합계 : "+sum);
    }
}

