package com.hwc.javabase.mutliThread;

import com.alibaba.fastjson.JSONObject;
import netscape.javascript.JSObject;

import java.util.concurrent.*;

/**
 * @Description
 * @Author 黄文朝
 * @Date 2019/9/22 12:12
 */
public class ThreadState {

    public static void main(String[] args) {

        Runnable runnable2=new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("线程2开始");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2=new Thread(runnable2);

        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                try {
                    Thread thread=Thread.currentThread();
                    System.out.println(JSONObject.toJSONString(thread.getState()));
                    long startTime=System.currentTimeMillis();

                    thread2.join(2000);
                    long endTime=System.currentTimeMillis();
                    long time=endTime-startTime;
                    System.out.println("用时"+time+"线程2结束开始执行线程1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1=new Thread(runnable1);
        thread2.start();
        thread1.start();

        //守护线程，为其他线程提供服务当只有守护线程时会退出
        thread1.setDaemon(true);


    }
}
