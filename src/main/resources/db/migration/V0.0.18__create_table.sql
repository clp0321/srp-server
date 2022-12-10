/**
     创建apply_manage表
 */
create table apply_manage
(
	id int auto_increment,
	house_id varchar(128) null,
	user_name varchar(32) null,
	houser_name varchar(32) null,
	apply_time datetime null,
	device_num varchar(32) null,
	apply_status int null,
	password varchar(32) null,
	password_time varchar(32) null,
	constraint apply_manage_pk
		primary key (id)
);

