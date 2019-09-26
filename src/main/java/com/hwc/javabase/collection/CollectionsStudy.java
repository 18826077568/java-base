package com.hwc.javabase.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description
 * @Author 黄文朝
 * @Date 2019/9/1 19:36
 * @Version 1.0
 */
public class CollectionsStudy {
    private String hh;
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("bb");
        list.add("cc");
        list.add("aa");
        System.out.println(java.util.Collections.min(list));
        System.out.println(Arrays.asList(1,2,3,"234ssss"));
    }


}
