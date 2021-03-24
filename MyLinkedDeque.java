package HW_4;

import java.util.NoSuchElementException;

public class MyLinkedDeque<T> {
    private MyLinkedList<T> ll = new MyLinkedList<>();
    private int size;

    public void insertLeft(T item){
        ll.insertFirst(item);
        size++;
    }

    public void insertRight(T item) {
        ll.insertLast(item);
        size++;
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return ll.getFirst();
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return ll.getLast();
    }

    public T removeLeft() {
        T temp = peekLeft();
        size--;
        ll.removeFirst();
        return temp;
    }

    public T removeRight() {
        T temp = peekRight();
        size--;
        ll.removeLast();
        return temp;
    }

    public boolean isEmpty(){
        return ll.isEmpty();
    }
}
