package com.kyle.olddriver.service;

import com.kyle.olddriver.entity.User;
import com.kyle.olddriver.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kyle.LJ
 * @Title: UserInfoService
 * @ProjectName olddriver
 * @Description: TODO
 * @date 2018/8/1010:35 AM
 */

@Service
public class UserInfoService {
    @Autowired
    UserDao userDao;

    public User FindNameAndPsw(String username, String password) {
        return userDao.findByUsernameAndPassword(username, password);
    }
    public void save(User user) {
        userDao.save(user);
    }
    public List<User> findByName(String username) {
        return userDao.findByUsername(username);
    }


}
