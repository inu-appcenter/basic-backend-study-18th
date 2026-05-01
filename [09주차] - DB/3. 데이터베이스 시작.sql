-- 데이터베이스 생성

create database my_shop;

-- 작업 테이블 선택

use my_shop;

-- 테이블 생성

create table sample (
	product_id int primary key,
    name varchar(100),
    price int,
    stock_quantity int,
    release_date date
);

-- 테이블 구조 확인하기

desc sample;

-- insert 데이터 넣기

insert into sample (product_id, name, price, stock_quantity, release_date)
values (1, '프리미엄 청바지', 59900, 100, '2025-06-11');

-- 데이터 꺼내보기

select * from sample;

-- update 데이터 바꾸기

update sample 
set price = 40000
where product_id = 1;

-- delete 데이터 지우기

delete from sample
where product_id = 1;


