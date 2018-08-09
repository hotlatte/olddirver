package com.kyle.olddriver.controller;

import com.kyle.olddriver.entity.Teacher;
import com.kyle.olddriver.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Kyle.LJ
 * @Title: TeacherController
 * @ProjectName olddriver
 * @Description: TODO
 * @date 2018/8/2下午4:21
 */
@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    //首页跳转
    @RequestMapping("/")
    public String index() {
        return "redirect:/home";
    }


    //实现查询数据库表，跳转到列表html页
    @RequestMapping("/teacherList")
    public String list(Model model) {
        System.out.println("查询所有");
        List<Teacher> teachers= teacherService.findAll();
        model.addAttribute("teachers", teachers);
        return "/teacherList";
    }


    //跳转到添加页面
    @RequestMapping("/toAddTeacher")
    public String toAddTeacher() {
        return "teacherAdd";
    }


    //实现添加功能，并返回刷新到列表页
    @RequestMapping("/add")
    public String add(Teacher teacher) {
        teacher.setCountry("Japan");
        teacherService.addTeacher(teacher);
        return "redirect:/teacherList";
    }

    //删除数据
    @RequestMapping("/toDelete")
    public String delete(Integer id) {
        teacherService.deleteTeacher(id);
        return "redirect:/teacherList";
    }

    //跳转到编辑页 传递了tercher对象过去
    @RequestMapping("/toEdit")
    public String toEdit(Model model,Integer id) {
        Teacher teacher=teacherService.findTeacherById(id);
        model.addAttribute("teacher", teacher);
        return "teacherEdit";
    }


    //实现了修改功能并跳转回列表页
    @RequestMapping("/edit")
    public String edit(Teacher teacher) {
        teacherService.updateTeacher(teacher);
        return "redirect:/teacherList";
    }
}
