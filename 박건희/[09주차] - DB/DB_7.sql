-- 두 함수의 차이점을 보는 쿼리문
SELECT
 COUNT(*) AS `전체 주문 건수`, -- NULL 포함
 COUNT(category) AS `카테고리 등록 건수` -- NULL 제외
FROM order_stat;

-- 함수 활용 쿼리문
SELECT
 SUM(price * quantity) AS `총 매출액`,
 AVG(price * quantity) AS `평균 주문 금액`
FROM order_stat;
 
 
SELECT
 SUM(quantity) AS `총 판매 수량`,
 AVG(quantity) AS `주문당 평균 수량`
FROM order_stat;

-- MAX, MIN 함수 활용 쿼리문
SELECT
 MAX(price) AS 최고가,
 MIN(price) AS 최저가
FROM order_stat;

SELECT
 MIN(order_date) AS `최초 주문일`,
 MAX(order_date) AS `최근 주문일`
FROM order_stat;

-- DISTINCT 활용 쿼리문
SELECT
 COUNT(customer_name) AS `총 주문 건수`,
 COUNT(DISTINCT customer_name) AS `순수 고객 수`
FROM order_stat;

-- GROUP BY 활용 쿼리문
SELECT
 category,
 COUNT(*) AS `카테고리별 주문 건수`
FROM order_stat
GROUP BY category;

SELECT
 customer_name,
 COUNT(*) AS `주문 횟수`
FROM order_stat
GROUP BY customer_name;

-- 집계 함수 활용 쿼리문
SELECT
 customer_name,
 COUNT(*) AS `총 주문 횟수`,
 SUM(quantity) AS `총 구매 수량`,
 SUM(price * quantity) AS `총 구매 금액`
FROM order_stat
GROUP BY customer_name
ORDER BY `총 구매 금액` DESC; -- 백틱 사용 주의!, ORDER BY는 마지막에 작성!

-- 다중 그룹화 쿼리문
SELECT
 customer_name,
 category,
 SUM(price * quantity) AS `카테고리별 구매 금액`
FROM order_stat
GROUP BY customer_name, category
ORDER BY customer_name, `카테고리별 구매 금액` DESC;

-- 잘못된 쿼리의 예시
SELECT
 category,
 product_name, -- 바로 이 컬럼이 문제다!
 COUNT(*)
FROM order_stat
GROUP BY category;

-- HAVING 사용 쿼리문
SELECT
 category,
 SUM(price * quantity) AS total_sales
FROM order_stat
GROUP BY category
HAVING SUM(price * quantity) >= 500000;

-- + AS 사용
SELECT
 category,
 SUM(price * quantity) AS total_sales
FROM order_stat
GROUP BY category
HAVING total_sales >= 500000;

-- HAVING문 예시
-- 1단계 : 고객별 주문 횟수
SELECT
 customer_name,
 COUNT(*) AS order_count
FROM order_stat
GROUP BY customer_name;

-- 2단계 : <^^ 고객 찾기
SELECT
 customer_name,
 COUNT(*) AS order_count
FROM order_stat
GROUP BY customer_name
HAVING COUNT(*) >= 3;

-- WHERE와 HAVING 동시 사용 쿼리문 예시
SELECT
 category,
 COUNT(*) AS premium_order_count
FROM
 order_stat
WHERE -- 개별 조건 적용
 price >= 100000 
GROUP BY -- 그룹화
 category 
HAVING -- 그룹별 조건 적용
 COUNT(*) >= 2; 
 
 -- 실행 순서를 익히기 위한 쿼리문
 SELECT
 customer_name,
 SUM(price * quantity) AS total_purchase -- 5단계
FROM order_stat -- 1단계
WHERE order_date < '2025-05-14' -- 2단계
GROUP BY customer_name -- 3단계
HAVING COUNT(*) >= 2 -- 4단계
ORDER BY total_purchase DESC -- 6단계
LIMIT 1; -- 7단계