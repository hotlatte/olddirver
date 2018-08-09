package com.kyle.olddriver.mapper;

import com.kyle.olddriver.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kyle.LJ
 * @Title: TeacherDao
 * @ProjectName olddriver
 * @Description: TODO
 * @date 2018/8/3下午4:09
 */

public interface TeacherDao extends JpaRepository<Teacher, Integer> {


}
