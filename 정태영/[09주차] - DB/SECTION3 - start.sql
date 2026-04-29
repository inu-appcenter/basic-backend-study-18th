CREATE DATABASE my_shop;

-- 작업 공간을 my_shop으로 선택
USE my_shop;

CREATE TABLE sample(
	product_id INT PRIMARY KEY,
    name VARCHAR(100),
    price INT,
    stock_quantity INT,
    release_date DATE
);

SHOW TABLES;

DROP TABLE sample;
DROP DATABASE my_shop;