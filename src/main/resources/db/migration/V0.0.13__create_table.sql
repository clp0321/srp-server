/**
    创建house_transfer 表
 */

create table house_transfer
(
	id int auto_increment,
	house_id varchar(128) null,
	name_call varchar(32) null,
	card_call varchar(32) null,
	name_rec varchar(32) null,
	card_rec varchar(32) null,
	card_index varchar(32) null,
	card_index_rec varchar(32) null,
	cert_index varchar(32) null,
	create_time datetime null,
	update_by varchar(32) null,
	update_time datetime null,
	transfer_status int null,
	hash varchar(128) null,
	constraint house_transfer_pk
		primary key (id),
	constraint house_transfer_house_rent_house_id_fk
		foreign key (house_id) references house_rent (house_id)
);