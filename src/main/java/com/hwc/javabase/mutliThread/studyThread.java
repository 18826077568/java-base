package com.hwc.javabase.mutliThread;

/**
 * @Description
 * @Author 黄文朝
 * @Date 2019/9/22 11:34
 */
public class studyThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start 主线程");
        long starttime=System.currentTimeMillis();
        Thread newThread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程");
                try {

//                        Thread.sleep(1000);
                        Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().isInterrupted());
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().isInterrupted());
                    Thread.sleep(1000);
                        if (!Thread.currentThread().isInterrupted()){
                            System.out.println("非阻塞");
                            System.out.println("线程1");
                        }


                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        newThread.start();
//        while (true){
//                    Thread.sleep(2000);
//            System.out.println("主线程");
//
//        }



    }

}
