package com.kyle.olddriver.mapper;

import com.kyle.olddriver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Kyle.LJ
 * @Title: UserDao
 * @ProjectName olddriver
 * @Description: TODO
 * @date 2018/8/109:49 AM
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    public User findByUsernameAndPassword(String username, String password);

    public List<User> findByUsername(String username);


}
