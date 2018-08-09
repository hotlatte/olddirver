package com.kyle.olddriver.service.impl;

import com.kyle.olddriver.entity.Teacher;
import com.kyle.olddriver.mapper.TeacherDao;
import com.kyle.olddriver.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kyle.LJ
 * @Title: teahcerServiceImpl
 * @ProjectName olddriver
 * @Description: TODO
 * @date 2018/8/6上午10:09
 */
@Service
public class TeahcerServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao thDao;

    /**
    　　* @Description: 添加数据
    　　* @throws
    　　* @author Kyle.LJ
    　　* @date 2018/8/6 下午2:22
    　　*/

    @Override
    public boolean addTeacher(Teacher teacher) {
        boolean flag=false;
        try{
            thDao.save(teacher);
            flag=true;
        }catch(Exception e){
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }
    /**
     　　* @Description: 更新修改数据
     　　* @throws
     　　* @author Kyle.LJ
     　　* @date 2018/8/6 下午2:22
     　　*/
    @Override
    public boolean updateTeacher(Teacher teacher) {
        boolean flag=false;
        try{
            thDao.save(teacher);
            flag=true;
        }catch(Exception e){
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }
    /**
     　　* @Description: 删除数据
     　　* @throws
     　　* @author Kyle.LJ
     　　* @date 2018/8/6 下午2:22
     　　*/
    @Override
    public boolean deleteTeacher(Integer id) {
        boolean flag=false;
        try{
            thDao.delete(id);
            flag=true;
        }catch(Exception e){
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }
    /**
     　　* @Description: 根据ID查询
     　　* @throws
     　　* @author Kyle.LJ
     　　* @date 2018/8/6 下午2:22
     　　*/
    @Override
    public Teacher findTeacherById(Integer id) {
        return thDao.findOne(id);
    }

    /**
     　　* @Description: 查询所有数据
     　　* @throws
     　　* @author Kyle.LJ
     　　* @date 2018/8/6 下午2:22
     　　*/
    @Override
    public List<Teacher> findAll() {
        return thDao.findAll();
    }
}
