package org.euler.java.multiples;

/**
 * @author jmonette
 */
public class Euler1 {
    public static void main(String[] args) {
        System.out.println(sumMultiplesOf3Or9(1000));
    }

    public static int sumMultiplesOf3Or9(final int bound) {
        int sum = 0;
        for (int i = 1; i < bound; ++i) {
            if (i % 3 == 0 || i % 5 == 0) { sum += i; }
        }
        return sum;
    }
}
