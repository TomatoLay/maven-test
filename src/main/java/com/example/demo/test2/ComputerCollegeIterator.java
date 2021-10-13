package com.example.demo.test2;

import java.util.Iterator;

/**
 * 计算机工程学院迭代器
 *
 * @author : Lay(czx)
 * @version :1.1
 * @date : 2021/10/10 10:24
 * @description :
 */
public class ComputerCollegeIterator implements Iterator {

    //这里我们需要知道Department是以怎么样的方式存储

    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判读数组是否还有下一个元素
     *
     * @description: 判读数组是否还有下一个元素
     * @auther: Lay(czx)
     * @data: 2021/10/10 10:27
     * @version: 1.0
     */
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }


}
