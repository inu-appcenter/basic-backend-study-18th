-- Q1.
SELECT name AS 상품명, price AS 판매가 FROM products;

-- Q2.
SELECT * FROM customers WHERE name = '장영실';

-- Q3.
SELECT * FROM products WHERE price >= 10000 AND stock_quantity < 50;

-- Q4.
SELECT name, price FROM products WHERE product_id IN (2, 3, 4);

-- Q5.
SELECT name, address FROM customers WHERE address LIKE '서울특별시%';

-- Q6.
SELECT * FROM products WHERE description IS NULL;

-- Q7.
SELECT * FROM products ORDER BY price DESC;

-- Q8.
SELECT * FROM products ORDER BY price ASC, stock_quantity DESC;

-- Q9.
SELECT * FROM customers ORDER BY join_date DESC LIMIT 2;

-- Q10.
SELECT DISTINCT customer_id, product_id FROM orders;

-- Q11.
SELECT name AS `상품 이름`, stock_quantity AS `남은 수량`
FROM products
WHERE price > 3000 AND stock_quantity <= 100
ORDER BY stock_quantity DESC
LIMIT 3;
