package KnapsackProblem;

//Пусть имеется набор предметов, каждый из которых имеет два параметра — масса и ценность.
//Также имеется рюкзак определённой грузоподъёмности.
//Задача заключается в том, чтобы собрать рюкзак с максимальной ценностью предметов внутри,
// соблюдая при этом ограничение рюкзака на суммарную массу.


import java.util.*;

public class Main {

    private static final int DEFAULT_AMOUNT = 100;
    private static final Random rCost = new Random();
    private static final Random rWeight = new Random();

    public static void main(String[] args) {
        Backpack<Item> bp = new Backpack<>();
        List<Item> heapOfThings = new ArrayList<>();
        Comparator<Item> iCom = new ItemWeightComparator().thenComparing(new ItemCostComparator());
        for (int i = 0; i < DEFAULT_AMOUNT; i++) {
            heapOfThings.add(new Item((rCost.nextInt(100) + 1), (rWeight.nextInt(bp.getCarrying()) + 1), i + 1));
        }
//        System.out.println("Созданная куча вещей:");
//        for (int i = 0; i < heapOfThings.size(); i++) {
//            System.out.println(heapOfThings.get(i));
//        }
        Collections.sort(heapOfThings, iCom);
//        System.out.println("Отсортированная куча вещей: ");
//        for (int i = 0; i < heapOfThings.size(); i++) {
//            System.out.println(heapOfThings.get(i));
//        }
        while (bp.getCarrying() >= 0) {
            bp.addItem(heapOfThings.get(0));
            heapOfThings.remove(0);
            if (heapOfThings.get(0).getWeight() > bp.getCarrying()) {
                break;
            }
        }
        System.out.print("Общая цена положенных в рюкзак вещей: ");
        int sumCost = 0;
        for (int i = 0; i < bp.size(); i++) {
            sumCost += bp.getItem(i).getCost();
        }
        System.out.println(sumCost);
        System.out.println("Всего вещей в рюкзаке: " + bp.size());

    }

}
