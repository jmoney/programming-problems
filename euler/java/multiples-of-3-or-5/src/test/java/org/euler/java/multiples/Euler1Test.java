package org.euler.java.multiples;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Unit test class
 *
 * @author jmonette
 */
public class Euler1Test {

    /**
     * Basic test. What is the sum under 10?
     */
    @Test
    public void basicTest() {
        assertThat(Euler1.sumMultiplesOf3Or5(10), is(23));
    }

    /**
     * Pass test. Part of problem description: http://projecteuler.net/problem=1
     */
    @Test
    public void passTest() {
        assertThat(Euler1.sumMultiplesOf3Or5(1000), is(233168));
    }
}
