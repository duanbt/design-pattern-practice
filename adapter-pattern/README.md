# Adapter模式——加个“适配器”以便于复用
## 简介
- 也称为Wrapper模式，现有的程序无法直接使用，
需要做适当的变换（包装）之后才能使用，
这种填补“现有程序”与“所需程序”之间差异的设计模式就是Adapter模式。
- 替我们把“现有程序”包装起来，使其能用于其他用途的东西称为Adapter。

- Adapter模式有两种：
    1. 类适配器模式（使用继承的适配器）
    2. 对象适配器模式（使用委托的适配器）
## 角色
- Target（对象）
    定义所需的方法
- Client（使用者）
    使用Target
- Adaptee（被适配者）
    被适配的类，有既定的方法
- Adapter（适配器）
    适配器，调用Adaptee中的相关方法实现Target的方法，满足Target的需求；
    类适配器模式Adapter通过继承使用Adaptee；
    对象适配器模式Adapter通过持有Adaptee的实例使用Adaptee角色