# Observer模式

当观察对象的状态发生变化时，会通知给观察者，
适用于根据对象状态进行相应处理的场景。

## 角色
- Subject（观察对象）
    定义了注册观察者和删除观察者的方法，还声明了“获取现在状态”的方法。
- ConcreteSubject（具体的观察对象）
- Observer（观察者）
    Observer角色负责接收来自Subject角色状态变化的通知。
    为此，它声明了update方法
- ConcreteObserver（具体的观察者）
    update方法被调用后，会去获取想要观察的对象的最新状态。