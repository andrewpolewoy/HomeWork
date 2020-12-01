package HomeWork4.core;

import java.util.Comparator;

public class DataComparator<T extends Comparable> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.hashCode() - o2.hashCode();
    }
}
