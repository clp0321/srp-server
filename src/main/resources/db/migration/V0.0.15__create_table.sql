/**
    创建house_control 表
 */

create table house_control
(
	id int auto_increment,
	house_id varchar(128) null,
	create_by varchar(32) null,
	create_time datetime null,
	update_time datetime null,
	house_status int null,
	constraint house_control_pk
		primary key (id),
	constraint house_control_house_rent_house_id_fk
		foreign key (house_id) references house_rent (house_id)
);