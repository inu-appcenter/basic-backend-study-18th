use my_shop;

-- <create>

CREATE TABLE customers(
	customer_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    join_date DATETIME DEFAULT CURRENT_TIMESTAMP
    -- updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

create table products(
	product_id		int auto_increment primary key,
    name			varchar(100) not null,
    description		text,
    price 			int not null,
    stock_quantity	int not null default 0
);

CREATE TABLE orders(
	order_id 		int auto_increment primary key,
    customer_id 	int not null,
    product_id 		int not null,
    quantity_id 	int not null,
    order_date 		datetime default current_timestamp,
    status 			varchar(20) not null default '주문접수',
    
    constraint fk_orders_customers foreign key (customer_id) references customers(customer_id),
    constraint fk_orders_products foreign key (product_id) references products(product_id)
);

-- <alter>

alter table customers 
add column point int not null default 0;

alter table customers
modify column address varchar(500) not null;

alter table customers
drop column point;

-- <drop & truncate>
/*
DROP TABLE products; -- 참고 중 => 오류 발생
TRUNCATE TABLE products; -- 참고 중 => 오류 발생

SET FOREIGN_KEY_CHECKS = 0; -- 제약 조건 무시

TRUNCATE TABLE products;

SET FOREIGN_KEY_CHECKS = 1; -- 제약 조건 확인
*/