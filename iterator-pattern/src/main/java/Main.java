/**
 * @program: design-pattern-practice
 * @description: 测试类
 * @author: duanbt
 * @create: 2018-11-25 22:19
 **/
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
