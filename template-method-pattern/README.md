# Template Method 模式
在父类定义处理流程的大体框架，在子类中实现具体处理的模式
## 角色
- AbstractClass（抽象类）
    实现模板方法，声明在模板方法中所使用到的抽象方法；
    这些抽象方法由子类ConcreteClass角色负责实现。
- ConcreteClass（具体类）
    负责实现AbstractClass角色中定义的抽象方法；
    这里实现的方法会在AbstractClass角色的模板方法中被调用