package HW_2;

import java.util.NoSuchElementException;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyDeque(int capacity) throws IllegalArgumentException {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[capacity];
    }

    /**
     * Метод добавления в очередь нового элемента слева
     *
     * @param item добавляемый элемент
     * @throws IllegalStateException если очередь полная
     */
    public void insertLeft(T item) throws IllegalStateException {
        if (isFull()) {
            //реализовать расширение массива
            throw new IllegalStateException("Очередь заполнена");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertRight(T item) throws IllegalStateException {
        if (isFull()) {
            //реализовать расширение массива
            throw new IllegalStateException("Очередь заполнена");
        }
        size++;
        list[previousIndex(begin)] = item;
        begin = previousIndex(begin);
    }

    /**
     * Метод просмотра элемента справа
     * */
    public T peekFrontRight() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }

    /**
     * Метод просмотра элемента слева
     * */
    public T peekFrontLeft() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[previousIndex(end)];
    }

    /**
     * Метод извлечения элемента справа
     * */
    public T removeRight() {
        T temp = peekFrontRight();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeLeft() {
        T temp = peekFrontLeft();
        size--;
        list[previousIndex(end)] = null;
        end = previousIndex(end);
        return temp;
    }


    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int previousIndex(int index) {
        if (index == 0) {
            return list.length - 1;
        } else {
            return index - 1;
        }
    }


//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("[ ");
//        int i = begin;
//        while (i != end) {
//            sb.append(list[i]).append(", ");
//            i = nextIndex(i);
//        }
//        if (size > 0) {
//            sb.setLength(sb.length() - 2);
//        }
//        sb.append(" ]");
//        return sb.toString();
//    }

    private void reCapacity(int newCapacity){

    }

}