1번

```SQL
SELECT name AS 상품명, price AS 판매가 FROM products;
```

2번

```SQL
SELECT * FROM customers WHERE name = '장영실';
```

3번

```SQL
SELECT * FROM products
WHERE price >= 10000 AND stock_quantity < 50;
```

4번

```SQL
SELECT name, price FROM products WHERE product_id IN (2, 3, 4);
```

5번

```SQL
SELECT name, address FROM customers WHERE address LIKE '서울특별시%';
```

6번

```SQL
SELECT * FROM products WHERE description IS NULL;
```

7번

```SQL
SELECT * FROM products ORDER BY price DESC;
```

8번

```SQL
SELECT * FROM products ORDER BY price ASC, stock_quantity DESC;
```

9번

```SQL
SELECT * FROM customers ORDER BY join_date DESC LIMIT 2;
```

10번

```SQL
SELECT DISTINCT customer_id, product_id FROM orders;
```

11번

```SQL
SELECT
 name AS `상품 이름`,
 stock_quantity AS `남은 수량`
FROM
 products
WHERE
 price > 3000 AND stock_quantity <= 100
ORDER BY
 stock_quantity DESC
LIMIT 3;
```
