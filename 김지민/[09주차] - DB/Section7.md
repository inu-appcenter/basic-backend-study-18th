1번

```SQL
SELECT
     COUNT(*) AS `총 주문 건수`,
    COUNT(category) AS `카테고리 보유 건수`
FROM
    order_stat;
```

2번

```SQL
SELECT
    SUM(price * quantity) AS `총 매출액`,
    AVG(price * quantity) AS `평균 주문 금액`,
    MAX(price) AS `최고 단가`,
    MIN(price) AS `최저 단가`
FROM
    order_stat;
```

3번

```SQL
SELECT
     category,
    SUM(quantity) AS `카테고리별 총 판매 수량`,
    SUM(price * quantity) AS `카테고리별 총 매출액`
FROM
    order_stat
GROUP BY
    category
ORDER BY
    `카테고리별 총 매출액` DESC;
```

4번

```SQL
SELECT
    customer_name,
     COUNT(*) AS `총 주문 횟수`,
    SUM(quantity) AS `총 구매 수량`
FROM
    order_stat
GROUP BY
    customer_name
ORDER BY
    `총 주문 횟수` DESC, `총 구매 수량` DESC;
```

5번

```SQL
SELECT
    customer_name,
    SUM(price * quantity) AS `총 구매 금액`
FROM
    order_stat
GROUP BY
    customer_name
HAVING
    SUM(price * quantity) >= 400000
ORDER BY
    `총 구매 금액` DESC;
```

6번

```SQL
SELECT
    customer_name,
    COUNT(*) AS `주문 횟수`,
    SUM(price * quantity) AS `총 사용 금액`
FROM
    order_stat
WHERE
    category != '도서' OR category IS NULL
GROUP BY
    customer_name
HAVING
    COUNT(*) >= 2
ORDER BY
    `총 사용 금액` DESC;
```
