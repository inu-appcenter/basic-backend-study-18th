-- [섹션 3] --
-- 데이터베이스 생성
CREATE DATABASE my_shop;

-- 데이터베이스 선택
USE my_shop;

-- 테이블 생성
CREATE TABLE sample (
	product_id INT PRIMARY KEY,
    name VARCHAR(100),
    price INT,
    stock_quantity INT,
    release_date DATE
);

INSERT INTO sample (product_id, name, price, stock_quantity, release_date)
VALUES (1, '프리미엄 청바지', 59900, 100, '2025-06-11');

SELECT * FROM sample;

UPDATE sample
SET price = 40000
WHERE product_id = 1;

DELETE FROM sample
WHERE product_id = 1;

-- [섹션 4] --
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
    name VARCHAR(50) NOT NULL,
    description TEXT,
    price INT NOT NULL,
    sotck_quantity INT NOT NULL DEFAULT 0
);

-- 오타 수정
ALTER TABLE products
CHANGE sotck_quantity stock_quantity INT NOT NULL DEFAULT 0;

CREATE TABLE orders (
	order_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    product_id INT NOT NULL,
    quantity INT NOT NULL,
    order_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    satatus VARCHAR(20) NOT NULL DEFAULT '주문접수',
    
    CONSTRAINT fk_orders_customers FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
    CONSTRAINT fk_orders_products FOREIGN KEY (product_id) REFERENCES products(product_id)
);

ALTER TABLE customers
ADD COLUMN point INT NOT NULL DEFAULT 0;

ALTER TABLE customers
MODIFY COLUMN address VARCHAR(500) NOT NULL;

ALTER TABLE customers
DROP COLUMN point;

-- DROP TABLE products; 에러
-- TRUNCATE TABLE products; 에러

SET FOREIGN_KEY_CHECKS = 0; -- 비활성화
TRUNCATE TABLE products;
SET FOREIGN_KEY_CHECKS = 1; -- 활성화

INSERT INTO customers VALUES (NULL, '강감찬', 'kang@example.com', 'hashed_password_123',
'서울시 관악구', '2025-06-11 10:30:00');
INSERT INTO customers VALUES (NULL, '이순신', 'lee@example.com', 'hashed_password_123',
'서울시 관악구', '2025-06-12 10:30:00');

INSERT INTO customers (name, email, password, address)
VALUES ('세종대왕', 'sejong@example.com', 'hashed_password_456', '서울시 종로구');

INSERT INTO products (name, price, stock_quantity)
VALUES ('베이직 반팔 티셔츠', 19900, 200);

INSERT INTO products (name, price, stock_quantity)
VALUES ('초록색 긴팔 티셔츠', 30000, 50);

INSERT INTO products (name, price, stock_quantity) VALUES
('검정 양말', 5000, 100),
('갈색 양말', 5000, 150),
('흰색 양말', 5000, 200);

UPDATE products
SET price = 9800, stock_quantity = 580
WHERE product_id = 1;

UPDATE products
SET price = 990;
-- WHERE product_id = 1; //실수로 생략

SELECT @@SQL_SAFE_UPDATES;

UPDATE products
SET price = 990;
-- WHERE name = '베이직 반팔 티셔츠'; //name 컬럼 사용 불가, 반드시 기본키 컬럼 사용

SET SQL_SAFE_UPDATES = 0; -- 안전 모드 제거

UPDATE products
SET price = 990;

SET SQL_SAFE_UPDATES = 1; -- 안전 모드 활성화

-- STEP1 : 변경 대상 확인
SELECT * FROM products
WHERE name = '베이직 반팔 티셔츠';

-- STEP2 : 확인된 대상에 한해서만 UPDATE 실행
SET SQL_SAFE_UPDATES = 0; -- 안전 모드 제거

UPDATE products
SET price = 19800
WHERE name = '베이직 반팔 티셔츠';

SET SQL_SAFE_UPDATES = 1; -- 안전 모드 활성화

DELETE FROM products
WHERE product_id = 1;

SET FOREIGN_KEY_CHECKS = 0; -- 비활성화
truncate table products;
truncate table customers;
truncate table orders;
SET FOREIGN_KEY_CHECKS = 1; -- 활성화


-- 'name' 열을 빼고 INSET 시도 //error
INSERT INTO customers (email, password, address)
VALUES ('noname@example.com', 'password123', '서울시 마포구');

INSERT INTO customers (name, email, password, address)
VALUES ('강감찬', 'kang@example.com', 'new_password_789', '서울시 강남구');

-- 이메일 중복 오류
INSERT INTO customers (name, email, password, address)
VALUES ('홍길동', 'kang@example.com', 'new_password_123', '서울시 송파구');

INSERT INTO products (name, price, stock_quantity)
VALUES ('베이직 반팔 티셔츠', 19900, 200);

INSERT INTO orders (customer_id, product_id, quantity)
VALUES (1, 1, 1);

INSERT INTO orders (customer_id, product_id, quantity)
VALUES (999, 1, 1);

-- 문제와 풀이 --
-- 문제 1
CREATE DATABASE my_test;

USE my_test;

CREATE TABLE members (
	id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    join_date DATE
);

DESC members;

-- 문제 2
INSERT INTO members (id, name, join_date)
VALUES (1, '션', '2025-01-10');

INSERT INTO members (id, name, join_date)
VALUES (2, '네이트', '2025-02-15');

SELECT * FROM members;

-- 문제 3
UPDATE members
SET name = '네이트2'
WHERE id = 2;

DELETE FROM members
WHERE id = 1;

SELECT * FROM members;

-- 문제 4
CREATE TABLE products (
	product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    product_code VARCHAR(20) UNIQUE,
    price INT NOT NULL,
    stock_count INT NOT NULL DEFAULT 0
);

DESC products;

-- 문제 5
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

INSERT INTO customers (name) VALUES ('홀길동');

INSERT INTO orders (customer_id) VALUES (1);

SELECT * FROM customers;
SELECT * FROM orders;

-- 문제 6
INSERT INTO orders (customer_id) VALUES (999);
INSERT INTO orders (customer_id) VALUES (2);

-- [섹션 5] --
SELECT * FROM customers;
SELECT * FROM products;
SELECT * FROM orders;

SELECT name AS 고객명, email AS 이메일
FROM customers; -- AS 사용으로 가독성 향상

SELECT *
FROM customers
WHERE email = 'yisunsin@example.com';

select * from products
where price >= 10000;

SELECT * FROM products WHERE price >= 5000 AND stock_quantity >= 50;

SELECT * FROM products WHERE price = 20000 OR stock_quantity >= 100;

select * from products where price between 5000 and 15000;
select * from products where price not between 5000 and 15000;

select * from products where name in('갤럭시', '아이폰', '에어팟');
select * from products where name not in('갤럭시', '아이폰', '에어팟');

select * from customers where email like 'sejong%';
select * from customers where email like '%example.com';

select * from customers where address not like '서울특별시%';

SELECT * FROM customers ORDER BY join_date DESC;

SELECT * FROM products ORDER BY stock_quantity DESC, price ASC;

select * from products order by product_id asc limit 0, 2;
select * from products order by product_id asc limit 2, 2;
select * from products order by product_id asc limit 4, 2;

SELECT distinct customer_id FROM orders;
select distinct_id product_id from orders;

select * from products where description = null;
select * from products where description is null;

SELECT * FROM products ORDER BY description ASC;

SELECT product_id, name, description, description IS NULL
FROM products
ORDER BY (description is null) DESC, description desc;

SELECT name, price FROM products WHERE product_id IN (2, 3, 4);

select * from products where description is null;

select * from customers order by join_date desc limit 2;

select name as `상품 이름`, stock_quantity as `남은 수량` from products
where price > 3000 and stock_quantity <= 100
order by stock_quantity desc limit 3;

-- [섹션 6] --
SELECT name, price, stock_quantity, price * stock_quantity FROM products;
SELECT name, price, price + 3000 AS expected_price FROM products;
SELECT name, price, price - 1000 AS discounted_price FROM products;
SELECT name, price, price / 10 AS monthly_payment FROM products;

select concat(name, '(',email, ')') as name_and_email from customers;

select concat_ws(' - ', name, email, address) AS customer_details from customers;

select email, UPPER(email) as upper_email from customers;

select name, char_length(name) as char_length, length(name) as byte_length from customers;

select name, description from products;

select name, IFNULL(description, '상품설명 없음') as descripition 
from products;

select name, COALESCE(description, '상품설명 없음') as descripition 
from products;

-- 문제와 풀이 --
select name, price, price * 0.85 as sale_price
from products;

select * from customers;
select concat_ws(' - ', name, address) as customer_info
from customers;

select name, coalesce(description, name) as product_display_info
from products;

select name, coalesce(description, name, '정보없음') as display_text
from products;

select 
	email, 
	substring_index(email, '@', 1) as user_id,
	char_length(substring_index(email, '@', 1)) as id_length
from customers;

-- [섹션 7] --
CREATE TABLE order_stat (
	order_id INT PRIMARY KEY AUTO_INCREMENT,
	customer_name VARCHAR(50),
	category VARCHAR(50),
	product_name VARCHAR(100),
	price INT,
	quantity INT,
	order_date DATE
);

INSERT INTO order_stat (customer_name, category, product_name, price, quantity, order_date) VALUES
('이순신', '전자기기', '프리미엄 기계식 키보드', 150000, 1, '2025-05-10'),
('세종대왕', '도서', 'SQL 마스터링', 35000, 2, '2025-05-10'),
('신사임당', '가구', '인체공학 사무용 의자', 250000, 1, '2025-05-11'),
('이순신', '전자기기', '고성능 게이밍 마우스', 80000, 1, '2025-05-12'),
('세종대왕', '전자기기', '4K 모니터', 450000, 1, '2025-05-12'),
('장영실', '도서', '파이썬 데이터 분석', 40000, 3, '2025-05-13'),
('이순신', '문구', '고급 만년필 세트', 200000, 1, '2025-05-14'),
('세종대왕', '가구', '높이조절 스탠딩 데스크', 320000, 1, '2025-05-15'),
('신사임당', '전자기기', '노이즈캔슬링 블루투스 이어폰', 180000, 1, '2025-05-15'),
('장영실', '전자기기', '보조배터리 20000mAh', 50000, 2, '2025-05-16'),
('홍길동', NULL, 'USB-C 허브', 65000, 1, '2025-05-17'); -- 카테고리가 NULL인 데이터 추가

select * from order_stat;
select count(*) as `총 주문 건수` from order_stat;
select count(category) from order_stat;
select count(*) as `전체 주문 건수`, count(category) as `카테고리 등록 건수` from order_stat;

select 
sum(quantity) as `총 매출액`, 
avg(quantity) as `평균 주문 금액`
from order_stat;

select max(price) as 최고가, min(price) as 최저가 from order_stat;
select max(order_date) as `최초 주문일`, min(order_date) as `최근 주문일` from order_stat;

select count(distinct customer_name) from order_stat;
SELECT
	COUNT(customer_name) AS `총 주문 건수`,
	COUNT(DISTINCT customer_name) AS `순수 고객 수`
FROM
order_stat;

SELECT
	category,
	COUNT(*) AS `카테고리별 주문 건수`
FROM
	order_stat
GROUP BY
	category;

SELECT
	customer_name,
	COUNT(*) AS `총 주문 횟수`,
	SUM(quantity) AS `총 구매 수량`,
	SUM(price * quantity) AS `총 구매 금액`
FROM
	order_stat
GROUP BY
	customer_name
ORDER BY `총 구매 금액` DESC;

select customer_name, category, sum(price * quantity) as `카테고리별 구매 금약`
from order_stat
group by customer_name, category
order by customer_name, `카테고리별 구매 금약` desc;

select category, product_name, count(*)
from order_stat
group by category, product_name
order by category;
select
    category,
    sum(price * quantity) as total_sales
from
    order_stat
group by
    category
having
    sum(price * quantity) >= 500000;

select customer_name, count(*) as order_count
from order_stat
group by customer_name having count(*) >= 3;

select category, count(*) as premium_order_count
from order_stat
where price >= 100000
group by category having count(*) >= 2;

select customer_name, sum(price * quantity) as total_purchase
from order_stat
where order_date < '2025-05-14'
group by customer_name having count(*) >= 2
order by total_purchase desc
    limit 1;

-- 문제와 풀이 --
select count(*), count(category)
from order_stat;

SELECT
    SUM(price * quantity) AS `총 매출액`,
    AVG(price * quantity) AS `평균 주문 금액`,
    MAX(price) AS `최고 단가`,
    MIN(price) AS `최저 단가`
FROM
    order_stat;

select * from order_stat;

select category, sum(quantity) as `카테고리별 총 판매 수량`, sum(price * quantity) as `카테고리별 매출액`
from order_stat
group by category
order by `카테고리별 매출액` desc;

select customer_name, count(*) as `총 주문 횟수`, sum(quantity) as `총 구매 수량`
from order_stat
group by customer_name
order by `총 주문 횟수` desc, `총 구매 수량` desc;

SELECT customer_name, SUM(price * quantity) AS `총 구매 금액`
FROM order_stat
GROUP BY customer_name
HAVING SUM(price * quantity) >= 400000
ORDER BY `총 구매 금액` DESC;

select customer_name, count(*) as `주문 횟수`, sum(price * quantity) as `총 사용 금액`
from order_stat
where category <> '도서' or category is null
group by customer_name having count(*) >= 2
order by `총 사용 금액` desc;