package com.jlkj.web.service;

import cc.s2m.web.utils.webUtils.service.BaseService;
import com.jlkj.web.pojo.User;


public interface IUser extends BaseService<User, Integer> {
    public User selectByUserName(String userName);

}