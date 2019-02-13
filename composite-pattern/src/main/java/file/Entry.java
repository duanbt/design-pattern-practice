package file;

/**
 * File类和Directory类的抽象基类
 *
 * @author duanbt
 * @version 1.0
 **/
public abstract class Entry {
    protected Entry parent;

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        Entry entry = this;
        do {
            fullName.insert(0, "/" + entry.getName());
            entry = entry.parent;
        } while (entry != null);
        return fullName.toString();
    }
}
