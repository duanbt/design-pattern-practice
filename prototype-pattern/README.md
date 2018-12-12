# Prototype 模式

## 角色
- Prototype(原型)
    负责定义用于复制现有实例生成新实例的方法。
- ConcretePrototype(具体的原型)
    负责实现复制现有实例生成新实例的方法。
- Client(使用者)
    负责使用复制实例的方法生成新的实例，示例中，由Manager类扮演此角色