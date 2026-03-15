package com.library.model;

//superClass or parent Class
//this class extend Book , Magazine, etc which are child classes or subclasses

public abstract class LibraryItem {
    private String title ;
    private String author;
    private double borrowFee;
    LibraryItem(String title, String author, double borrowFee){
        this.title=title;
        this.author=author;
        this.borrowFee=borrowFee;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getBorrowFee() {
        return borrowFee;
    }
    public void setBorrowFee(double borrowFee) {
        this.borrowFee = borrowFee;
    }
    public abstract String getItemType();
 
}

//book is a child class of libraryItem
//extend  libraryItem
//inherits title , author and borrowFee (field)
