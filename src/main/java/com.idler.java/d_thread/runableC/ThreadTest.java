package com.idler.java.d_thread.runableC;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Runnable myRunnable = new MyRunnable(); // 创建一个Runnable实现类的对象
                FutureTask<String> future = new FutureTask<>(myRunnable, "操作成功");
                Thread thread1 = new Thread(myRunnable); // 将myRunnable作为Thread target创建新的线程
                Thread thread2 = new Thread(myRunnable);
                Thread thread3 = new Thread(future);
                thread1.start(); // 调用start()方法使得线程进入就绪状态
                thread2.start();
                thread3.start();
                System.out.println(future.get());
            }
        }
    }
}