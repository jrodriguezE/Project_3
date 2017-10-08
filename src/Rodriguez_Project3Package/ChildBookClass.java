/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rodriguez_Project3Package;

import java.util.Date;

/**
 *
 * @author juana
 */
// Subclass is inheriting all the variables and methds defined in ParentClass_StoreItems
public class ChildBookClass extends ParentClass_StoreItem
{
    // Purpose: Number of Books created
    private static int bookCount;
    private String genre;
    
    
    // Initializa books, add 1 to static count and
    // output String indicating that the constructor was called
    public ChildBookClass (String author,String title, Date dateAcquired , double purchasePrice , double askingPrice, String genre)
    {      
        super( author, title, dateAcquired, purchasePrice,askingPrice);
        this.genre = genre;
        // Purpose: test if the user enter a valid number
        // Author: Juana Rodriguez
        if(super.getPurchasePrice() < 0.0)
        {
            // Throw a IllegalArgumentException
            throw new IllegalArgumentException("Price per items must be >= 0");
        }
        
    }
    // Method Purpose: get Genre
    // Author : Juana Rodriguez
    // Return Type: String
    public String getGenre()
    {
        return genre;
    }
     // Method Purpose: set genre
    // Author : Juana Rodriguez
    // Return Type: void
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
     // Method Purpose: getbook count
    // Author : Juana Rodriguez
    // Return Type: int
    public static int getBookCount()
    {
        bookCount ++;
        return bookCount;
    }
     // Method Purpose: remove
    // Author : Juana Rodriguez
    // Return Type:int
    public static int remove()  
    {
        bookCount--;
        
        return bookCount;
    }
       // CAlculate the total items
    @Override
    public  int itemCount()
    {
        return getBookCount();
    }
    // Purpose: Return a String containing the Book's Inforamtion
    @Override
    public String toString()
    {
        return String.format("%n--------------------Book------------%n" + "%s%s: %s%n%n", super.toString(),"Genre", getGenre());
    }
   
}
