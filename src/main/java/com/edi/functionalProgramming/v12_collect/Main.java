package com.edi.functionalProgramming.v12_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        List<Book> myBooks = Arrays.asList(
                new Book("655-85", "Sufriendo a Pedro", 2018, Genre.TERROR),
                new Book("936-66", "Los papeles por delante", 1998, Genre.THRILLER),
                new Book("975-98", "La vida de Baldomero", 2017, Genre.COMEDY),
                new Book("936-66", "Los papeles por delante", 1998, Genre.THRILLER),
                new Book("975-98", "La vida de Baldomero", 2017, Genre.COMEDY)
        );
        Set<Book> result = myBooks.stream()
                .filter(book -> book.getYearOfPublication() < 2000)
                .collect(Collectors.toSet());
        System.out.println(result);
    }
}
