package HW_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    
    /**
     * Циклический метод возведения в степень*/
    private static int exponentiation (int number, int exponent) {
        int result = 1;
        if (exponent == 0) {
            return 1;
        } else {
            for (int i = 1; i <= exponent; i++) {
                result *= number;
            }
            return result;
        }
    }

    /**
     * Рекурсивный метод возведения в степень*/
    private static int recExponentiation (int number, int exponent) {

        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return number;
        } else {
            return recExponentiation(number, (exponent - 1)) * number;
        }
    }



    public static void main (String[] args) {

    }

}
