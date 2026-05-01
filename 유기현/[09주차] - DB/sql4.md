## 세션 4
``` sql
ALTER TABLE customers
ADD COLUMN point INT NOT NULL DEFAULT 0;

DESC customers;

ALTER TABLE customers
MODIFY COLUMN address VARCHAR(500) NOT NULL;

ALTER TABLE customers
DROP COLUMN point;

DROP TABLE products;

TRUNCATE TABLE products;

SET FOREIGN_KEY_CHECKS = 0;

TRUNCATE TABLE products;

SET FOREIGN_KEY_CHECKS = 1; -- 활성화 한다

SELECT * FROM customers;

INSERT INTO customers VALUES (NULL,'강감찬', 'kang@example.com','hashed_password_123',
'서울시 관악구', '2025-06-11 10:30:00');
INSERT INTO customers VALUES (NULL,'이순신', 'lee@example.com','hashed_password_123',
'서울시 관악구','2025-06-12 10:30:00');

INSERT INTO products (name, price, stock_quantity)
VALUES ('베이직 반팔 티셔츠', 19900, 200);

SELECT * FROM products;

INSERT INTO products (name, price, stock_quantity)
VALUES ('초록색 긴팔 티셔츠', 30000, 50);

INSERT INTO products (name, price, stock_quantity) VALUES
('검정 양말', 5000, 100),
('갈색 양말', 5000, 150),
('흰색 양말', 5000, 200);

SELECT * FROM products
WHERE product_id = 1;

UPDATE products
SET price = 9800, stock_quantity = 580
WHERE product_id = 1;

SELECT @@SQL_SAFE_UPDATES;

SET SQL_SAFE_UPDATES = 0; -- 안전 모드 제거

UPDATE products
SET price = 990;

SET SQL_SAFE_UPDATES = 1; -- 안전 모드 활성화

SET FOREIGN_KEY_CHECKS = 0; 

truncate table products;
truncate table customers;
truncate table orders;

SET FOREIGN_KEY_CHECKS = 1; 

INSERT INTO customers (email, password, address)
VALUES ('noname@example.com', 'password123','서울시 마포구');
-- Error Code: 1364. Field 'name' doesn't have a default value

INSERT INTO customers (name, email, password, address)
VALUES ('강감찬', 'kang@example.com', 'new_password_789','서울시 강남구');

SELECT * FROM customers;

INSERT INTO customers (name, email, password, address)
VALUES ('홍길동', 'kang@example.com', 'new_password_123','서울시 송파구');
-- Error Code: 1062. Duplicate entry 'kang@example.com' for key 'customers.email'

INSERT INTO products (name, price, stock_quantity)
VALUES ('베이직 반팔 티셔츠', 19900, 200);
SELECT * FROM products;

INSERT INTO orders (customer_id, product_id, quantity)
VALUES (1, 1, 1);

SELECT * FROM orders;

INSERT INTO orders (customer_id, product_id, quantity)
VALUES (999, 1, 1);
-- Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails (`my_shop`.`orders`, CONSTRAINT `fk_orders_customers` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`))

DELETE FROM products
WHERE product_id = 1;
-- Error Code: 1451. Cannot delete or update a parent row: a foreign key constraint fails (`my_shop`.`orders`, CONSTRAINT `fk_orders_products` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`))
```
문제 풀이 

``` sql
CREATE DATABASE my_test;

USE my_test;

CREATE TABLE members (
	id INT PRIMARY KEY, 
	name VARCHAR(50) NOT NULL,
	join_date DATE
);

INSERT INTO members VALUES(1, '션', '2025-01-10');
INSERT INTO members VALUES(2, '네이트', '2025-02-15');

SELECT * FROM members;

UPDATE members
SET name ='네이트2'
WHERE id = 2;

DELETE FROM members
WHERE id = 1;

SELECT * FROM members;

CREATE TABLE orders (
	order_id INT AUTO_INCREMENT PRIMARY KEY,
	customer_id INT NOT NULL,
	order_date DATETIME DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT fk_orders_customers FOREIGN KEY (customer_id)
	REFERENCES customers(customer_id)
);
```

