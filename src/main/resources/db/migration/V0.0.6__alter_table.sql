/**
    修改house_rent表
 */
alter table house_rent drop primary key;

alter table house_rent drop column id;

alter table house_rent
	add constraint house_rent_pk
		primary key (house_id);
