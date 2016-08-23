import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DevinMui extends Student implements NumberOfSiblings, JustForFun
{
    
    long pauseTime = 0;
    
    public DevinMui(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        imgFile=f.toLowerCase()+l.toLowerCase()+".jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";
        setImage(imgFile);
    }

    public DevinMui() {
        firstName="Devin";
        lastName="Mui";
        myRow=3;
        mySeat=7;
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(imgFile);
    }
    
    public String myFavoriteActivity(){
        return "Coding lmao";
    }
    
    public int numberOfSiblings(){
        return 2;
    }
    
    public int numberOfBrothers(){
        return 0;
    }
    
    public int numberOfSisters(){
        return 2;
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            sayName(soundFile);
            randomAnimationThing();
        }
    } 
    
    public void randomAnimationThing(){
        GreenfootImage image = getImage();
        int width = image.getWidth();
        int height = image.getHeight();
        for(int i=0;i<= 10; i++){
            image.scale(image.getWidth() - 10, image.getHeight() - 10);
            setLocation(i, i);
            Greenfoot.delay(10);
        }
        image.scale(width, height);
        sitDown();
    }
    
    public void pause(long delay){
        long time = System.currentTimeMillis();
        pauseTime = time + delay;
    }
    
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    
    // fibonacci lel
    
    public int doStuff(int i){
        if(i <= 0){
            return 0;
        } else if(i == 1){
            return 1;
        } else {
            return doStuff(i - 1) + doStuff(i - 2);
        }
    }
    
    public void fib(int i){
        System.out.println(doStuff(i));
    }
    
    public void someRandomMethod(int i){
        for(int k=0;k<i;k++){
            System.out.println(k);
        }
    }
}
