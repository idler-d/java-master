package com.idler.java.e_thread_pool.theadpoolexecutor;

import java.util.concurrent.*;

public class ThreadPoolTestMain {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>(5);
    ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, queue);
    for (int i = 0; i < 16; i++) {
      try {
//        threadPool.execute(new Thread(new ThreadPoolTest(), "Thread".concat(i + "")));
//        Future future = threadPool.submit(new Thread(new ThreadPoolTest(), "Thread".concat(i + "")));
//        System.out.println(future.get());
        threadPool.execute(new ThreadPoolTest());
      } catch (RejectedExecutionException e) {
        System.out.println("error" + i);
      }

      System.out.println("线程池中活跃的线程数： " + threadPool.getPoolSize());
      if (queue.size() > 0) {
        System.out.println("----------------队列中阻塞的线程数" + queue.size());
      }
    }
    threadPool.shutdown();
  }
}
