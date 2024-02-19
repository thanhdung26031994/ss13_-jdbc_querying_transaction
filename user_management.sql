drop database if exists user_management;
create database if not exists user_management;
use user_management;

create table users(
	id int auto_increment primary key,
    `name` varchar(255) not null,
    email varchar(255) not null,
    country varchar(255) not null
);

