import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BobKaehms extends Student //implements JustForFun
{

    /*
     * Constructor for the BobKaehms class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different parameter
     *  lists to initalize for different conditions
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     */
    public BobKaehms(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        imgFile=f.toLowerCase()+l.toLowerCase()+".jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";
        setImage(imgFile);
    }
    /*
     * Default constructor, if you don't pass in a name and seating location
     */
    public BobKaehms() {
        firstName="Foo";
        lastName="Bar";
        myRow=1;
        mySeat=1;
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(imgFile);
    }
    
     /**
     * Act - do whatever the BobKaehms wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
         //   getName();
              sayName(soundFile);
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
}
