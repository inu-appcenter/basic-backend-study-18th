1번

```SQL
SELECT
    name,
    price,
    price * 0.85 AS sale_price
FROM
    products;
```

2번

```SQL
SELECT
    CONCAT_WS(' - ', name, address) AS customer_info
FROM
    customers;
```

3번

```SQL
SELECT
    name,
    COALESCE(description, name) AS product_display_info
FROM
    products;
```

4번

```SQL
SELECT
    name,
    description,
    COALESCE(description, name, '정보 없음') AS display_text
FROM
    products;
```

5번

```SQL
SELECT
    email,
    SUBSTRING_INDEX(email, '@', 1) AS user_id,
    CHAR_LENGTH(SUBSTRING_INDEX(email, '@', 1)) AS id_length
FROM
    customers;
```
