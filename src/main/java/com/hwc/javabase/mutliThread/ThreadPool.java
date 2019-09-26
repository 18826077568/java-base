package com.hwc.javabase.mutliThread;

import java.util.concurrent.*;

/**
 * @Description
 * @Author 黄文朝
 * @Date 2019/9/22 18:04
 */
public class ThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        future();
//        executor();
        testPoolQueue();
    }
    static final Callable<Integer> callable=new Callable<Integer>() {
        private Integer count=0;
        @Override
        public Integer call() throws Exception {
            Thread.sleep(1000);
            for (int i=0;i<10000;i++){
                count+=i;
            }
            return count;
        }
    };
    public static void future() throws ExecutionException, InterruptedException {

        FutureTask<Integer> integerFuture=new FutureTask<>(callable);
        Thread thread=new Thread(integerFuture);
        thread.start();
        System.out.println(integerFuture.get());
    }

    public static void executor() throws ExecutionException, InterruptedException {
        ExecutorService executorService=Executors.newFixedThreadPool(10);
        FutureTask<Integer> futureTask= (FutureTask<Integer>) executorService.submit(callable);
        System.out.println(futureTask.get());
    }

    public static void testPoolQueue(){
            ThreadPoolExecutor pool=new ThreadPoolExecutor(5,10,200, TimeUnit.MILLISECONDS,  new ArrayBlockingQueue<Runnable>(5));
            for(int i=0;i<15;i++) {
                Task task=new Task(i);
                pool.execute(task);
                System.out.println("线程池中线程数目："+pool.getPoolSize()+"，队列中等待执行的任务数目："+
                        pool.getQueue().size()+"，已执行玩别的任务数目："+pool.getCompletedTaskCount());
                //测试阻塞队列的作用
            }
            pool.shutdown();
    }

    static class Task implements Runnable{
        private int num;
        public Task(int num) {
            this.num=num;
        }
        @Override
        public void run() {
            System.out.println("正在执行任务  "+num);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程"+num+"执行完毕");
        }
    }



}
