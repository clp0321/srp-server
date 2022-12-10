/**
    创建house_manage 表
 */

create table house_manage
(
	id int auto_increment,
	house_id varchar(128) not null,
	house_owner varchar(32) not null,
	cert_num varchar(32) not null,
	size double null,
	struct varchar(32) null,
	province varchar(32) null,
	city varchar(32) null,
	country varchar(32) null,
	position varchar(128) null,
	house_status int null,
	specify int null,
	agency varchar(128) null,
	device_id varchar(1024) null,
	auth_time datetime null,
	constraint house_manage_pk
		primary key (id),
	constraint house_manage_house_rent_house_id_fk
		foreign key (house_id) references house_rent (house_id)
);