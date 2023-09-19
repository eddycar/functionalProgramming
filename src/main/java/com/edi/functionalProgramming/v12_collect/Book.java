package com.edi.functionalProgramming.v12_collect;

import java.util.Objects;

public class Book {
    private final String isbn;
    private final String title;
    private final int yearOfPublication;
    private final Genre genre;

    public Book(String isbn, String title, int yearOfPublication, Genre genre) {
        Objects.requireNonNull(isbn);
        Objects.requireNonNull(title);
        Objects.requireNonNull(genre);
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication &&
                isbn.equals(book.isbn) &&
                title.equals(book.title) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, yearOfPublication, genre);
    }
}
