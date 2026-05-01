create table order_stat (
	order_id int primary key auto_increment,
    customer_name varchar(50),
    category varchar(50),
    product_name varchar(100),
    price int,
    quantity int,
    order_date date
);

insert into order_stat (customer_name, category, product_name, price, quantity, order_date) values
('이순신', '전자기기', '프리미엄 기계식 키보드', 150000, 1, '2025-05-10'),
('세종대왕', '도서', 'SQL 마스터링', 35000, 2, '2025-05-10'),
('신사임당', '가구', '인체공학 사무용 의자', 250000, 1, '2025-05-11'),
('이순신', '전자기기', '고성능 게이밍 마우스', 80000, 1, '2025-05-12'),
('세종대왕', '전자기기', '4K 모니터', 450000, 1, '2025-05-12'),
('장영실', '도서', '파이썬 데이터 분석', 40000, 3, '2025-05-13'),
('이순신', '문구', '고급 만년필 세트', 200000, 1, '2025-05-14'),
('세종대왕', '가구', '높이조절 스탠딩 데스크', 320000, 1, '2025-05-15'),
('신사임당', '전자기기', '노이즈캔슬링 블루투스 이어폰', 180000, 1, '2025-05-15'), 
('장영실', '전자기기', '보조배터리 20000mAh', 50000, 2, '2025-05-16'),
('홍길동', NULL, 'USB-C 허브', 65000, 1, '2025-05-17');

select * from order_stat;

select count(*) from order_stat;

select
	count(*) as `전체 주문 건수`,
    count(category) as `카테고리 등록 건수`
from 
	order_stat;
    
select
	sum(price * quantity) as `총 매출액`,
    avg(price * quantity) as `평균 주문 금액`
from 
	order_stat;
    
select 
	sum(quantity) as `총 판매 수량`,
    avg(quantity) as `주문당 평균`
from
	order_stat;
    
select
	max(price) as 최고가,
    min(price) as 최저가
from
	order_stat;

select
	min(order_date) as `최초 주문일`,
    max(order_date) as `최초 주문일`
from
	order_stat;

select
	count(customer_name) as `총 주문 건수`,
    count(distinct customer_name) as `순수 고객 수`
from
	order_stat;
    
select 
	category,
    count(*) as `카테고리별 주문 건수`
from
	order_stat
group by
	category;

select
	customer_name,
    count(*) as `주문 횟수`
from
	order_stat
group by
	customer_name;

select
	customer_name, 
    count(*) as `총 주문 횟수`,
    sum(quantity) as `총 구매 수량`,
    sum(price * quantity) as `총 구매 금액`
from
	order_stat
group by
	customer_name
order by
	`총 구매 금액` desc;
    
select 
	customer_name,
    count(*) as `총 주문 횟수`,
    sum(quantity) as `총 구매 수량`,
    sum(price * quantity) as `총 구매 금액`,
    '총 구매 금액' as `정렬 값`
from 
	order_stat
group by
	customer_name
order by
	'총 구매 금액' desc;

select
	customer_name,
    category,
    sum(price * quantity) as `카테고리별 구매 금액`
from
	order_stat
group by
	customer_name, category
order by
	customer_name, `카테고리별 구매 금액` desc;
    
select
	category,
    count(*)
from
	order_stat
group by 
	category;
    
-- 잘못된 쿼리의 예시 
    
select 
	category,
    product_name,
    count(*)
from
	order_stat
group by
	category;

select
	category,
    product_name,
    quantity,
    count(*),
    sum(quantity)
from
	order_stat
group by
	category;
    
select
	category,
    sum(price * quantity) as total_sales
from 
	order_stat
group by
	category;
    
/*
select
	category,
    sum(price * quantity) as total_sales
from
	order_stat
where
	sum(price * quantity) >= 500000
group by 
	category;
*/

select
	category,
    sum(price * quantity) as total_sales
from
	order_stat
group by
	category;
    
select
	category,
    sum(price * quantity) as total_sales
from
	order_stat
group by
	category
having
	sum(price * quantity) >= 500000;
    
-- having에서 별칭 사용

select 
	category,
    sum(price * quantity) as total_sales
from
	order_stat
group by 
	category
having
	total_sales >= 500000;
    
select
	customer_name,
    count(*) as order_count
from
	order_stat
group by
	customer_name;
    
select 
	customer_name,
    count(*) as order_count
from
	order_stat
group by 
	customer_name
having
	count(*) >= 3;
    
select 
	category,
    count(*) as premium_order_count
from
	order_stat
where
	price >= 10000
group by 
	category
having
	count(*) >= 2;
    
select * from order_stat
where price >= 100000;

select
	customer_name,
    sum(price * quantity) as total_purchase
from
	order_stat
where
	total_purchase >= 400000
group by
	customer_name;
    
select
	customer_name,
    sum(price * quantity) as total_purchase
from
	order_stat
where
	order_date < '2025-05-14'
group by
	customer_name
having
	count(*) >= 2
order by
	total_purchase desc
limit 1;

