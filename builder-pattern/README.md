# Builder 模式
    组装具有复杂结构的实例的Builder模式
## 角色
- Builder（建造者）
    定义用于生成实例的API
- ConcreteBuilder（具体的建造者）
    负责实现生成实例的API，此外，还定义了获取最终生成结果的方法
- Director（监工）
    Director负责使用Builder角色的API来生成实例，并不依赖于ConcreteBuilder
