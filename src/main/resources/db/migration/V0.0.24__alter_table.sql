/**
    修改demand_tenant表， 将发布的需求价格改为区间
 */
alter table demand_tenant change price low_price double null;

alter table demand_tenant
	add high_price double null after low_price;

