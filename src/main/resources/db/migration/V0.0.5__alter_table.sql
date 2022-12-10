/**
    修改house_rent,删除主键前去掉自增
 */
alter table house_rent modify id int not null;
