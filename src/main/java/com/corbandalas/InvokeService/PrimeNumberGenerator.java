package com.corbandalas.InvokeService;

import java.util.stream.IntStream;

public class PrimeNumberGenerator {
    public static boolean checkIsPrime(int number) {
        return number == 1 || !IntStream.range(2, number).anyMatch(i -> number % i == 0);
    }

    public static IntStream generatePrimeNumber() {
        return IntStream.iterate(1, i-> i + 1).filter(PrimeNumberGenerator::checkIsPrime);
    }

    public static IntStream generatePrime(int size) {
        return generatePrimeNumber().limit(size);
    }
}
