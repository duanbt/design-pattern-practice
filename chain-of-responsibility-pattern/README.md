# Chain of Responsibility 模式
   当外部请求程序进行某个处理，但程序暂时无法直接决定由哪个对象负责处理时，
就需要推卸责任；在这种情况下，我们可以考虑将多个对象组成一条职责链，
然后按照它们在职责链上的顺序一个一个找出到底应该谁来负责处理。

## 角色
- Handler(处理者)
    Handler角色定义了处理请求的接口（API）。Handler角色知道“下一个处理者”是谁，
    如果自己无法处理请求，它会将请求转给“下一个处理者”。示例中，Support类扮演此角色，
    负责请求的是support方法。
- ConcreteHandler(具体的处理者)
    ConcreteVisitor角色是处理请求的具体角色。示例中，由Support的各子类扮演此角色。
- Client(请求者)
    Client角色是向第一个ConcreteHandler角色发送请求的角色。示例中，由Main类扮演此角色。