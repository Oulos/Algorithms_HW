package HW_6;

import java.util.Random;

public class Main {

    public static void main (String[] args) {

        int balanced = 0;
        int notBalanced = 0;
        for (int i = 0; i < 2000000; i++) {

            MyTreeMap<Integer, String> map = new MyTreeMap<>();
            while (map.height() < 7) {
                int random = (int) (Math.random()*(200+1) - 100);
                map.put(random, "value");
            }
            if (map.isBalanced()){
                balanced++;
            } else {
                notBalanced++;
            }
        }
        System.out.println("Сбалансированных деревьев: " + balanced + ". несбалансированных: " + notBalanced);
    }

}
