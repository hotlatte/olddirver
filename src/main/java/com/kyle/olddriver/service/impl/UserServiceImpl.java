package com.kyle.olddriver.service.impl;

import com.kyle.olddriver.entity.User;
import com.kyle.olddriver.mapper.UserDao;
import com.kyle.olddriver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kyle.LJ
 * @Title: UserServiceImpl
 * @ProjectName olddriver
 * @Description: TODO
 * @date 2018/8/109:50 AM
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public boolean verifyUser(User user) {
        return false;
    }
}
