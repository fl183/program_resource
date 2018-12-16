DROP TABLE IF EXISTS product_info;
create table `product_info` (
	`product_id` varchar(32) not null,
	`product_name` varchar(64) not null,
	`product_price` decimal(8,2) not null,
	`product_stock` int not null comment '库存',
	`product_description` varchar(64),
	`product_icon` varchar(512) comment '小图',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
	primary key (`product_id`)
) engine=InnoDB comment '商品表';

DROP TABLE IF EXISTS product_category;
create table `product_category` (
	`category_id` int not null auto_increment,
	`category_name` varchar(64) not null comment '类型名称',
	`category_type` int not null,
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
	primary key (`category_id`),
	unique key `uqe_category_type` (`category_type`)
) engine=InnoDB comment '类目表';

DROP TABLE IF EXISTS order_master;
create table `order_master` (
	`order_id` varchar(32) not null,
	`buyer_name` varchar(32) not null comment '买家名字',
	`buyer_phone` varchar(32) not null,
	`buyer_address` varchar(128) not null,
	`buyer_openid` varchar(64) not null comment '买家微信openid',
	`order_amount` decimal(8,2) not null comment '订单总金额',
	`order_status` tinyint(3) not null default '0' comment '订单状态，默认0新下单',
	`pay_status` tinyint(3) not null default '0' comment '支付状态，默认0未支付',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`update_time` timestamp not null default current_timestamp on update current_timestamp  comment '修改时间',
	primary key (`order_id`),
	key `idx_buyer_openid` (`buyer_openid`)
) engine=InnoDB comment '订单表';

DROP TABLE IF EXISTS order_detail;
create table `order_detail` (
	`detail_id` varchar(32) not null,
	`order_id` varchar(32) not null,
	`product_id` varchar(32) not null,
	`product_name` varchar(64) not null,
	`product_price` decimal(8,2) not null,
	`product_quantity` int not null comment '商品数量',
	`product_icon` varchar(512),
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
	primary key (`detail_id`),
	key `idx_order_id` (`order_id`)
) engine=InnoDB comment '订单详情表';