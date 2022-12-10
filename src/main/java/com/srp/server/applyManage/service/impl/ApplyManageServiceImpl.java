package com.srp.server.applyManage.service.impl;

import com.srp.server.applyManage.dao.ApplyManageMapper;
import com.srp.server.applyManage.model.ApplyManage;
import com.srp.server.applyManage.service.ApplyManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.srp.server.applyManage.dao.ApplyManageDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;
@Service
public class ApplyManageServiceImpl implements ApplyManageService {
    @Autowired
    private ApplyManageMapper applyManageMapper;

    /**
     * 发送申请看房请求
     * @param applyManage
     * @return
     */
    @Override
    public Integer sendApply(ApplyManage applyManage) {
        return applyManageMapper.insert(applyManage);
    }

    /**
     * 根据用户名查询已申请房源
     * @param user_name
     * @return
     */
    @Override
    public List<ApplyManage> findApplyMessageByUserName(String user_name) {
        return applyManageMapper.selectByExample().
                where(userName, isIn(user_name)).
                build().execute();
    }

    /**
     * 根据用户名查询已同意的请求
     * @param user_name
     * @return
     */
    @Override
    public List<ApplyManage> findAccetpMessageByUserName(String user_name) {
        return applyManageMapper.selectByExample().
                where(userName, isIn(user_name)).
                and(applyStatus,isIn(1)).
                build().execute();
    }

    /**
     * 房东处理看房请求
     * @param applyManage
     * @return
     */
    @Override
    public Integer handelApply(ApplyManage applyManage) {
        return applyManageMapper.updateByPrimaryKey(applyManage);
    }

    /**
     *根据房东姓名查询需要处理的申请看房信息
     * @param houser_name
     * @return
     */
    @Override
    public List<ApplyManage> findHandleMessageByHouserName(String houser_name) {
        return applyManageMapper.selectByExample()
                .where(houserName,isIn(houser_name)).
                        and(applyStatus,isIn(2)).build().execute();
    }

    /**
     * 根据房东姓名查询处理完成的申请看房信息
     * @param houser_name
     * @return
     */
    @Override
    public List<ApplyManage> findApplyMessageByHouserName(String houser_name) {
        return applyManageMapper.selectByExample().
                where(houserName,isIn(houser_name)).
                and(applyStatus,isIn(0,1))
//                and(applyStatus,isIn(1))
                .build().execute();
    }
}
