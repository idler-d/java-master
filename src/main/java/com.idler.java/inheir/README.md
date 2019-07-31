#多态相关问题

  a. 重写函数  
  ```
  个人总结定义：一个发生在子类和父类（或者接口）继承（实现）下的多态，在子类编写与父类一样的函数是发生的情况。
  ```
  ```
  说到重写函数在《深入java虚拟机》里是属于函数的动态分配的内容。在运行时会调用invokevirtual指令。  
  指令会  
    找到对象的实际类型，  
    按照继承从下往上依次对类型进行描述符和简单名称相符的方法查找，  
    如果找到则进行访问权限的校验，  
      如果权限通过则返回方法的直接引用，  
      如果不通过则返回java.lang.IllegalAccessError异常,  
    如果找不到则抛出java.lang.AbstractMethodError异常。  
  ```
  
  问题的提出：  
  1. 在开发过程中我们为什么需要使用重写？
  2. 在开发过程中我们是否有其他的方案去替代重写（让代码更直观）？
  
  b. 重载函数
  
  ```
  个人总结定义: 一个发生在一个类中同名函数而产生的多态。
  ```
  ```
  说到重写函数在《深入java虚拟机》里是属于函数的静态分配的内容。
  类型往上提升：byte->short->char->int->long->float->double->自动装箱->继承接口->可变数组
  ```
    
  问题的提出：  
  1. 在开发过程中我们为什么需要使用重载？

#对象变量相关问题
  a. 对象变量的作用域  
  一般开发定义成员变量的作用域分别有：public、protected、（default）friendly、private
  ```text
  |-------------------------------------------------------|
  | 作用域与可见 | 当前类 | 同一package | 子类 | 其他package  |   
  |  public     |   √   |      √      |  √  |   √         |
  |  protected  |   √   |      √      |  √  |   ×         | 
  |  friendly   |   √   |      √      |  ×  |   ×         |
  |  private    |   √   |      ×      |  ×  |   ×         |
  |-------------------------------------------------------|
  ```
  
  b. 对象变量子父类重名  
  关于这个现在有很多相关的例子，就是子类和父类拥有相同的变量名，
  当使用父类的引用来直接调用变量时输出的是父类变量的值。  
  java文档给出的说明是：  
  ```
  Within a class, a field that has the same name as a field in the superclass hides the superclass’s field, 
  even if their types are different. Within the subclass, 
  the field in the superclass cannot be referenced by its simple name. 
  Instead, the field must be accessed through super. 
  Generally speaking, we don’t recommend hiding fields as it makes code difficult to read.
  ```
  简单来说就是如果子类存在与父类同名的变量，即使是类型不同，父类的变量都会被<font color="red">隐藏</font>。  
  父类变量不能简单的使用引用来访问。必须通过父类来访问这个变量。一般来说，<font color="red">不推荐</font>隐藏成员变量,  
  这会使代码变得难以阅读。
  
  总结：  
  1. 子类和父类有同名的变量，本质跟方法不一样，子类变量不会去覆盖父类变量，只是隐藏。
  2. 如果真的需要这么做如何才能获取父类的变量的值，是通过父类引用来访问变量。
  3. 一般不推荐去做隐藏成员变量的代码开发，因为会导致代码变得难以阅读。
  