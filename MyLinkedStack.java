package HW_4;

import java.util.EmptyStackException;

public class MyLinkedStack<T> {
    private MyLinkedList<T> ll = new MyLinkedList<>();
    private int size;


    public void push(T item){
        ll.insertFirst(item);
        size++;
    }

    public T peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return ll.getFirst();
    }

    public T pop(){
        T temp = peek();
        size--;
        ll.removeFirst();
        return temp;
    }

    public int size(){
        return ll.size();
    }

    public boolean isEmpty(){
        return ll.isEmpty();
    }



}