package com.example.demo.test2;

import java.util.Iterator;
import java.util.List;

/**
 * @author : Lay(czx)
 * @version :1.1
 * @date : 2021/10/10 10:29
 * @description :
 */
public class InfoCollegeIterator implements Iterator {

    //信息工程学院是以List方式存放数据
    List<Department> departmentList;
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断List中是否还有下一个元素
    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }

    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
