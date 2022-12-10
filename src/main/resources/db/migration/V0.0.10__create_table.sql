/**
    创建house_device 表
 */

create table house_device
(
	device_id varchar(128) not null,
	house_id varchar(128) null,
	device_type varchar(128) null,
	device_status varchar(1) null,
	device_code varchar(1024) null,
	update_time datetime null,
	constraint house_device_pk
		primary key (device_id),
	constraint house_device_house_rent_house_id_fk
		foreign key (house_id) references house_rent (house_id)
);