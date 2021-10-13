package com.example.demo.test2;

import com.example.demo.test2.college.College;
import com.example.demo.test2.college.ComputerCollege;
import com.example.demo.test2.college.InfoCollege;

import java.util.ArrayList;


public class Client {

    public static void main(String[] args) {
        //创建学院
        ArrayList<College> colleges = new ArrayList<>();
        colleges.add(new ComputerCollege());
        colleges.add(new InfoCollege());
        //输出打印
        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();

    }


}
