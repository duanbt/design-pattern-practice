# Decorator 模式
- 不断地为对象添加装饰的设计模式
- 装饰类和被装饰类具有一致性，它们具有相同的方法
- 在不修改被装饰的类的情况下，可增加许多新功能

## 角色
- Component
    定义了被装饰者的接口。增加功能时的核心。
- ConcreteComponent
    具体的被装饰者
- Decorator
    装饰者抽象类。具有和被装饰者相同的接口，内部保存了被装饰对象
- ConcreteDecorator
    具体的装饰者。装饰者中的与被装饰者共同的方法会调用被装饰者的同名方法，也就是“委托”