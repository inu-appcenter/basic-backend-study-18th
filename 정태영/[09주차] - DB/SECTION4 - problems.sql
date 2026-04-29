-- <문제 1>
create database my_test;
use my_test;

create table members(
	id		int primary key,
    name	varchar(50) not null,
    join_date DATE
);

desc members;

-- <문제 2>
insert into members(id, name, join_date) values
(1, '션', '2025-01-10'),
(2, '네이트', '2025-02-15');

select * from members;

-- <문제 3>
update members
set name = '네이트2'
where id = 2;

delete from members
where id = 1;

select * from members;

-- <문제 4>
create table products(
	product_id		int auto_increment primary key,
    product_name	varchar(100) not null,
    product_code	varchar(20) unique,
    price			int not null,
    stock_count		int not null default 0
);

desc products;

-- <문제 5>
create table customers(
	customer_id 	int primary key auto_increment,
    name 			varchar(50) not null
);

create table orders(
	order_id 		int auto_increment primary key,
    customer_id		int not null,
    order_date		datetime default current_timestamp,
    
    constraint fk_orders_customers foreign key (customer_id) references customers(customer_id)
);

insert into customers (name) values ('홍길동');
select * from customers;

insert into orders (customer_id) values (1);
select * from orders;

-- <문제 6>

-- 제약 조건 위반 : 999에 해당하는 customer_id가 없음
insert into orders (customer_id) values (999);

-- NOT NULL 위반
insert into customers (customer_id) values (2);
