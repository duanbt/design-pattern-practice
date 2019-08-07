# Proxy 模式
   只在必要时生成实例
## 角色
- Subject(主体)
    定义了使Proxy角色和RealSubject角色具有一致性的接口
- RealSubject(实际主体)
    在Proxy角色无法胜任工作时出场
- Proxy(代理人)
    尽量处理来自Client的请求，只有自己不能处理时，它才会将工作交给realSubject角色