package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private final String title;
    private final List<String> authors = new ArrayList<>();


    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return new ArrayList<>(authors);
    }

    public void addAuthor(List<String> authors) {
        authors.add("Author");
    }

//    public String rename(String name){
//        title = title2;
//        return title;
//    }


    public static void main(String[] args) {
        Book book = new Book("Pan Tadeusz");
//        book.title = "Lalka";
    }
}
