package com.example.demo.test2.college;

import com.example.demo.test2.Department;
import com.example.demo.test2.InfoCollegeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 信息工程学院
 *
 * @author : Lay(czx)
 * @version :1.1
 * @date : 2021/10/10 10:41
 * @description :信息工程学院
 */
public class InfoCollege implements College {

    //信息工程学院是以集合方式存放数据
    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("信息安全专业", "信息安全专业");
        addDepartment("网络安全专业", "网络安全专业");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
