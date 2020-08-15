drop table if exists customer;

create table if not exists customer (
	customerId integer primary key,
	firstName varchar(255),
	lastName varchar(255)
);

create table if not exists invoice (
	invoiceId integer primary key,
	price float
);