/**
    创建house_review 表
 */

create table house_review
(
	id int auto_increment,
	house_id varchar(128) null,
	spname varchar(32) null,
	wallet varchar(1024) null,
	card_num varchar(32) null,
	card_index varchar(32) null,
	cert_index varchar(32) null,
	rev_status int null,
	create_time datetime null,
	update_by varchar(32) null,
	update_time datetime null,
	hash varchar(1024) null,
	constraint house_review_pk
		primary key (id),
	constraint house_review_house_rent_house_id_fk
		foreign key (house_id) references house_rent (house_id)
);