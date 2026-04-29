-- <문제 1>
select name 상품명, price 판매가 from products;

-- <문제 2>
select * from customers where name = '장영실';

-- <문제 3>
select * from products where price >= 10000 AND stock_quantity < 50;

-- <문제 4>
select name, price from products where product_id in (2,3,4);

-- <문제 5>
select name, address from customers where address like '서울특별시%';

-- <문제 6>
select * from products where description is null;

-- <문제 7>
select * from products order by price desc;

-- <문제 8>
select * from products order by price, stock_quantity desc;

-- <문제 9>
select * from customers order by join_date desc limit 2;

-- <문제 10>
select distinct customer_id, product_id from orders;

-- <문제 11>
select name `상품 이름`, stock_quantity `남은 수량`
from products
where price > 3000 AND stock_quantity <= 100
order by stock_quantity desc 
limit 3;