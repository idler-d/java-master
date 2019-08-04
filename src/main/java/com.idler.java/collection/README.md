# java集合的结构记忆  
  在做java集合详细学习之前首先需要对java集合整体结构有个整体的印象。
  为了在再次回忆java集合时触发联想回忆，建立一套联想记忆的过程。  
  首先java集合的体系属于一套数据结构，顶层接口可以分成两部分,个人理解是：  
  
  <font color=red>Collection(容器)</font>和<font color=red>Map(键值)</font>  
  
  Collection属于容器相关的数据结构，容器相关的数据结构收容只有值。  
  Map数据键值相关的数据结构，键值相关的数据结构收容是包含键和值两部分。  
  
  然后对两部分接口展开谈：
  
##### Collection相关
  java集合体系对于容器的实现有3个大的方向：Queue（队列）、List（可重复列表）、Set（不可重复列表）  
  ```
  Queue：  
    PriorityQueue  
  List:
    ArrayList、LinkedList、Vector、Stack
  Set:
    EnumSet、HashSet、TreeSet、LinkedHashSet
  ```
  
##### Map相关
  Map实现有HashMap、LinkedHashMap、TreeMap、EnumMap