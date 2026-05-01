-- 고객 테이블

create table customers (
	customer_id int auto_increment primary key,
    name varchar(50) not null,
    email varchar(100) not null unique,
    password varchar(255) not null,
    address varchar(255) not null,
    join_date datetime default current_timestamp
);

-- 날짜와 기본값 설정 옵션

/* 
create table test (
	...
    created_at datetime default current_timestamp,
    updated_at datetime defualt current_timestamp on update current_timestamp
);
*/

-- 상품 테이블 

create table products (
	product_id int auto_increment primary key,
    name varchar(100) not null,
    description text,
    price int not null,
    stock_quantity int not null default 0
);


-- 주문 테이블

create table orders (
	order_id int auto_increment primary key,
    customer_id int not null,
    product_id int not null,
    quantity int not null,
    order_date datetime default current_timestamp,
    status varchar(20) not null default '주문접수',
    
    constraint fk_orders_customers foreign key (customer_id)
		references customers(customer_id),
        
	constraint fk_orders_products foreign key (product_id)
		references products(product_id)
);

-- 열 추가하기 

alter table customers
add column point int not null default 0;

-- 열 데이터 타입 변경하기
 
alter table customers
modify column address varchar(500) not null;

-- 열 삭제하기

alter table customers
drop column point;

-- 제약 조건 무시하기

drop table products;

truncate table products;

set foreign_key_checks = 0;

truncate table products;

set foreign_key_checks = 1;

-- insert 문법

insert into customers values (null, '강감찬', 'kang@example.com', 'hashed_password_123', '서울시 관삭구', '2025-06-11 10:30:00');
insert into customers values (null, '이순신', 'lee@example.com', 'hashed_password_123', '서울시 관악구', '2025-06-12 10:30:00');

select * from customers;

-- 원하는 열만 골라서

insert into customers (name, email, password, address)
values ('세종대왕', 'sejong@example.com', 'hashed_password_456', '서울시 종로구');

insert into products (name, price, stock_quantity)
values ('베이직 반팔 티셔츠', 19900, 200);

insert into products (name, price, stock_quantity)
values ('초록색 긴팔 티셔츠', 30000, 50);

select * from products;

-- 한번에 등록

insert into products (name, price, stock_quantity) values
('검정 양말', 5000, 100),
('갈색 양말', 5000, 150),
('흰색 양말', 5000, 200);

-- update 문법 

select * from products
where product_id = 1

update products 
set price = 9800, stock_quantity = 580
where product_id = 1;

select * from products
where product_id = 1

update products
set price = 990;

-- 안전 업데이트 모드 

select @@sql_safe_updates

update products 
set price = 990
where name = '베이직 반팔 티셔츠';

/*
안전 업데이트 모드 켜고 끄기 
set sql_safe_updates = 0;
set sql_safe_updates = 1;
*/

set sql_safe_updates = 0;

update products
set price = 990;

set sql_safe_updates = 1;

select * from products;

-- 1단계: 변경할 대상을 눈으로 먼저 확인한다.
select * from products
where name = '베이직 반팔 티셔츠';

-- 2단계: 확인한 대상에 대해서만 update를 실행한다.
set sql_safe_updates = 0;

update products 
set price = 19800
where name = '베이직 반팔 티셔츠';

set sql_safe_updates = 1; -- 안전 모드 활성화 


-- delete 문법 

select * from products 
where product_id = 1;

delete from products 
where product_id = 1;
select * from products;

set foreign_key_checks = 0;
truncate table products;
truncate table customers;
truncate table orders;
set foreign_key_checks = 1;

-- 'name' 열을 빼고 insert를 시도한다. 
insert into customers (email, password, address)
values ('noname@examples.com', 'password123', '서울시 마포구');

insert into customers (name, email, password, address)
values ('강감찬', 'kang@example.com', 'new_password_789', '서울시 강남구');

select * from customers;

-- 'kang@example.com' 은 이미 '강감찬' 고객이 사용중인 이메일입니다. 
insert into customers (name, email, password, address)
values ('홍길동', 'kang@example.com', 'new_passwrod_123', '서울시 송파구');

insert into products (name, price, stock_quantity)
values ('베이직 반팔 티셔츠', 19900, 200);

select * from products;

-- 1번 고객이 1번 상품을 1개 주문한다. 
insert into orders (customer_id, product_id, quantity)
values (1, 1, 1);

-- 존재하지 않는 999번 고객이 1번 상품을 1개 주문하려고 시도한다. 
insert into orders (customer_id, product_id, quantity)
values (999, 1, 1);





