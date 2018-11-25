import java.util.ArrayList;

/**
 * @program: design-pattern-practice
 * @description: 书架，集合的实现类
 * @author: duanbt
 * @create: 2018-11-25 22:07
 **/
public class BookShelf implements Aggregate<Book> {
    private ArrayList<Book> books;

    public BookShelf(int initialCapacity) {
        this.books = new ArrayList<>(initialCapacity);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
