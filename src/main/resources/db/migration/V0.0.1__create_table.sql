CREATE TABLE user_detail(
    id INT NOT NULL AUTO_INCREMENT  COMMENT 'id' ,
    user_name VARCHAR(32) NOT NULL   COMMENT '用户名' unique ,
    password VARCHAR(32) NOT NULL    COMMENT '密码' ,
    address_name VARCHAR(32) NOT NULL    COMMENT '用户姓名' ,
    role INT NOT NULL    COMMENT '身份 0、租客；1、房东；2、代理商；3.监管人员' ,
    cert_id VARCHAR(32)    COMMENT '身份证号 用户身份证号码' ,
    status VARCHAR(32) NOT NULL    COMMENT '状态 0、正常，1、封号，2、注销' ,
    phone VARCHAR(32)    COMMENT '电话号码' ,
    address VARCHAR(1024)    COMMENT '地址 用户地址' ,
    avatar VARCHAR(128) NOT NULL    COMMENT '头像 用户头像' ,
    user_hash VARCHAR(128)    COMMENT '链上哈希 用户de 链上哈希值' ,
    CREATED_TIME DATETIME  NOT NULL   COMMENT '创建时间' ,
    UPDATED_TIME DATETIME  NOT NULL   COMMENT '更新时间' ,
    PRIMARY KEY (id)
) COMMENT = '用户详情 本地数据库保存的用户信息';