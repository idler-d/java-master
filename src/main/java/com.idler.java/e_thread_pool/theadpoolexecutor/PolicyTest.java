package com.idler.java.e_thread_pool.theadpoolexecutor;

import java.util.concurrent.*;

public class PolicyTest {
  public static void main(String[] args) {
    LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>(3);
    RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();

    ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 5, 60, TimeUnit.SECONDS, queue, handler);
    ExecutorService threadPool1 = new ThreadPoolExecutor(2, 5, 60, TimeUnit.SECONDS, queue, handler);
    for (int i = 0; i < 9; i++) {
      threadPool.execute(new Thread(new ThreadPoolTest(), "Thread".concat(i + "")));
      System.out.println("线程池中活跃的线程数： " + threadPool.getPoolSize());
      if (queue.size() > 0) {
        System.out.println("----------------队列中阻塞的线程数" + queue.size());
      }
    }
    threadPool.shutdown();
  }
}
