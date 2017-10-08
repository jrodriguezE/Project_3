/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rodriguez_Project3Package;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juana
 */
public abstract class ParentClass_StoreItem
{
    //Purpose: create variables
    // Author: Juana Rdoriguez
    private static int itemCount;
    private String author;
    private String title;
    private  Date dateAcquired;
    private double  purchasePrice;
    private double askingPrice;
    static ArrayList<ParentClass_StoreItem> storeItems = new ArrayList<ParentClass_StoreItem>();
    // Cosntructor
     // Constructor Initialize movies, add 1 to static count and
    // output String indicating that constructor was called
    public ParentClass_StoreItem( String author, String title, Date dateAcquired, double purchasePrice, double askingPrice)
    {      
        this.author = author;
        this.title = title;
        this.dateAcquired = dateAcquired;
        this.purchasePrice = purchasePrice;
        this.askingPrice = askingPrice;   
        itemCount++;
        
    }  
    //Porpoese Method: getAuthor
    // Author Name: Juana Rodiguez
    // Return Type: String
    public String getAuthor() {
        return author;
    }
    //Porpoese Method: setAuthor
    // Author Name: Juana Rodiguez
    // Return Type: void
    public void setAuthor(String author) {
        this.author = author;
    }
    //Porpoese Method: getTitle
    // Author Name: Juana Rodiguez
    // Return Type: String
    public String getTitle() {
        return title;
    }
    //Porpoese Method: setTitle
    // Author Name: Juana Rodiguez
    // Return Type: void
    public void setTitle(String title) {
        this.title = title;
    }
    //Porpoese Method: getDateAcquired
    // Author Name: Juana Rodiguez
    // Return Type: date
    public Date getDateAcquired() {
        return dateAcquired;
    }
    //Porpoese Method: setDateAcquired
    // Author Name: Juana Rodiguez
    // Return Type: void
    public void setDateAcquired(Date dateAcquired) {
        this.dateAcquired = dateAcquired;
    }
    //Porpoese Method: getPurchasePrice
    // Author Name: Juana Rodiguez
    // Return Type: double
    public double getPurchasePrice() {
        return purchasePrice;
    }
    //Porpoese Method: setPurchasePrice
    // Author Name: Juana Rodiguez
    // Return Type: void
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    //Porpoese Method: getAskingPrice
    // Author Name: Juana Rodiguez
    // Return Type: double
    public double getAskingPrice() {
        return askingPrice;
    }
    //Porpoese Method: setAskingPrice
    // Author Name: Juana Rodiguez
    // Return Type: void
    public void setAskingPrice(double askingPrice) {
        this.askingPrice = askingPrice;
    }
  
    //Return a String containing the book
    //Athor: Juana Rodriguez
    // Date: 10/4/2016
    @Override
    public String toString()         
    {
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s:$ %s%n%s:$ %s%n", "Title", getTitle(), "Author", 
                            getAuthor(), "Date Acquired", getDateAcquired(), "Purchase Price",
                            getPurchasePrice(), "Asking Price", getAskingPrice());
    }
    // abstract method must be overrridden by concreate subclasses 
    public abstract int itemCount();
   
}
