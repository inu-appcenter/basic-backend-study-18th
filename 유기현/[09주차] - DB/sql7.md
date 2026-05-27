## 세션 7
```sql
use my_shop;

CREATE TABLE order_stat (
order_id INT PRIMARY KEY AUTO_INCREMENT,
customer_name VARCHAR(50),
category VARCHAR(50),
product_name VARCHAR(100),
price INT,
quantity INT,
order_date DATE
);

INSERT INTO order_stat (customer_name, category, product_name, price, quantity, order_date) VALUES
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
('홍길동', NULL, 'USB-C 허브', 65000, 1, '2025-05-17'); -- 카테고리가 NULL인 데이터 추가

select * from order_stat;
select count(*) as `총 주문 건수` from order_stat;
select count(category) from order_stat; -- 10개
select count(*) as `전체 주문 건수`, count(category) as `카테고리 등록 건수` from order_stat;

select 
sum(quantity) as `총 매출액`, 
avg(quantity) as `평균 주문 금액`
from order_stat;

select max(price) as 최고가, min(price) as 최저가 from order_stat;
select max(order_date) as `최초 주문일`, min(order_date) as `최근 주문일` from order_stat;

select count(distinct customer_name) from order_stat;
SELECT
COUNT(customer_name) AS `총 주문 건수`,
COUNT(DISTINCT customer_name) AS `순수 고객 수`
FROM
order_stat;

SELECT
	category,
	COUNT(*) AS `카테고리별 주문 건수`
FROM
	order_stat
GROUP BY
	category;

SELECT
	customer_name,
	COUNT(*) AS `총 주문 횟수`,
	SUM(quantity) AS `총 구매 수량`,
	SUM(price * quantity) AS `총 구매 금액`
FROM
	order_stat
GROUP BY
	customer_name
ORDER BY `총 구매 금액` DESC;

select customer_name, category, sum(price * quantity) as `카테고리별 구매 금약`
from order_stat
group by customer_name, category
order by customer_name, `카테고리별 구매 금약` desc;

select category, product_name, count(*)
from order_stat
group by category, product_name
order by category;
select
    category,
    sum(price * quantity) as total_sales
from
    order_stat
group by
    category
having
    sum(price * quantity) >= 500000;

select customer_name, count(*) as order_count
from order_stat
group by customer_name having count(*) >= 3;

select category, count(*) as premium_order_count
from order_stat
where price >= 100000
group by category having count(*) >= 2;

select customer_name, sum(price * quantity) as total_purchase
from order_stat
where order_date < '2025-05-14'
group by customer_name having count(*) >= 2
order by total_purchase desc
    limit 1;

-- 문제 풀이
select count(*), count(category)
from order_stat;

SELECT
    SUM(price * quantity) AS `총 매출액`,
    AVG(price * quantity) AS `평균 주문 금액`,
    MAX(price) AS `최고 단가`,
    MIN(price) AS `최저 단가`
FROM
    order_stat;

select * from order_stat;

select category, sum(quantity) as `카테고리별 총 판매 수량`, sum(price * quantity) as `카테고리별 매출액`
from order_stat
group by category
order by `카테고리별 매출액` desc;

select customer_name, count(*) as `총 주문 횟수`, sum(quantity) as `총 구매 수량`
from order_stat
group by customer_name
order by `총 주문 횟수` desc, `총 구매 수량` desc;

SELECT customer_name, SUM(price * quantity) AS `총 구매 금액`
FROM order_stat
GROUP BY customer_name
HAVING SUM(price * quantity) >= 400000
ORDER BY `총 구매 금액` DESC;

select customer_name, count(*) as `주문 횟수`, sum(price * quantity) as `총 사용 금액`
from order_stat
where category <> '도서' or category is null
group by customer_name having count(*) >= 2
order by `총 사용 금액` desc;
```