package com.xunyu.springbootdemo2.Entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户实体
 */
@Data
@Entity
@Table(name = "demo_user")
public class UserDO {

    @Id
    private Integer id;
    private String name;
    private String phone;
    private String password;
    private String verification;
}
