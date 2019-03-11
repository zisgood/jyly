create database jyly;

create table user(user_id int primary key auto_increment,username varchar
(18),password varchar(30),real_name varchar(20),status int,create_date datetime,
update_date datetime);