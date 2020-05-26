# Interpreter 模式
Interpreter模式中，程序要解决的问题会被用非常简单的“迷你语言”表述出来。
即用“迷你语言”编写的“迷你程序”把具体的问题表述出来。迷你程序是无法单独工作的，
我们还需要用Java语言编写一个负责“翻译”(interpreter)的程序。翻译程序会理解迷你语言，
并解释和运行迷你程序。这段翻译程序也被称为解释器。这样，当需要解决的问题发生变化时，不需要修改Java语言程序，
只需要修改迷你语言程序即可应对。

## 角色
- AbstractExpression（抽象表达式）
    AbstractExpression角色定义了语法树节点的共同接口（API）。在示例程序中，由Node类扮演此角色。
    在示例程序中，共同接口（API）的名字是parse
    
- TerminalExpression（终结符表达式）
    TerminalExpression角色对应BNF中的终结符表达式。在示例程序中，由PrimitiveCommandNode类扮演此角色
    
- NonTerminalExpression（非终结符表达式）
    NonTerminalExpression角色对应BNF中的非终结符表达式。在示例程序中，由ProgramNode类、
    CommandNode类、RepeatCommandNode类和CommandListNode类扮演此角色。
    
- Context（上下文）
    Context角色为解释器进行语法解析提供了必要的信息。在示例程序中，由Context类扮演此角色。``