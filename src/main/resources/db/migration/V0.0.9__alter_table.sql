/**
    修改house_pic，index为关键字，替换为pic_message
 */
alter table house_pic change `index` pic_message varchar(128) null;

