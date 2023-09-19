package com.edi.functionalProgramming.v11_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    ArrayList<Integer> entero = new ArrayList<>();
    Random random = new Random();

    public Main() {
        Integer result = Stream.of(
                        new Student("Manolo", 26),
                        new Student("Carlito", 30),
                        new Student("Patricia", 26))
                .reduce(0, (acumulador, student) -> acumulador + student.getAge(), (parcial1, parcial2) -> parcial1 + parcial2);
        System.out.println(result);
    }

    private Stream<Integer> getRandomNumbers(Integer size) {
        return random.ints(size, 0, 10).boxed();
    }

    private int randomInt() {
        return random.nextInt(10);
    }

    public static void main(String[] args) {
        new Main();
    }

}