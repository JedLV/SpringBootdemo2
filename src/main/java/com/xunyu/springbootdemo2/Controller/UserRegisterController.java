package com.xunyu.springbootdemo2.Controller;


import com.xunyu.springbootdemo2.Entity.UserDO;
import com.xunyu.springbootdemo2.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户通用接口
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserRegisterController {

    @Autowired   //将repository包注入到Service里面
    UserService userService;

    /**
     * 用户注册
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public void register(@RequestBody UserDO userDO){
        Boolean register = userService.register(userDO);
        log.info("用户注册的结果为：{}",register);
    }


    /**
     * “//TODO “是表示这个地方还有一些事情要做，有一些代码要写的意思。
     * 因为用了这个注释，TODO是加粗的，在代码中很明显，所以作为程序员在编写代码时给自己留这个备忘。
     * 出现这个标签是因为用了代码自动生成工具，这个标签提示在此处添加自己的代码。
     */
    // TODO 用户登录

    // TODO 用户查询


}

