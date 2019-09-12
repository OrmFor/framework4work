package com.jlkj.web.service.impl;

import cc.s2m.web.utils.webUtils.service.BaseServiceImpl;
import com.jlkj.web.dao.UserMapper;
import com.jlkj.web.pojo.User;
import com.jlkj.web.service.IUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserImpl extends BaseServiceImpl<User, UserMapper, Integer> implements IUser {
    @Autowired
    private UserMapper userMapper;

    protected UserMapper getDao() {
        return userMapper;
    }



    @Override
    public User selectByUserName(String userName) {
        User user = new User();
        user.setUserName(userName);
        return this.getByCondition(user);
    }



}