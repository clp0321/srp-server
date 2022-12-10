/**
    创建house_pic
 */
create table house_pic
(
	id int auto_increment,
	house_id varchar(128) not null,
	`index` varchar(128) null,
	create_time datetime null,
	username varchar(128) null,
	constraint house_pic_pk
		primary key (id)
);
