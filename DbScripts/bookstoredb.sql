drop database if exists bookstore;
create database bookstore;
use bookstore;

create table books (
	bookid integer primary key auto_increment,
    booktitle varchar(50),
    author varchar(50),
    price double
);

insert into books values(63, "Clean Code", "Robert Martin", "600");
insert into books (booktitle, author, price) values("Design Patterns", "Grady Booch", "550");

create table users (
	userid integer primary key auto_increment,
    username varchar(50),
    name varchar(50),
    password varchar(50)
);

insert into users values(34, "SK2025", "Suraj", "pass");
insert into users (username, name, password) values("PP9150", "Prajwal", "pass");

create table cart (
	userid integer,
    bookid integer,
    constraint fk_cartuserid foreign key (userid) references users(userid),
	constraint fk_cartbookid foreign key (bookid) references books(bookid)	
);

create table purchasehistory (
	userid integer,
    bookid integer,
    date date,
    constraint fk_hisuserid foreign key (userid) references users(userid),
	constraint fk_hisbookid foreign key (bookid) references books(bookid)
)

