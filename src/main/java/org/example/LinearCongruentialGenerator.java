package org.example;

import java.util.stream.Stream;

public class LinearCongruentialGenerator {
    public Stream<Long> generateRandomStream(long a, long c, long m) {
        long seed = System.currentTimeMillis();
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
