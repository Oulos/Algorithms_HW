package HW_8;

public class Main {

    public static void main(String[] args) {
        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>();
        chm.put(1, "one");
        chm.put(2, "two");
        chm.put(3, "three");
        chm.put(4, "four");
        chm.put(5, "five");
        System.out.println(chm);
        System.out.println(chm.size());
        System.out.println(chm.remove(4));
        System.out.println(chm.remove(6));
        System.out.println(chm);
        System.out.println(chm.size());
    }

}
