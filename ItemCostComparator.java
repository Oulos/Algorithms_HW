package KnapsackProblem;

import java.util.Comparator;

public class ItemCostComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        if (o1.getCost() < o2.getCost()) {
            return 1;
        } else if (o1.getCost() > o2.getCost()) {
            return -1;
        } else {
            return 0;
        }
    }
}
