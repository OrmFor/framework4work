package com.jlkj.web.shopnew.controller;


import com.alibaba.fastjson.JSONObject;
import com.jlkj.web.shopnew.controller.base.BaseController;
import com.jlkj.web.shopnew.core.ResultCode;
import com.jlkj.web.shopnew.core.StatusCode;
import com.jlkj.web.shopnew.pojo.Company;
import com.jlkj.web.shopnew.service.ICompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController extends BaseController {

    @Autowired
    private ICompany companyService;


    /**
    * @Author wwy
    * @Description 获取我的企业
    * @return com.jlkj.web.shopnew.core.ResultCode
    **/
    @RequestMapping("/getMyCompany")
    public ResultCode getMyCompany(){
        JSONObject json = getJsonFromRequest();
        int bossId = json.getInteger("bossId");
        Company condi = new Company();
        condi.setBossid(bossId);
        Company company = companyService.getByCondition(condi);
        return new ResultCode(StatusCode.SUCCESS,company);
    }



}
