# Mediator 模式
组员向仲裁者报告，仲裁者向组员下达指示

## 角色
- Mediator（仲裁者、中介者）
    Mediator角色负责定义与Colleague角色进行通信和做出决定的接口。
- ConcreteMediator（具体的仲裁者、中介者）
    ConcreteMediator角色负责实现Mediator角色的接口，负责实际做出决定。
- Colleague（同事、组员）
    负责定义与Mediator角色进行通信的接口（API）
- ConcreteColleague（具体的组员）
    负责实现Colleague角色的接口