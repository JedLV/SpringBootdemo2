package com.xunyu.springbootdemo2.Service;

import com.xunyu.springbootdemo2.Entity.UserDO;

public interface UserService {

    /**
     * 用户注册
     * @param userDO
     * @return
     */
    Boolean register(UserDO userDO);
}
