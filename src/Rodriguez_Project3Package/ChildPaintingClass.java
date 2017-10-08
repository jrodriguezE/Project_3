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
public class ChildPaintingClass extends ParentClass_StoreItem
{
    //Purpose: create variables
    // Author: Juana Rdoriguez
    static int paintCount = 0;
    private int height;
    private int width;
    private String media;
    // Constructor Initialize paintings, add 1 to static count and
    // output String indicating that constructor was called
    public ChildPaintingClass(String title , String author, Date dateAcquired, double purchasePrice, double askingPrice, int height,
                int width, String media)
    {
        // call super variables atributes
        super(title, author, dateAcquired, purchasePrice,askingPrice);
        
        this.height = height;
        this.width = width;
        this.media = media;      
    }
    // Pourse Method: Static method to get static count value
    // Author Name: Juana Rodriguez
    /// Return Type: static int
    public static int getPaintCounrt()
    {
        paintCount ++;
        return paintCount;
    }
    // Pourse Method: 
    // Author Name: Juana Rodriguez
    /// Return Type: 
    public static void setPaintCounrt(int paintCounrt)
    {
        ChildPaintingClass.paintCount = paintCounrt;
    }
        // Method Purpose: remove
    // Author : Juana Rodriguez
    // Return Type:int
    public static int remove()  
    {
        paintCount--;
        
        return paintCount;
    }
    // Pourse Method:  getHeight
    // Author Name: Juana Rodriguez
    /// Return Type: int
    public int getHeight()
    {
        return height;
    }
    // Pourse Method: setHeight 
    // Author Name: Juana Rodriguez
    /// Return Type: void
    public void setHeight(int height)
    {
        this.height = height;
    }
    // Pourse Method: getWidth
    // Author Name: Juana Rodriguez
    /// Return Type: int
    public int getWidth()
    {
        return width;
    }
    // Pourse Method: setWidth
    // Author Name: Juana Rodriguez
    /// Return Type: void
    public void setWidth(int width)
    {
        this.width = width;
    }
    // Pourse Method: getMedia(
    // Author Name: Juana Rodriguez
    /// Return Type: String
    public String getMedia()
    {
        return media;
    }
    // Pourse Method: setMedia
    // Author Name: Juana Rodriguez
    /// Return Type:void
    public void setMedia(String media) 
    {
        this.media = media;
    }

     @Override
    public int itemCount()
    {
        return getPaintCounrt();
    }
    // Purpose: Return a String containing the painting' info
    @Override
    public String toString()
    {
        return String.format("%n--------------------Painting------------%n" +"%n%s%s: %s%n%s: %s %n%s: %s %n%n", super.toString(),"Width", getWidth(),
                "Height",getHeight(), "Media", getMedia());
    }

}
