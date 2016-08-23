import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Student extends Actor
{
   //Instance variables
   public String firstName;
   public String lastName;
   public int myRow;         // rows start in the front of class (1), and end in the back of class
   public int mySeat;        // seats are left to right, 1-8
   public boolean isActive;  // can you think of an algorithm that would allow you to use this
                             // variable to use keyboard entry for all the instance of a student
                             // that we will create?
   
   public String imgFile;   // These will be created in subclass as firstName.toLowerCase()+
   public String soundFile; //      firstName.toLowerCase()+lastName.toLowerCase()+".ext"; (.wav or .jpg)
   
   public void setRow(int r){
       myRow=r;
    }
    
    public void setSeat(int s){
       mySeat=s;
    }
    
    public abstract void  getName(); //This is an abstract classs. You will have to implement it
                                     // in your own class file
    /**
     * Plays a sound file when called
     * @param String myNameFile  is the name of the sound file to play, ex "mySound.wav",
     */
    public void sayName(String myNameFile){
        Greenfoot.playSound(myNameFile);
    }
    
    public void sitDown(){
        setLocation(mySeat,myRow);
    }
        
 
}
