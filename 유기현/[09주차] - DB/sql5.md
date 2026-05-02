## 세션 6
```sql
SELECT * FROM customers;
SELECT * FROM products;
SELECT * FROM orders;

SELECT name AS 고객명, email AS 이메일
FROM customers; -- AS 사용으로 가독성 향

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

select * from customers where email like 'sejo%';
select * from customers where email like '%example.com';

select * from customers where address not like '서울특별시%';

SELECT * FROM customers ORDER BY join_date DESC;

SELECT * FROM products ORDER BY stock_quantity DESC, price ASC;

select * from products order by product_id asc limit 0, 2;
select * from products order by product_id asc limit 2, 2;
select * from products order by product_id asc limit 4, 2; -- 페이징 기능

SELECT distinct customer_id FROM orders;
select distinct_id product_id from orders;

select * from products where description = null; -- 이렇게 하면 안된다.
select * from products where description is null;

SELECT * FROM products ORDER BY description ASC; -- null은 가장 작은 값

SELECT product_id, name, description, description IS NULL
FROM products
ORDER BY (description is null) DESC, description desc;

SELECT name, price FROM products WHERE product_id IN (2, 3, 4);

select * from products where description is null;

select * from customers order by join_date desc limit 2;

select name as `상품 이름`, stock_quantity as `남은 수량` from products
where price > 3000 and stock_quantity <= 100
order by stock_quantity desc limit 3;
```