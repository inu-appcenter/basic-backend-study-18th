## 세션 6
```sql
SELECT name, price, stock_quantity, price * stock_quantity FROM products;
SELECT name, price, price + 3000 AS expected_price FROM products;
SELECT name, price, price - 1000 AS discounted_price FROM products;
SELECT name, price, price / 10 AS monthly_payment FROM products;

select concat(name, '(',email, ')') as name_and_email from customers;

select concat_ws(' - ', name, email, address) AS customer_details from customers;

select email, UPPER(email) as upper_email from customers;

select name, char_length(name) as char_length, length(name) as byte_length from customers;

select name, description from products;

select name, IFNULL(description, '상품설명 없음') as descripition 
from products;

select name, COALESCE(description, '상품설명 없음') as descripition 
from products;

-- 문제 풀이
select name, price, price * 0.85 as sale_price
from products;

select * from customers;
select concat_ws(' - ', name, address) as customer_info
from customers;

select name, coalesce(description, name) as product_display_info
from products;

select name, coalesce(description, name, '정보없음') as display_text
from products;

select 
	email, 
	substring_index(email, '@', 1) as user_id,
	char_length(substring_index(email, '@', 1)) as id_length
from customers;
```