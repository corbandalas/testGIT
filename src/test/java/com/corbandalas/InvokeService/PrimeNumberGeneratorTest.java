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

        assertTrue(checkIsPrime(1));

        assertTrue(checkIsPrime(17));
    }

    @Test
    public  void testPrimeGeneratorSize() {

        var primeArray = PrimeNumberGenerator.generatePrime(5).toArray();

        int primeArrayExpected[] = new int[] {1, 2,3, 5, 7};

        assertArrayEquals(primeArray, primeArrayExpected);
    }



}