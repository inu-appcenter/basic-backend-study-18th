
-- Q1.
-- 1. DB 생성
CREATE DATABASE my_test;

-- 2. DB 선택
USE my_test;

-- 3. members 테이블 생성
CREATE TABLE members (
 id INT PRIMARY KEY, -- 기본키 설정
 name VARCHAR(50) NOT NULL,
 join_date DATE
);

-- 4. 테이블 구조 확인
DESC members;

-- Q2.
-- 1. 첫 번째 회원 데이터 추가
INSERT INTO members (id, name, join_date)
VALUES (1, '션', '2025-01-10');

-- 2. 두 번째 회원 데이터 추가
INSERT INTO members (id, name, join_date)
VALUES (2, '네이트', '2025-02-15');

-- 3. 전체 데이터 조회
SELECT * FROM members;

-- Q3.
-- 1. 이름 변경 (UPDATE)
UPDATE members
SET name = '네이트2'
WHERE id = 2;

-- 2. 회원 정보 삭제 (DELETE)
DELETE FROM members
WHERE id = 1;

-- 3. 최종 데이터 조회
SELECT * FROM members;

-- Q4.
-- 새 테이블 생성
CREATE TABLE products (
 product_id INT AUTO_INCREMENT PRIMARY KEY,
 product_name VARCHAR(100) NOT NULL,
 product_code VARCHAR(20) UNIQUE,
 price INT NOT NULL,
 stock_count INT NOT NULL DEFAULT 0
);

-- 테이블 구조 확인
DESC products;

-- Q5.
-- customers 테이블 생성
CREATE TABLE customers (
 customer_id INT AUTO_INCREMENT PRIMARY KEY,
 name VARCHAR(50) NOT NULL
);

-- orders 테이블 생성
CREATE TABLE orders (
 order_id INT AUTO_INCREMENT PRIMARY KEY,
 customer_id INT NOT NULL,
 order_date DATETIME DEFAULT CURRENT_TIMESTAMP,
 CONSTRAINT fk_orders_customers FOREIGN KEY (customer_id)
 REFERENCES customers(customer_id)
);

-- 고객 데이터 추가
INSERT INTO customers (name) VALUES ('홍길동');

-- 주문 데이터 추가 (방금 추가된 홍길동 고객의 customer_id는 1)
INSERT INTO orders (customer_id) VALUES (1);

-- 데이터 조회
SELECT * FROM customers;
SELECT * FROM orders;

-- Q6.
-- 시도 1: 존재하지 않는 고객의 주문 추가
INSERT INTO orders (customer_id) VALUES (999);

-- 시도 2: 필수 항목(name) 누락
INSERT INTO customers (customer_id) VALUES (2);
-- 두 경우 모두 오류 발생

USE my_shop; -- 수업 내용 정리 DB로 이동