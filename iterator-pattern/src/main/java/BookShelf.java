import java.util.ArrayList;

/**
 * @author duanbt
 * @version 1.0
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
