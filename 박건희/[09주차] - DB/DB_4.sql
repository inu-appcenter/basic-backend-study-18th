-- 절 안에서 사칙연산 활용
SELECT name, price, stock_quantity, price * stock_quantity FROM products;

-- + AS를 사용하여 가독성 증가
SELECT name, price, stock_quantity, price * stock_quantity AS total_value FROM products;

-- 문자열 결합
SELECT CONCAT(name, ' (', email, ')') FROM customers;

-- + AS
SELECT CONCAT(name, ' (', email, ')') AS customer_info FROM customers;

-- CONCAT_WS
SELECT CONCAT_WS(' - ', name, email, address) AS customer_details FROM customers;

-- UPPER / LOWER
SELECT email, UPPER(email) AS upper_email FROM customers;
SELECT email, LOWER(UPPER(email)) AS upper_email FROM customers;

-- LENGTH / CHAR_LENGTH
SELECT name, CHAR_LENGTH(name) as char_length, LENGTH(name) AS byte_length FROM customers;

-- IFNULL
SELECT name, IFNULL(description, '상품 설명 없음') AS description FROM products;

-- COALERSCE
SELECT name, COALESCE(description, '상품 설명 없음') AS description FROM products;