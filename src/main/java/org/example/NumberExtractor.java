package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberExtractor {
    public String extractAndSortNumbers(String[] strings) {
        String str = Arrays.stream(strings)
                .collect(Collectors.joining(", "));

        String sortedNum = Arrays.stream(str.split(", "))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        return sortedNum;
    }
}
