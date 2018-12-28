# Abstract Factory 模式
“抽象工厂”将“抽象零件”组装为“抽象产品”

## 角色
- AbstractProduct (抽象产品)
    AbstractProduct角色负责定义AbstractFactory角色所生成的抽象零件和产品的接口（API）。
    在示例程序中，由Link类、Tray类和Page类扮演此角色。
- AbstractFactory（抽象工厂）
    AbstractFactory角色负责定义用于生成抽象产品的接口（API）。
    在示例程序中，由Factory类扮演此类角色
- Client（委托者）
    Client角色仅会调用AbstractFactory角色和AbstractProduct角色的接口（API）来进行工作，
    对于具体的零件、产品、和工厂一无所知。在示例中，由Main类扮演此角色
- ConcreteProduct（具体产品）
    ConcreteProduct角色负责实现AbstractProduct角色的接口（API）。
    示例程序中，ListLink类、ListTray类、ListPage和TableLink类、TableTray类、TablePage类。
- ConcreteFactory（具体工厂）
    ConcreteProduct角色负责实现AbstractFactory角色的接口（API）。
    示例程序中，ListFactory类、TableFactory类   