/**
    修改house_pic，添加外键
 */
alter table house_pic
	add constraint house_pic_house_rent_house_id_fk
		foreign key (house_id) references house_rent (house_id);
