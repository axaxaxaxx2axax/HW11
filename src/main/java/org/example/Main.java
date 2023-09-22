package org.example;

import java.util.List;
import java.util.stream.Stream;

import static org.example.StreamZipper.zip;

public class Main {
    private static String makeBold(String text) {
        return "\u001B[1m" + text + "\u001B[0m";
    }

    public static void main(String[] args) {
        ListName listName = new ListName();
        List<String> names = List.of("Anastasiia", "Bill", "Charlie", "Daniel", "Emma", "Zayn", "Fabian", "Kelly", "Yareli");

        System.out.println(makeBold("Завдання 1"));
        System.out.println(listName.getNamesAttOddIndices(names));
        System.out.println();


        System.out.println(makeBold("Завдання 2"));
        System.out.println(listName.getNamesSorted(names));
        System.out.println();

        NumberExtractor numberExtractor = new NumberExtractor();
        String[] strings = {"1, 2, 0", "4, 5, 3"};

        System.out.println(makeBold("Завдання 3"));
        System.out.println(numberExtractor.extractAndSortNumbers(strings));
        System.out.println();

        LinearCongruentialGenerator linearCongruentialGenerator = new LinearCongruentialGenerator();
        System.out.println(makeBold("Завдання 4"));
        linearCongruentialGenerator.generateRandomStream(25214903917L, 11L, (long) Math.pow(2, 48)).limit(10).forEach(System.out::println);
        System.out.println();

        StreamZipper streamZipper = new StreamZipper();
        System.out.println(makeBold("Завдання 5"));
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> secondStream = Stream.of(10, 20, 30, 40, 50, 60);
        Stream<Integer> zippedStream = zip(firstStream, secondStream);
        zippedStream.forEach(System.out::println);
    }
}