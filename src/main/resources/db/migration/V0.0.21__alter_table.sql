/**
    修改house_manage，添加字段
 */
alter table house_manage modify house_owner varchar(32) null;

alter table house_manage modify cert_num varchar(32) null;

alter table house_manage
	add house_hash varchar(1024) null;

alter table house_manage
	add method int null;

alter table house_manage
	add payway int null;

alter table house_manage
	add price double null;

alter table house_manage
	add phone varchar(32) null;

alter table house_manage
	add update_time datetime null;

alter table house_manage
	add description varchar(1024) null;

alter table house_manage
	add publisher varchar(32) null;

alter table house_manage drop foreign key house_manage_house_rent_house_id_fk;

