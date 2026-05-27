1번

```SQL
CREATE DATABASE my_test;

use my_test;

CREATE TABLE members (
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
    join_date DATE
);

DESC members;
```

2번

```SQL

INSERT INTO members (id, name, join_date)
VALUES (1, '션', '2025-01-10');

INSERT INTO members (id, name, join_date)
VALUES (2, '네이트', '2025-02-15');

SELECT * FROM members;
```

3번

```SQL
UPDATE members
SET name = '네이트2'
WHERE id = 2;

DELETE FROM members
WHERE id = 1;

SELECT * FROM members;
```

4번

```SQL
CREATE TABLE products (
 product_id INT AUTO_INCREMENT PRIMARY KEY,
 product_name VARCHAR(100) NOT NULL,
 product_code VARCHAR(20) UNIQUE,
 price INT NOT NULL,
 stock_count INT NOT NULL DEFAULT 0
);
DESC products;
```

5번

```SQL
CREATE TABLE customers (
 customer_id INT AUTO_INCREMENT PRIMARY KEY,
 name VARCHAR(50) NOT NULL
);

CREATE TABLE orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    order_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_orders_customers FOREIGN KEY (customer_id)
    REFERENCES customers(customer_id)
);

INSERT INTO customers (name) VALUES ('홍길동');

INSERT INTO orders (customer_id) VALUES (1);

SELECT * FROM customers;
SELECT * FROM orders;
```

6번

```SQL
INSERT INTO orders (customer_id) VALUES (999);

INSERT INTO customers (customer_id) VALUES (2);
```
