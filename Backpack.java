package KnapsackProblem;

public class Backpack<T> {

    private int carrying;
    private T[] things;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;
    private final int DEFAULT_CARRYING = 50;

    public Backpack (int capacity, int carrying) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity <= 0" + capacity);
        }
        this.capacity = capacity;
        this.carrying = carrying;
        things = (T[]) new Object[capacity];
    }

    public Backpack () {
        this.capacity = DEFAULT_CAPACITY;
        this.carrying = DEFAULT_CARRYING;
        things = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public int getCarrying() {
        return carrying;
    }

    public void addItem (Item item) {
        if (!isFit(item.getWeight())){
            System.out.println("В рюкзак больше не влезет");
            return;
        }
        if (size == ((capacity * 75) / 100)) {
            expand();
        }
        things[size] = (T) item;
        size++;
        carrying -= item.getWeight();
    }

    public T getItem (int index) {
        if (index < 0 || index > capacity) {
            throw new IndexOutOfBoundsException();
        }
        return things[index];
    }

    private void expand() {
        capacity = capacity + (capacity / 2);
        T[] temp = (T[]) new Object[capacity];
        System.arraycopy(things, 0, temp, 0, things.length);
        things = temp;
    }

    private boolean isFit(int weight) {
        return (carrying - weight) >= 0;
    }

}
