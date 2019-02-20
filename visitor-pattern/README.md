# Visitor 模式
将数据结构和处理分离开来，编写表示“访问者”的类来访问数据结构中的元素，当需要增加新的处理时，只需要编写新的访问者，然后让数据结构可以接受访问者的访问即可
## 角色
- Visitor（访问者）
    对数据结构具体的元素，声明访问不同具体元素的多个visit方法
- ConcreteVisitor（具体访问者）
    负责实现Visitor角色所定义的接口，为每个ConcreteElement准备了visit方法
- Element（元素）
    Element角色表示Visitor角色的访问对象，声明了接受访问者的accept方法
- ConcreteElement
    负责实现Element角色定义的接口
- ObjectStructure（对象结构）
    负责处理Element角色的集合
    