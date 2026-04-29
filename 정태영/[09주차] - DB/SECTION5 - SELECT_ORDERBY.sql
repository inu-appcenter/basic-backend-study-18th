-- <setting>
use my_shop;

set foreign_key_checks = 0;
truncate table products;
truncate table customers;
truncate table orders;
set foreign_key_checks = 1;

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

select * from customers;
select * from products;
select * from orders;

-- <select>

select name 고객명, email as 이메일 from customers;

-- <where>

select * from customers where email = 'yisunsin@example.com';
select * from products where price >= 5000 AND stock_quantity >= 50;

select * from products where price between 5000 and 15000; -- 사이 값
select * from products where name in ('갤럭시', '아이폰', '에어팟'); -- 목록
select * from customers where email like 'sejong%'; -- 패턴 매칭

-- <order by>

select * from products order by price DESC, quantity ASC;

select * from products order by price desc limit 2 offset 1;

-- <distinct>

select distinct customer_id, product_id from orders;

-- <null>

select * from products where description is not null;

select product_id, name, description, description is null
from products
order by description is null desc, description desc;