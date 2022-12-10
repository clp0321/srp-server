/**
    创建house_rent表
 */
create table house_rent
(
	id int auto_increment,
	house_id varchar(128) null,
	house_hash varchar(1024) null,
	method int null,
	payway int null,
	price double null,
	phone varchar(32) null,
	update_time datetime null,
	description varchar(1024) null,
	publisher varchar(32) null,
	constraint house_rent_pk
		primary key (id)
);
