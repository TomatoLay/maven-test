package com.example.demo.test2.college;

import com.example.demo.test2.ComputerCollegeIterator;
import com.example.demo.test2.Department;

import java.util.Iterator;

/**
 * 计算机学院
 *
 * @author : Lay(czx)
 * @version :1.1
 * @date : 2021/10/10 10:36
 * @description :
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;//保存当前数组的对象个数

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java专业", "Java专业");
        addDepartment("PHP专业", "PHP专业");
        addDepartment("大数据专业", "大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    //构建迭代器
    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
