package com.xunyu.springbootdemo2.Service.impl;

import com.xunyu.springbootdemo2.Entity.UserDO;
import com.xunyu.springbootdemo2.Repository.UserRepository;
import com.xunyu.springbootdemo2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    /**
     * 用户注册
     *
     * @param userDO
     * @return
     */
    @Override
    public Boolean register(UserDO userDO) {
        UserDO user = userRepository.save(userDO);
        return user == null;
    }
}
