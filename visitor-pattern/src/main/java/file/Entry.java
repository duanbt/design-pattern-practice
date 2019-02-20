package file;

import java.util.Iterator;

/**
 * @author duanbt
 * @version 1.0
 **/
public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + "(" + +getSize() + ")";
    }
}
