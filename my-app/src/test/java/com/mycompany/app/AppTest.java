package com.mycompany.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testSum() {
        int expected = 5;
        int actual = App.sum(3, 2);
        Assertions.assertEquals(expected, actual);
    }
}
