package org.euler.java.even.fibonacci;

/**
 * @author jmonette
 */
public class Euler2 {

    public static void main(String[] args) {
        System.out.println(sumOfEvenFibonacci(4000000));
    }

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
