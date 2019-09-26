package com.hwc.javabase.extend;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description
 * @Author 黄文朝
 * @Date 2019/9/13 11:11
 */
public class arraylist {

    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("00");
        list.add("99");
        String[] arr=new String[10];
        list.toArray(arr);
        System.out.println(list.toString());
        System.out.println(Arrays.toString(arr));
    }
}
