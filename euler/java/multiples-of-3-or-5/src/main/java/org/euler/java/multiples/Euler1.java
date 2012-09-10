package org.euler.java.multiples;

/**
 * Solves the first euler problem from projecteuler.net
 * @author jmonette
 */
public class Euler1 {
    public static void main(String[] args) {
        System.out.println(sumMultiplesOf3Or5(1000));
    }

    /**
     * Add all the natural numbers below one thousand that are multiples of 3 or 5.
     *
     * @param bound The bound to follow
     * @return The sum of the multiples of 3 or 5 under the bound
     */
    public static int sumMultiplesOf3Or5(final int bound) {
        int sum = 0;
        for (int i = 1; i < bound; ++i) {
            if (i % 3 == 0 || i % 5 == 0) { sum += i; }
        }
        return sum;
    }
}
