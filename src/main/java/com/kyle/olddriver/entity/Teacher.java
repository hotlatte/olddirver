package com.kyle.olddriver.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kyle.LJ
 * @Title: Teacher
 * @ProjectName olddriver
 * @Description: TODO
 * @date 2018/8/2下午4:07
 */

@Entity
@Table(name="t_teahcer")
public class Teacher {

    @Id
    @GeneratedValue
    private Integer id;

    private  String name;

    private  Integer age;

    private  String cupSize;

    private  String country;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

