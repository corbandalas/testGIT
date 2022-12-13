package com.corbandalas.InvokeService;

import java.util.stream.IntStream;

public class PrimeNumberGenerator {
    public static boolean checkIsPrime(int number) {
        return !IntStream.range(2, number).anyMatch(i -> number % i == 0);
    }
}
