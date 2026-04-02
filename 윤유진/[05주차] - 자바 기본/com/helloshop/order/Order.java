package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    //생성자
    //public: 다른 패키지에서 Order를 호출할 수 있게 해 줌
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
