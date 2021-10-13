package com.example.demo.test2.college;

import java.util.Iterator;

/**
 * 学院管理接口
 *
 * @author : Lay(czx)
 * @version :1.1
 * @date : 2021/10/10 10:34
 * @description :
 */
public interface College {

    //获取学院的名称
    String getName();

    //新增系数据
    void addDepartment(String name, String desc);

    //返回迭代器
    Iterator createIterator();

}
