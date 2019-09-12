package com.jlkj.web.shopnew.service.impl;

import com.jlkj.web.shopnew.dao.CompanyMapper;
import com.jlkj.web.shopnew.pojo.Company;
import com.jlkj.web.shopnew.service.ICompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cc.s2m.web.utils.webUtils.service.BaseServiceImpl;

@Service
public class CompanyImpl extends BaseServiceImpl<Company, CompanyMapper, Integer> implements ICompany {
    @Autowired
    private CompanyMapper companyMapper;

    protected CompanyMapper getDao() {
        return companyMapper;
    }
}