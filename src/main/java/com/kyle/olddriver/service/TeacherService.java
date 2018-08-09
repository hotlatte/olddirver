package com.kyle.olddriver.service;

import com.kyle.olddriver.entity.Teacher;

import java.util.List;

/**
 * @author Kyle.LJ
 * @Title: TeacherService
 * @ProjectName olddriver
 * @Description: TODO
 * @date 2018/8/6上午10:14
 */
public interface TeacherService {
        /**
         * 新增老师
         */
        boolean addTeacher(Teacher teacher);

        /**
         * 修改用户
         * @param
         * @return
         */
        boolean updateTeacher(Teacher teacher);


        /**
         * 删除用户
         * @param
         * @return
         */
        boolean deleteTeacher(Integer id);

        /**
         * 根据用户名字查询用户信息
         * @param
         */
        Teacher findTeacherById(Integer id);

        /**
         * 查询所有
         * @return
         */
        List<Teacher> findAll();
}
