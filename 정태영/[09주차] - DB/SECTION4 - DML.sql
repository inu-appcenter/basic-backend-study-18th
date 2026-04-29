-- <insert>
insert into customers values (null, '강감찬', 'kang@example.com', 'hashed_password_123', '서울시 관악구', '2025-06-11 10:30:00');
insert into customers values (null, '이순신', 'lee@example.com', 'hashed_password_123', '서울시 관악구', '2025-06-12 10:30:00');
insert into customers (name, email, password, address) values ('세종대왕', 'sejong@example.com', 'hashed_password_456', '서울시 종로구');

select * from customers;

insert into products (name, price, stock_quantity)
values ('베이직 반팔 티셔츠', 19900, 200);
insert into products (name, price, stock_quantity)
values ('초록색 긴팔 티셔츠', 30000, 50);

select * from products;

insert into products (name, price, stock_quantity) values
('검정 양말', 5000, 100),
('갈색 양말', 5000, 150),
('흰색 양말', 5000, 200);

select * from products;

-- <update>

select * from products where product_id = 1;

update products
set price = 9800, stock_quantity = 580
where product_id = 1;

select * from products where product_id = 1;

-- 안전 업데이트 모드에서는 오류 발생
/* 
udpate products
set price = 990; -- 모든 제품 990원으로 업데이트

update products
set price = 990;
where name = '베이직 반팔 티셔츠'; -- PK가 아닌 컬럼 사용
*/

-- 1단계 : 변경 대상 확인
select * from products
where name = '베이직 반팔 티셔츠';
-- 2단계 : 업데이트
set sql_safe_updates = 0; -- 안전 업데이트 모드 off

update products
set price = 19800
where name = '베이직 반팔 티셔츠';

set sql_safe_updates = 1; -- 안전 업데이트 모드 on

-- <delete>

delete from products
where product_id = 1;
