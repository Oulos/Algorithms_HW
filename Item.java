package KnapsackProblem;

public class Item {

    private final int cost;
    private final int weight;
    private final int number;

    public Item (int cost, int weight, int number) {
        this.cost = cost;
        this.weight = weight;
        this.number = number;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Вещь #").append(number).append(". Стоит ").append(cost).append(". Весит ").append(weight).append(".]");
        return sb.toString();
    }
}
