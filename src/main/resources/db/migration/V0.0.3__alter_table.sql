ALTER TABLE user_detail MODIFY address_name varchar(32) COMMENT '用户姓名';
    ALTER TABLE user_detail MODIFY status varchar(32) COMMENT '状态 0、正常，1、封号，2、注销';
    ALTER TABLE user_detail MODIFY phone varchar(32) NOT NULL COMMENT '电话号码';
    ALTER TABLE user_detail MODIFY avatar varchar(128) COMMENT '头像 用户头像';
    ALTER TABLE user_detail MODIFY CREATED_TIME datetime COMMENT '创建时间';
    ALTER TABLE user_detail MODIFY UPDATED_TIME datetime COMMENT '更新时间';