# Throwable体系的记忆

  java的Throwable体系分为两个大部分：Error和Exception
  
##### Error
  Error数据严重程序错误，如果程序抛出了Error就说明程序运行不下去了，需要修改代码来修复程序。
  在这种情况下程序一般就会终止运行。
  
##### Exception
  Exception分为unchecked和checked两种类型或者说是RuntimeException和RuntimeException以外的Exception。  
  
  ```
  unchecked类型的Exception一般是继承于RuntimeException的Exception类。
  如经常遇到的NullPointerException或者说是自己编写的业务异常，一般都是编写继承与RuntimeException的。
  在throw这些异常时java函数是不需要在函数声明中声明throws异常的，
  所以会使调用函数的调用者不需要编写try-catch或者函数声明throws异常，
  只在你需要对抛出的异常做处理时做try-catch操作。
  ```
  
  ```
  checked类型的Exception一般属于编译时异常。
  如经常遇到的IOException，一般是除了继承于RuntimeException以外的Exception类。
  对于这些异常在你使用eclipse/idea的IDE做开发时，一般IDE都会做出红色的错误警告。
  这时候你需要需要做throws或者try/catch操作，这样IDE才会使程序可以通过编译。
  ```