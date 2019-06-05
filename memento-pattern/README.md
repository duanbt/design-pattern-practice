# Memento 模式

如同游戏中的存档功能，事先将某个时间点的实例的状态保存下来，
之后再有必要时，再将实例恢复至当时的状态

## 角色
- Originator(生成者)
    本例中的Gamer。
    Originator角色会在保存自己的最新状态时生成Memento角色。
    当把以前保存的Memento角色传递给Originator角色时，它会将自己恢复至生成该Memento角色时的状态。
- Memento(纪念品)
    本例中的Memento。
    Memento角色会将Originator角色的内部信息整合在一起。
    在Memento角色中虽然保存了Originator角色的信息，但它不会向外部公开这些信息。
    
    Memento角色有以下两种接口：
    1. wide interface - 宽接口
    用于恢复对象状态信息的方法集合。会暴露所有Memento角色的内部信息，
    因此能够使用宽接口的只有Originator角色
    2. narrow interface - 窄接口
    为外部Caretaker角色提供了窄接口。
    可以通过窄接口获取的Memento角色的内部信息非常有限，因此可以有效防止信息泄露
    
    对外提供以上两种接口，可以有效防止对象的封装性被破坏。
    
- CareTaker(负责人)
    本例中的Main。
    当Caretaker角色想要保存当前的Originator角色的状态时，会通知Originator角色。
    Originator角色在收到通知后会生成Memento角色的实例并将其返回给Caretaker角色。
    想恢复原先保存的状态时，再通知Originator角色恢复状态(传入先前保存的Memento实例)。
    Caretaker角色只能使用Memento角色的narrow interface，
    它无法访问Memento角色内部的所有信息，只是将Memento实例当做一个黑盒子保存起来。
     
    