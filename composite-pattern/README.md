# Composite 模式
- 使容器和内容具有一致性，能够创造递归结构的模式，组合模式
- 将容器和内容作为同一种东西看待，在容器中既可以放入内容，也可以放入小容器

## 角色
- Leaf
    表示“内容”的角色，在该角色中不能放入其他对象
- Composite
    表示“容器”的角色，可以放入“leaf”和“Composite”角色
- Component
    使Leaf角色和Composite角色具有一致性的角色。是“Leaf”和“Composite”角色的父类
    
可以将Composite角色与他内部的Component角色看成是父亲和孩子们的关系。