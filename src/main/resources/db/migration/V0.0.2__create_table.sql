/*创建test表*/
create table test_user
(
id int auto_increment,
user_name varchar(30) not null,
password varchar(30) not null,
constraint test_user_pk
primary key (id)
);