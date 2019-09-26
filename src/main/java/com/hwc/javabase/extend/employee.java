package com.hwc.javabase.extend;

/**
 * @Description 父类
 * @Author 黄文朝
 * @Date 2019/9/13 10:37
 */
public class employee {
    public String getSalary() {
        return salary;
    }

    private void setSalary(String salary) {
        this.salary = salary;
    }

    protected String name;
    private String age;

    public employee(String name, String age, String salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public employee(){}

    private String salary;
}
