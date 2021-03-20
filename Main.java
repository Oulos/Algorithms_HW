package HW_2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    /**
     * 1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
     * Мой метод сначала разбирает строку на массив char'ов, затем прогоняет через стэк и перезаписывает.
     * */
    private static String mirroring(String s) {
        char[] tempArr = s.toCharArray();
        MyStack<Character> stack = new MyStack<Character>(tempArr.length);
        for (int i = 0; i < tempArr.length; i++) {
            stack.push(tempArr[i]);
        }

        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = stack.pop();
        }
        return new String(tempArr);
    }

    public static void main (String[] args) {

        String s1 = "abcdef";
        System.out.println(mirroring(s1));

    }

}
