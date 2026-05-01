use my_shop;

set foreign_key_checks = 0;
truncate table products;
truncate table customers;
truncate table orders;
set foreign_key_checks = 1;

insert into customers (name, email, password, address, join_date) values
('이순신', 'yisunsin@example.com', 'password123', '서울특별시 중구 세종대로', '2023-05-01'),
('세종대왕', 'sejong@example.com', 'password456', '서울특별시 종로구 사직로','2024-05-01'),
('장영실', 'youngsil@example.com', 'password789', '부산광역시 동래구 복천동', '2025-05-01');

insert into products (name, description, price, stock_quantity) values
('갤럭시', '최신 AI 기능이 탑재된 고성능 스마트폰', 10000, 55),
('LG 그램', '초경량 디자인과 강력한 성능을 자랑하는 노트북', 20000, 35),
('아이폰', '직관적인 사용자 경험을 제공한느 스마트폰', 5000, 55),
('에어팟', '편리한 사용성의 무선 이어폰', 3000, 110),
('보급형 스마트폰', null, 5000, 100);

insert into orders (customer_id, product_id, quantity) values
(1, 1, 1),
(2, 2, 1),
(3, 3, 1),
(1, 4, 2),
(2, 2, 1);

select * from customers;
select * from products;
select * from orders;

-- 검색기능

select * from customers where email = 'yisunsin@example.com';

select * from products where price >= 10000;

select * from products where price >= 5000 and stock_quantity >= 50;
select * from products where price = 20000 or stock_quantity >= 100;
select * from products where price != 20000;

select * from products where price between 5000 and 15000;

select * from products where price not between 5000 and 15000;

select * from products where name = '갤럭시' or name = '아이폰' or name = '에어팟';

select * from products where name in ('갤럭시', '아이폰', '에어팟');

select * from products where name != '갤럭시' and name != '아이폰' and name != '에어팟';

select * from products where name not in ('갤럭시', '아이폰', '에어팟');

select * from customers where email like 'sejong%';

select * from customers where address not like '서울특별시%';

select * from customers order by join_date desc;

select * from customers order by join_date asc; -- asc는 생략 가능

select * from products order by price asc;

select * from products order by stock_quantity desc, price asc;

-- limit

select * from products order by price desc limit 2;

-- offset
 
select * from products order by product_id asc limit 0, 2;

select * from products order by products_id asc limit 0, 2;

select * from products order by product_id asc limit 2, 2;

select * from products order by product_id asc limit 2, 2;

select * from products order by product_id asc limit 4, 2;

-- distinct 중복 제거

select customer_id from orders;

select distinct customer_id from orders;

select customer_id, product_id from orders;

select distinct customer_id, product_id from orders;

select * from products where description = null

select * from products where description is null;

select * from products where description is not null;

select * from products order by description asc;

select * from products order by description desc;

select product_id, name, description, description is null
from products
order by description desc;

select product_id, name, description, description is null
from products
order by description is null desc;

select product_id, name, description, description is null
from products
order by description is null desc, description desc;


