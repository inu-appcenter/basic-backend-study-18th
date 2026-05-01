-- 문제 1

create database my_test;

use my_test;

create table members (
	id int primary key,
    name varchar(50) not null,
    join_date date
);
    
desc members;

-- 문제 2

insert into members (id, name, join_date) values 
(1, '션', '2025-01-10'), 
(2, '네이트', '2025-02-15');

select * from members;

-- 문제 3 

update members
set name = '네이트2'
where id = 2;

delete from members
where id = 1;

select * from members;

-- 문제 4

create table products (
	product_id int auto_increment primary key,
    product_name varchar(100) not null,
    prodcut_code varchar(20) unique,
    price int not null,
    stock_count int not null default 0
);

desc products;
    
-- 문제 5

create table customers (
	customer_id int auto_increment primary key,
    name varchar(50) not null
);

create table orders (
	order_id int primary key auto_increment,
    customer_id int not null,
    order_date datetime default current_timestamp,
    
    constraint fk_orders_customers foreign key (customer_id)
		references customers(customer_id)
);

insert into customers (customer_id, name)
values (1, '홍길동');

insert into orders (customer_id) values(1);

select * from customers;
select * from orders;

-- 문제 6

insert into customers (customer_id)
values (999);

/* 
customer_id 에 해당하는 값이 테이블 customers에 반드시 존재해야 한다 
*/

insert into customers (customer_id) 
values(2);

/*
customer의 name 열은 not null 로 설정되어 있어 값을 반드시 입력해아 한다. 
*/    
    