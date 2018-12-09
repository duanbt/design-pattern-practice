# Factory Method 模式
- 使用Template Method模式来构建生成实例的工厂，就是Factory Method模式。
- 父类决定实例的生成方式，但并不决定所要生成的具体的类，具体的处理全部交给子类负责。
- 可以将生成实例的框架和实际负责生成实例的类解耦

## 角色
- Product（产品）
    属于框架一方，抽象类，定义了在Factory Method模式中生成的那些实例所持有的接口，
    具体的实现由其子类ConcreteProduct角色决定。
- Creator（创建者）
    属于框架一方，抽象类，负责生成Product角色，但具体的处理由子类ConcreteCreator角色决定。
    它只知道调用生成实例的方法就可以生成实例，至于实际生成的具体类不关心。
    不使用new关键字而使用这种模式生成实例，可以防止父类与其他具体类耦合。
- ConcreteProduct（具体的产品）
    具体加工一方
- ConcreteCreator（具体的创建者）
    具体加工一方，负责生成具体的产品
    
