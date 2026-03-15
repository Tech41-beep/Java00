package com.library.service;

import com.library.model.LibraryItem;

public class BorrowService {
    private double discount = 0.0 ;

    public BorrowService() {} //default constructor 

   
    //constructor with discount
    public BorrowService(double discount){
        this.discount = discount;
    } //this = current object model attribute 
      //this = assignment local parameter itself which we use it for constructor

    //method borrow single item
    public double borrow(LibraryItem item){
        double fee = item.getBorrowFee();
        return fee - (fee*discount);
    } // Apply Discount

    //method borrow items with extra day
    public double borrow(LibraryItem item, int extraDays) {
            double fee = item.getBorrowFee();
            double additionFee = extraDays*0.5 ;
            return (fee + additionFee) - (fee*discount);
    }// fee = price 
      //additionalFee= extra price

    //method borrow multiple items
    public double borrow(LibraryItem[] items) {
        double totalFee=0.0;
        for(LibraryItem item: items){
            totalFee +=item.getBorrowFee();
        }
        return totalFee - (totalFee * discount );
    }

    //method extra items with extra days
    public double borrow(LibraryItem[] items , int extraDays){
        double totalFee = 0.0;
        //for each in java item variable type LibraryItem
        for( LibraryItem item : items){
            totalFee += item.getBorrowFee();
        }
        double additionFee = extraDays * 0.5 * items.length;
        return ( totalFee + additionFee) - (totalFee * discount);
    }


    
    // public void borrowItem(LibraryItem item){
    //     System.out.println("" + item.getTitle());
    //     System.out.println("" + item.getItemType());
    //     System.out.println("" + item.getAuthor());
    //     System.out.println("" + item.getBorrowFee());
    // }
}
