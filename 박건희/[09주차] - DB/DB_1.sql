CREATE DATABASE my_shop;

USE my_shop; -- 데이터베이스 선택

CREATE TABLE sample(
	product_id INT PRIMARY KEY,
    name VARCHAR(100),
    price INT,
    stock_quantity INT,
    release_date DATE
);

DESC sample; -- 또는 DESCRIBE sample

SHOW DATABASES; -- 가지고 있는 모든 데이터베이스 목록을 보여줌.
SHOW TABLES; -- 데이터베이스가 가지고 있는 모든 테이블 목록을 보여줌.

DROP DATABASE my_shop; -- 데이터 베이스 삭제