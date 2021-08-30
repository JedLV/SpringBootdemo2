package com.xunyu.springbootdemo2.Repository;

import com.xunyu.springbootdemo2.Entity.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDO,Integer> {

}
