use my_shop;

-- <arithmethic operations>
select name, price, stock_quantity, price*stock_quantity as total_stock_value 
from products;

-- <concat functions>
select concat(name, ' (', email, ')') as name_and_email
from customers;

select concat_ws(' - ', name, email, address) as customer_details -- mysql 전용 함수
from customers;

-- <null functions>

select name, ifnull(description, '상품 설명 없음') as description
from products;

/*
select name, coalesce(short_description, long_description, '상품 설명 없음') as description
from products;
*/