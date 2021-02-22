package com.kodilla.testing.library;

import java.util.List;
import java.util.ArrayList;


public class BookLibrary {

    private LibraryDatabase libraryDatabase;
    private int n;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        List<Book> booksInHandsOf = new ArrayList<Book>();
        List<Book> bookList = new ArrayList<Book>(n);
        if (n > 0 && n < bookList.size()) {
            for (Book book : bookList) {
                booksInHandsOf.add(book);

            }
        }
        return booksInHandsOf;
    }
}
