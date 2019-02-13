package file;

import java.util.ArrayList;

/**
 * @author duanbt
 * @version 1.0
 **/
public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    public Entry add(Entry entry){
        directory.add(entry);
        entry.parent = this;
        return this;
    }
}
