package com.library.model;

public class Magazine extends LibraryItem{
      // Default borrow fee for magazines
    private static final double DEFAULT_BORROW_FEE = 1.5;

      // Constructor
    public Magazine(String title, String author) {
        super(title, author, DEFAULT_BORROW_FEE);
    }

    @Override
    public String getItemType() {
        // TODO Auto-generated method stub
        return "Magazine";
    }
   
    
}
