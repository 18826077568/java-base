package com.hwc.javabase.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @Description 测试集合接口方法
 * @Author 黄文朝
 * @Date 2019/9/24 11:26
 */
public class Collection {
    public static void main(String[] args) {
        retainall();
    }

    public static void retainall(){
        LinkedList linkedList=new LinkedList();
        linkedList.add(1);
        linkedList.addFirst(2);
        linkedList.addLast(3);
//        LinkedList linkedList1= Collections.EMPTY_LIST;
        System.out.println(linkedList);
//        System.out.println(linkedList1);
    }
}
