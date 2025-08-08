package collection.set;

public interface Myset<E> {
    boolean add(E elements);
    boolean remove(E value);
    boolean contains(E value);
}
