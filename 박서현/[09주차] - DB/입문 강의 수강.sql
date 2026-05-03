create database my_shop;

use my_shop;

CREATE TABLE sample (
 product_id INT PRIMARY KEY,
 name VARCHAR(100),
 price INT,
 stock_quantity INT,
 release_date DATE
);

DESC sample;
SHOW TABLES;
INSERT INTO sample (product_id, name, price, stock_quantity, release_date)
VALUES (1, '프리미엄 청바지', 59900, 100, '2025-06-11');

select * from sample;
UPDATE sample
SET price = 40000
WHERE product_id = 1;

DELETE FROM sample
 WHERE product_id = 1;
 DROP table sample;
 
 
 CREATE TABLE customers (
	 customer_id INT AUTO_INCREMENT PRIMARY KEY,
	 name VARCHAR(50) NOT NULL,
	 email VARCHAR(100) NOT NULL UNIQUE,
	 password VARCHAR(255) NOT NULL,
	 address VARCHAR(255) NOT NULL,
	 join_date DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE products (
	 product_id INT AUTO_INCREMENT PRIMARY KEY,
	 name VARCHAR(100) NOT NULL,
	 description TEXT,
	 price INT NOT NULL,
	 stock_quantity INT NOT NULL DEFAULT 0
);
 
 CREATE TABLE orders (
	 order_id INT AUTO_INCREMENT PRIMARY KEY,
	 customer_id INT NOT NULL,
	 product_id INT NOT NULL,
	 quantity INT NOT NULL,
	 order_date DATETIME DEFAULT CURRENT_TIMESTAMP,
	 status VARCHAR(20) NOT NULL DEFAULT '주문접수',
	 CONSTRAINT fk_orders_customers FOREIGN KEY (customer_id)
	 REFERENCES customers(customer_id),
	 CONSTRAINT fk_orders_products FOREIGN KEY (product_id)
	 REFERENCES products(product_id)
);

ALTER TABLE customers
ADD COLUMN point INT NOT NULL DEFAULT 0;
ALTER TABLE customers
MODIFY COLUMN address VARCHAR(500) NOT NULL;

ALTER TABLE customers
DROP COLUMN point;

INSERT INTO customers VALUES (NULL, '강감찬', 'kang@example.com',
'hashed_password_123', '서울시 관악구', '2025-06-11 10:30:00');
INSERT INTO customers VALUES (NULL, '이순신', 'lee@example.com',
'hashed_password_123', '서울시 관악구', '2025-06-12 10:30:00');
SELECT * FROM customers;
INSERT INTO customers (name, email, password, address)
VALUES ('세종대왕', 'sejong@example.com', 'hashed_password_456', '서울시 종로구');


INSERT INTO products (name, price, stock_quantity)
VALUES ('베이직 반팔 티셔츠', 19900, 200);
INSERT INTO products (name, price, stock_quantity)
VALUES ('초록색 긴팔 티셔츠', 30000, 50);
SELECT * FROM products;
INSERT INTO products (name, price, stock_quantity) VALUES
('검정 양말', 5000, 100),
('갈색 양말', 5000, 150),
('흰색 양말', 5000, 200);
SELECT * FROM products
WHERE product_id = 1;

UPDATE products
SET price = 9800, stock_quantity = 580
WHERE product_id = 1;

DELETE FROM products
WHERE product_id = 1;


SET FOREIGN_KEY_CHECKS = 0;
truncate table products;
truncate table customers;
truncate table orders;
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO customers (name, email, password, address, join_date) VALUES
('이순신', 'yisunsin@example.com', 'password123', '서울특별시 중구 세종대로',
'2023-05-01'),
('세종대왕', 'sejong@example.com', 'password456', '서울특별시 종로구 사직로',
'2024-05-01'),
('장영실', 'youngsil@example.com', 'password789', '부산광역시 동래구 복천동',
'2025-05-01');

INSERT INTO products (name, description, price, stock_quantity) VALUES
('갤럭시', '최신 AI 기능이 탑재된 고성능 스마트폰', 10000, 55),
('LG 그램', '초경량 디자인과 강력한 성능을 자랑하는 노트북', 20000, 35),
('아이폰', '직관적인 사용자 경험을 제공하는 스마트폰', 5000, 55),
('에어팟', '편리한 사용성의 무선 이어폰', 3000, 110),
('보급형 스마트폰', NULL, 5000, 100);
INSERT INTO orders (customer_id, product_id, quantity) VALUES
(1, 1, 1), -- 이순신 고객이 갤럭시 1개 주문
(2, 2, 1), -- 세종대왕 고객이 LG 그램 1개 주문
(3, 3, 1), -- 장영실 고객이 아이폰 1개 주문
(1, 4, 2), -- 이순신 고객이 에어팟 2개 추가 주문
(2, 2, 1); -- 세종대왕 고객이 LG 그램 1개 주문(추가 주문)
SELECT * FROM customers;
SELECT name, email FROM customers;
SELECT name AS 고객명, email AS 이메일 FROM customers;
SELECT * FROM customers WHERE email = 'yisunsin@example.com';
SELECT * FROM products WHERE price >= 10000;
SELECT * FROM products WHERE price >= 5000 AND stock_quantity >= 50;
SELECT * FROM products WHERE price = 20000 OR stock_quantity >= 100;
SELECT * FROM products WHERE price != 20000;
SELECT * FROM products WHERE price BETWEEN 5000 AND 15000;
SELECT * FROM products WHERE price < 5000 OR price > 15000;
SELECT * FROM products WHERE price NOT BETWEEN 5000 AND 15000;
SELECT * FROM products WHERE name IN ('갤럭시', '아이폰', '에어팟');
SELECT * FROM products WHERE name NOT IN ('갤럭시', '아이폰', '에어팟');
SELECT * FROM customers WHERE email LIKE 'sejong%';
SELECT * FROM customers WHERE address NOT LIKE '서울특별시%';
SELECT * FROM customers ORDER BY join_date DESC;
SELECT * FROM products ORDER BY price ASC;
SELECT * FROM products ORDER BY stock_quantity DESC, price ASC;
SELECT * FROM products ORDER BY price DESC LIMIT 2;
SELECT * FROM products ORDER BY product_id ASC LIMIT 0, 2;
SELECT * FROM products ORDER BY product_id ASC LIMIT 2, 2;
SELECT * FROM products ORDER BY product_id ASC LIMIT 4, 2;
SELECT * FROM products WHERE description = NULL;
SELECT * FROM products WHERE description IS NULL;
SELECT * FROM products WHERE description IS NOT NULL;
SELECT * FROM products ORDER BY description ASC;
SELECT * FROM products ORDER BY description DESC;
SELECT product_id, name, description, description IS NULL
FROM products
ORDER BY description DESC;
SELECT product_id, name, description, description IS NULL
FROM products
ORDER BY description IS NULL DESC;
