package org.euler.java.even.fibonacci;

/**
 * Solves the second problem from projecteuler.net
 *
 * @author jmonette
 */
public class Euler2 {

    public static void main(String[] args) {
        System.out.println(sumOfEvenFibonacci(4000000));
    }

    /**
     * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
     *
     * @param bound The bound to stay under
     * @return The sum of all the even fibonacci numbers under bound
     */
    public static long sumOfEvenFibonacci(final long bound) {
        long sum = 0L;
        long prev = 1L;
        long next;

        for(long current = 1L; current < bound; current = next) {
            if(current % 2 == 0) {
                sum += current;
            }
            next = prev + current;
            prev = current;
        }
        return sum;
    }
}
