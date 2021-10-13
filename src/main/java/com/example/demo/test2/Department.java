package com.example.demo.test2;

/**
 * @author : Lay(czx)
 * @version :1.1
 * @date : 2021/10/10 10:23
 * @description :
 */

public class Department {
    private String name;
    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
