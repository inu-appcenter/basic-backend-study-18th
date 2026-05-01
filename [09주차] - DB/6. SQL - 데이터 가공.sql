select name, price, stock_quantity from products;

-- 간단한 사칙연산 

select name, price, stock_quantity, price * stock_quantity from products;

-- as 사용

select 
	name,
    price, 
    stock_quantity,
    price * stock_quantity as total_stock_value
from
	products;
    
-- 덧셈 

select name, price, price + 3000 as expected_price from products;

-- 뻴셈 

select name, price, price - 1000 as discounted_price from products;

-- 나눗셈

select name, price, price / 10 as monthly_payment from products;

-- 문자열 함수

select name, email from customers;

select concat(name, ' (', email,')') from customers; 

select
	concat(name, ' (', email, ')') as name_and_email
from
	customers;
    
select concat_ws(' - ', name, email, address) as customer_details from customers;

select email, upper(email) as upper_email from customers;

select name, char_length(name) as char_length, length(name) as byte_length
from customers;

-- null을 다루는 함수들 

select
	name,
    ifnull(description, '상품 설명 없음') as description
from
	products;
    
 

