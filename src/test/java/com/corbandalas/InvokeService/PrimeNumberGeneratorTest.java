package com.corbandalas.InvokeService;

import org.junit.jupiter.api.Test;

import static com.corbandalas.InvokeService.PrimeNumberGenerator.checkIsPrime;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberGeneratorTest {

    @Test
    public void testIsPrime() {
        var isPrimeFour = checkIsPrime(4);

        assertFalse(isPrimeFour);

        assertTrue(checkIsPrime(7));

        assertTrue(checkIsPrime(17));
    }

}