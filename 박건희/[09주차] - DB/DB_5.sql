-- Q1.
SELECT name, price, price * 0.85 AS sale_price
FROM products;

-- Q2.
SELECT CONCAT_WS(' - ', name, address) AS customer_info
FROM customers;

-- Q3.
SELECT name, COALESCE(description, name) AS product_display_info
FROM products;

-- Q4.
SELECT name, description, COALESCE(description, name, '정보 없음') AS display_text
FROM products;

-- Q5.
SELECT email, SUBSTRING_INDEX(email, '@', 1) AS user_id, CHAR_LENGTH(SUBSTRING_INDEX(email, '@', 1)) AS id_length
FROM customers;