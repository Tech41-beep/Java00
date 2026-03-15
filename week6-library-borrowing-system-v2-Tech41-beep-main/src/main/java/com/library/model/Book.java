package com.library.model;

public class Book extends LibraryItem {
      // Default borrow fee for books
    private static final double DEFAULT_BORROW_FEE = 2.0;

    // Constructor
    public Book(String title, String author) {
        super(title, author, DEFAULT_BORROW_FEE);
    }

    @Override
    public String getItemType() {
        // TODO Auto-generated method stub
        return "Book";
    }

}
