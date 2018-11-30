# Iterator模式——一个一个遍历
## 角色
- Iterator（迭代器接口）
    遍历元素的接口
- ConcreteIterator（具体的迭代器）
    对应BookShelfIterator，用来遍历BookShelf
- Aggregate（集合）
    创建Iterator角色的接口
- ConcreteAggregate（具体的集合）
    对应BookShelf，可以创建BookShelfIterator
    
## 意义
    将遍历和实现分离。
    观察如下代码：
    while循环只使用了Iterator接口的方法，不依赖于BookShelf的实现。
    当BookShelf实现发生变化时，此段遍历代码不用修改。增强了代码的复用性。
```java
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(2);
        bookShelf.appendBook(new Book("图解设计模式"));
        bookShelf.appendBook(new Book("图解密码技术"));
        bookShelf.appendBook(new Book("数据结构与算法"));

        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName());
        }
    }
}
```