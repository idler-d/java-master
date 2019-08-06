package com.idler.java.thread.callable;

import com.idler.java.thread.Times;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThread implements Callable<String> {
  @Override
  public String call() throws Exception {
    System.out.println("进入Call方法，开始休眠，休眠时间为：" + Times.format(System.currentTimeMillis()));
    Thread.sleep(5000);
    System.out.println("Call方法，休眠结束，休眠结束时间为：" + Times.format(System.currentTimeMillis()));
    return "今天停电";
  }

  public static void main(String[] args) throws Exception {
    ExecutorService es = Executors.newSingleThreadExecutor();
    Callable<String> call = new CallableThread();
    Future<String> fu = es.submit(call);
    System.out.println("before shutdown");
    es.shutdown();
    System.out.println("after shutdown");
    Thread.sleep(10000);
    System.out.println("主线程休眠5秒，当前时间" + Times.format(System.currentTimeMillis()));
    String str = fu.get();
    System.out.println("Future已拿到数据，str=" + str + ";当前时间为：" + Times.format(System.currentTimeMillis()));
  }
}