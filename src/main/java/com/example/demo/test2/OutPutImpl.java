package com.example.demo.test2;

import com.example.demo.test2.college.College;

import java.util.Iterator;
import java.util.List;

/**
 * 输出数据
 *
 * @author : Lay(czx)
 * @version :1.1
 * @date : 2021/10/10 10:43
 * @description :
 */
public class OutPutImpl {

    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //打印学院信息
    public void printCollege() {
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println(" ==== " + college.getName());
            printDepartment(college.createIterator());
        }
    }

    //输出系
    private void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName() + " ==== " + department.getDesc());
        }
    }

}
