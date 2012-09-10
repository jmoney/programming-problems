package org.euler.java.multiples;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author jmonette
 */
public class Euler1Test {

    @Test
    public void basicTest() {
        assertThat(Euler1.sumMultiplesOf3Or9(10), is(23));
    }

    @Test
    public void passTest() {
        assertThat(Euler1.sumMultiplesOf3Or9(1000), is(233168));
    }
}
