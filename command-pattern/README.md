# Command 模式
   一个类在进行工作时会调用自己或是其他类的方法，虽然调用结果会反映在对象的状态中，但并不会留下工作的历史记录。
   用类来表示“请进行这项工作”的“命令”就会方便很多，每项工作用表示命令的类的实例表示。
   要想管理工作的历史记录，只需管理这些实例的集合即可，而且还可以随时执行过去的命令，或是将多个过去的命令整合为一个新命令来执行。

## 角色
- Command(命令)
    定义命令的接口。示例中，由Command接口扮演此角色。
- ConcreteCommand(具体的命令)
    负责实现Command角色定义的接口。示例中，MacroCommand和DrawCommand扮演此角色。
- Receiver(接收者)
    负责接收命令。示例中，DrawCanvas接收DrawCommand的命令。
- Invoker(发动者)
    开始执行命令的角色，它会调用在Command角色中定义的接口。Main类和DrawCanvas类扮演此角色。
- Client(请求者)
    负责生成ConcreteCommand角色并分配Receiver角色。示例中，Main类扮演此角色。响应鼠标拖拽事件时，它生成了DrawCommand实例，
    并将扮演Receiver角色的DrawCanvas类的实例传递给了DrawCommand类的构造函数。