# Flyweight Method 模式
通过尽量共享实例来避免new出实例；
当需要某个实例时，并不总是通过new关键字来生成实例，而是尽量共用已经存在的实例。

## 角色
- Flyweight（轻量级）
    实例会被共享的类。示例中，BigChar类扮演此角色。
- FlyweightFactory（轻量级工厂）
    生成Flyweight角色的工厂，持有共享类的多个实例。示例中，BigCharFactory扮演此角色。
- Client（请求者）
    使用FlyweightFactory角色来生成Flyweight角色。示例中，由BigString类扮演此角色。
    
