package com.example.demo.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : Lay(czx)
 * @version :1.1
 * @date : 2021/10/10 09:47
 * @description :
 */
public class IteratorTest {

    /**
     * Java自带的遍历接口
     *
     * @param args
     * @description: Java自带的遍历接口
     * @auther: Lay(czx)
     * @data: 2021/10/10 09:47
     * @version: 1.0
     */
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lists.add(i);
        }
        Iterator<Integer> iterator = lists.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            //System.out.println(next);
        }
        lamTest();
    }


    public static void lamTest() {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lists.add(i);
        }
        Iterator<Integer> iterator = lists.iterator();
        iterator.forEachRemaining((next) -> {
            System.out.println(next += 10);
        });
    }


}
