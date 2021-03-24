package HW_4;

import java.util.NoSuchElementException;

public class MyLinkedQueue<T> {
    private MyLinkedList<T> ll = new MyLinkedList<>();
    private int size;


    public void insert(T item) {
        ll.insertFirst(item);
        size++;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return ll.getLast();
    }

    public T remove() {
        T temp = peekFront();
        size--;
        ll.removeLast();
        return temp;
    }

    public boolean isEmpty(){
        return ll.isEmpty();
    }


}
