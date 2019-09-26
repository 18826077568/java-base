package com.hwc.javabase.extend;

/**
 * @Description 子类
 * @Author 黄文朝
 * @Date 2019/9/13 10:39
 */
public class Manager extends employee {
    public Manager(String name, String age, String salary) {
        super(name, age, salary);
    }

    public Manager(){
        super();
    }

    //子类无法访问父类的私有域和私有方法
    @Override
    public String getSalary() {
        return super.getSalary();
    }


}
