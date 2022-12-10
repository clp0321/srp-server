/**
     创建demand_tenant表
 */
create table demand_tenant
(
	id int auto_increment,
	user_id int null,
	position varchar(128) null,
	specify int null,
	price double null,
	method int null,
	creidt int null,
	ten_status int null,
	create_time int null,
	other varchar(1024) null,
	update_time int null,
	constraint demand_tenant_pk
		primary key (id),
	constraint demand_tenant_user_detail_id_fk
		foreign key (user_id) references user_detail (id)
);
