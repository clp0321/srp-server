/**
    创建house_revoke 表
 */

create table house_revoke
(
	id int auto_increment,
	house_id varchar(128) null,
	spon_name varchar(32) null,
	card_num varchar(32) null,
	card_index varchar(32) null,
	cert_index varchar(128) null,
	house_status int null,
	create_time datetime null,
	update_by varchar(32) null,
	update_time datetime null,
	revoke_hash varchar(128) null,
	constraint house_revoke_pk
		primary key (id),
	constraint house_revoke_house_rent_house_id_fk
		foreign key (house_id) references house_rent (house_id)
);