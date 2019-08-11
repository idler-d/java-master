# 线程池的体系记忆
  
#### 体系的建立

  首先是说下线程池的本质，线程池的最顶层结构是Executor。就说明线程池其实是一个运行器。  
  
  然后最终的实现是ThreadPoolExecutor。就是说无论是调用哪个生成线程池的方法，
  例如：Executors类的四种new-建立的线程池和使用直接new ThreadPoolExecutor，
  创建的都是ThreadPoolExecutor。只是创建时构造函数的参数不一样而已。
  
  这是就建立一个体系。说到线程池，体系就是顶层Executor，也就是Executor模型，
  然后底层实现是ThreadPoolExecutor，所以听说有一些公司是要求线程池是需要直接用
  new ThreadPoolExecutor来创建，不能使用Executors来创建，
  因为使用ThreadPoolExecutor来创建是思路最清晰。也是阅读的信息最全的。
  我只要看到参数就可以一眼看出来创建了一个怎么样的线程池。
  
#### 工作流程

  线程池的工作流程是创建Worker，当代码调用execute(Runnable) 或者 submit(Runnable)
  首先会创建一个Worker，调用addWorker方法，当然中间会有判断是否到上限之类的异常，
  或者是如果队列是否可以offer，然后加入到等待队列之类的操作。
  创建一个Worker时调用构造函数时会创建一个Thread类，就如上一个论题线程一样，
  创建线程都需要Thread类，然后把Runnable，也就是一个Task(任务)放入给这个创建的线程，
  这样一个线程就准备好了。然后把Worker放入workers的运行中的HashSet列表中。
  如果上述流程正常走完就会把workerAdded标志改为true，然后运行Thread的start方法启动线程。
  
