## 装饰者模式

### 定义：

> 
装饰者模式(decorator pattern) : 动态地将功能附加在对象上，想要扩展功能，装饰者提供有别于继承的另一种选择。

> 
实际上，在JDK中内置了观察者模式。
`java.io` 包内就存在大量的装饰者模式，在这些包中，有许多类都是装饰者。
`java.io.FileInputStream` 是被装饰的“组件”；    
`java.io.BufferedInputStream` 是一个具体的装饰者，它加入两种行为：利用缓冲输入来改进性能，用一个`readLine()` 方法来增强接口；    
`java.io.LineNumberInputStream` 也是一个具体的装饰者，它加上了计算行数的能力。

### 设计原则:

- 开闭原则－类应该对扩展开放，对修改关闭

### 参考地址：

- [Head First 设计模式读书笔记(3)-装饰者模式](http://www.cnblogs.com/lzhp/p/3360346.html)