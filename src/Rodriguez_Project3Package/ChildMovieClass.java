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
public class ChildMovieClass extends ParentClass_StoreItem
{
    //Purpose: create variables
    // Author: Juana Rdoriguez
    private static int movieCount = 0;
    private String director;
    private String actors;
    private String actress;
    
    
    // Constructor Initialize movies, add 1 to static count and
    // output String indicating that constructor was called
    public ChildMovieClass( String title, String author, Date dateAcquired, double purchasePrice, double askingPrice, String director,
            String actors, String actresses)
    {
        super(title, author, dateAcquired, purchasePrice,askingPrice);
        // Purpose: Increment static count of movies
        
        
        this.actors = actors;
        this.director = director;
        this.actress = actresses;
       
    }
    // Pourse Method: Static method to get static count value
    // Author Name: Juana Rodriguez
    /// Return Type: static int
    public static int getMovieCount() 
    {
        movieCount++;
        return movieCount;
    }
    //Porpoese Method: Get the Director
    // Author Name: Juana Rodiguez
    // Return Type: String
    public String getDirector() {
        return director;
    }
    //Porpoese Method: getDirector
    // Author Name: Juana Rodiguez
    // Return Type: String
    public void setDirector(String director) {
        this.director = director;
    }
    //Porpoese Method: get actor
    // Author Name: Juana Rodiguez
    // Return Type: String
    public String getActor() {
        return actors;
    }
    //Porpoese Method: set actor
    // Author Name: Juana Rodiguez
    // Return Type: String
    public void setActor(String actors) {
        this.actors = actors;
    }
    // Author Name: Juana Rodiguez
    // Return Type: String
    public String getActress() {
        return actress;
    }
    //Porpoese Method: set actricess
    // Author Name: Juana Rodiguez
    // Return Type: String
    public void setActresses(String actresses) {
        this.actress = actress;
    }
        // Method Purpose: remove
    // Author : Juana Rodriguez
    // Return Type:int
    public static int remove()  
    {
        movieCount--;
        
        return movieCount;
    }
      @Override
    public int itemCount()
    {
        return getMovieCount();
    }
    // Purpose Returns a String caontaing the Movies' information
    @Override
    public String toString()
    {
        //%s%s: %s%n%s: %s%s: %n%s%n"
        return String.format("%n--------------------Movies------------%n" +"%s: %s %s%n%s: %s%n%s:%s%n%n" , super.toString(),"Director", getDirector(),
                                    "Actor ", getActor(),"Actress",getActress());
    }
}
