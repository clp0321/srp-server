# 基于5G物联的区块链共享房屋租赁平台-后端

#### 介绍
基于5G物联的区块链共享房屋租赁平台-后端

#### 软件架构
软件架构说明


#### 安装教程

1.  


#### 使用说明

在resource下新建自己的properties和yml文件

在properties文件中配置数据库连接参数
~~~
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/srp?characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useSSL=false
spring.datasource.username=root
spring.datasource.password=123456
~~~
在yml文件中配置区块链连接信息  修改服务牌IP地址，并将服务器中ca.crt，sdk.crt，sdk.key文件拷贝到resource目录下
~~~
server:
  port: 8989
encrypt-type: # 0:standard, 1:guomi
  encrypt-type: 0

group-channel-connections-config:
  caCert: classpath:ca.crt
  sslCert: classpath:sdk.crt
  sslKey: classpath:sdk.key
  all-channel-connections:
  - group-id: 1 #group ID
    connections-str:
    - 202.193.60.231:20200 # node listen_ip:channel_listen_port
    - 202.193.60.231:20201
  - group-id: 2
    connections-str:
    - 202.193.60.231:20202 # node listen_ip:channel_listen_port
    - 202.193.60.231:20203

channel-service:
  group-id: 1 # The specified group to which the SDK connects
  agency-name: fisco # agency name

accounts:
  pem-file: 0xcdcce60801c0a2e6bb534322c32ae528b9dec8d2.pem
  p12-file: 0x98333491efac02f8ce109b0c499074d47e7779a6.p12
  password: 123456
~~~

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request
