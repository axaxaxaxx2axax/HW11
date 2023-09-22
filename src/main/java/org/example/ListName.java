package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListName {
    public String getNamesAttOddIndices(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(numbers -> numbers % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }

    public List<String> getNamesSorted(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
    }
}
