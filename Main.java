package HW_2;

import java.util.Random;

public class Main {



    public static void main (String[] args) {
        Random r = new Random();
        MyArrayList<Integer> arr = new MyArrayList<>(100000);
        for (int i = 0; i < 100000; i++) {
            arr.add(r.nextInt(1000));
        }
        long start = System.currentTimeMillis();
        //arr.selectionSort();
        //arr.bubbleSort();
        //arr.insertionSort();
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println(result);
    }

}
