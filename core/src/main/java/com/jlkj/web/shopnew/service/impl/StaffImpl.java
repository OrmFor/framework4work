package com.jlkj.web.shopnew.service.impl;

import com.jlkj.web.shopnew.dao.StaffMapper;
import com.jlkj.web.shopnew.pojo.Staff;
import com.jlkj.web.shopnew.service.IStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cc.s2m.web.utils.webUtils.service.BaseServiceImpl;

@Service
public class StaffImpl extends BaseServiceImpl<Staff, StaffMapper, Integer> implements IStaff {
    @Autowired
    private StaffMapper staffMapper;

    protected StaffMapper getDao() {
        return staffMapper;
    }
}