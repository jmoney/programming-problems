package org.euler.java.even.fibonacci;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Unit test class
 *
 * @author jmonette
 */
public class Euler2Test {

    /**
     * Basic test. What is the sum under 8?
     */
    @Test
    public void basicTest() {
        assertThat(new Long(Euler2.sumOfEvenFibonacci(8)), is(new Long(2)));
    }

    /**
     * Pass test. Part of problem description: http://projecteuler.net/problem=2
     */
    @Test
    public void passTest() {
        assertThat(new Long(Euler2.sumOfEvenFibonacci(4000000)), is(new Long(4613732)));
    }
}
