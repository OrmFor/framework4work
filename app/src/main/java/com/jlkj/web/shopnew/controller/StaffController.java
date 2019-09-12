package com.jlkj.web.shopnew.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.jlkj.web.shopnew.controller.base.BaseController;
import com.jlkj.web.shopnew.core.ResultCode;
import com.jlkj.web.shopnew.core.StatusCode;
import com.jlkj.web.shopnew.pojo.Company;
import com.jlkj.web.shopnew.pojo.Staff;
import com.jlkj.web.shopnew.service.ICompany;
import com.jlkj.web.shopnew.service.IStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffController extends BaseController {

    @Autowired
    private IStaff staffService;
    @Autowired
    private ICompany companyService;


    //获取所有员工
    @RequestMapping("/getStaff")
    public ResultCode getStaff(){
        JSONObject json = getJsonFromRequest();
        int bossId = json.getInteger("bossId");

        Company condi = new Company();
        condi.setBossid(bossId);
        Company company = companyService.getByCondition(condi);
        List<Staff> list = Lists.newArrayList();
        if(company != null) {
            Staff cond = new Staff();
            cond.setCompanyId(company.getId());
            list = staffService.getList(cond);
        }
        return new ResultCode(StatusCode.SUCCESS,list);
    }

}
