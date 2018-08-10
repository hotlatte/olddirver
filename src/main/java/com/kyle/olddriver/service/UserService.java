package com.kyle.olddriver.service;

import com.kyle.olddriver.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Kyle.LJ
 * @Title: UserService
 * @ProjectName olddriver
 * @Description: TODO
 * @date 2018/8/109:50 AM
 */
public interface UserService {
   /**
    *
    * 是否存在该用户
    */
    boolean verifyUser(User user);




    }
