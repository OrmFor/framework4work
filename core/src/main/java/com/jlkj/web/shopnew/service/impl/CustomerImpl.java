package com.jlkj.web.shopnew.service.impl;

import com.jlkj.web.shopnew.dao.CustomerMapper;
import com.jlkj.web.shopnew.pojo.Customer;
import com.jlkj.web.shopnew.service.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cc.s2m.web.utils.webUtils.service.BaseServiceImpl;

@Service
public class CustomerImpl extends BaseServiceImpl<Customer, CustomerMapper, Integer> implements ICustomer {
    @Autowired
    private CustomerMapper customerMapper;

    protected CustomerMapper getDao() {
        return customerMapper;
    }
}