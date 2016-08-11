# java设计模式－观察者模式

---

## 观察者模式

### 定义：

> 观察者模式(observer pattern) : 定义了对象之间的一对多依赖，当一个被依赖者改变状态时，他所有的依赖者都会收到通知并自动更新。

> 
实际上，在JDK中内置了观察者模式。
 1. 观察者需要实现接口`java.util.Observer` 。然后调用任何Observable对 象的addObserver()方法。不想再当观察者时,调用`deleteObserver()`方法就可以了。
 2. 主题（即可观察者）需要扩展`java.util.Observable`。 
然后,需要两个步骤: 
    1). 先调用`setChanged()`方法,标记状态已经改变的事实。
    2). 然后调用两种`notifyObservers()`方法中的一个: `notifyObservers()` 或 `notifyObservers(Object arg)`。
 3. 观察者实现了更新的方法,但是方法的签名不太一样:
`update(Observable o, Object arg)`，其中：主题本身作为第一个变量，以便让观察者知道是哪个主题通知的；而第二个参数正是传入notifyObservers()的数据对象。
如果想将数据“推”给观察者，可以使用`notifyObservers(arg)`方法；如果观察者想从可观察者中“拉”数据，可以通过getter从可观察者那里获取数据。 
   
> 
⚠️         
 - 使用`java.util.Observable` 时，不要依赖于观察者被通知的次序
 - `java.util.Observable` 是一个类，而不是一个接口。毕竟Java不支持多继承，所以这限制了它的复用能力。我们也没办法建立自己的实现。这个设计违反了**多用组合，少用继承**的设计原则。

> 

在JDK中，还有其他的使用观察者模式的例子，例如：JavaBeans里的`java.beans.PropertyChangeListener`接口，Swing API里的`javax.swing.JButton`等。


### 设计原则:

- 为交互对象之间的松耦合设计而努力。

### 参考地址：

- [Head First 设计模式读书笔记(2)-观察者模式](http://www.cnblogs.com/lzhp/p/3353647.html)




