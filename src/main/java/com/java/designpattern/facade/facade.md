# java设计模式－外观模式

---

## 外观模式

### 定义：

> 适配器模式(adapter pattern) :提供了一个统一的接口，用来访问子系统中的一群接口。    
换句话说，就是定义了一个高层接口，让子系统更容易使用。



### 设计原则:

- 最少知识原则(Least Knowledge)：减少对象之间的交互，只留下几个“密友”。

> 这个原则希望在设计程序时，不要让太多的类耦合在一起，免得修改系统中的一部分，会影响其他部分。    
究竟怎样设计程序才能符合这一原则呢？就任何对象而言，在该对象的方法类，我们只应该调用属于以下范围的方法：    
 - 该对象本身
 - 被当作方法的参数而传递进来的对象
 - 此方法所创建或实例化的任何对象
 - 对象的任何组件
  

### 参考地址：

- [适配器模式和外观模式（head first设计模式——6）](http://www.cnblogs.com/lzhp/p/3400928.html)




