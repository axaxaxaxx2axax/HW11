package org.example;

import java.util.stream.Stream;

public class StreamZipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Object[] firstArray = first.toArray();
        Object[] secondArray = second.toArray();

        int minLength = Math.min(firstArray.length, secondArray.length);

        return Stream.of(firstArray, secondArray)
                .flatMap(array -> Stream.of(array))
                .limit(minLength)
                .map(element -> (T) element);
    }
}
