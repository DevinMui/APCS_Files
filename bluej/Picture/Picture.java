
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. 
 * 
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)  (modified 2015-08 by Garrett Shorr)
 */
public class Picture
{
    public static void main(String[] args)
    {
        Picture p = new Picture();
        p.draw();
    }

    /**
     * Draw this picture.  The colors available are: red, black, blue, yellow, green,
     * magenta, white, gray, orange, pink, dark gray, light gray, and cyan.  
     * In the changeColor method, supply the color as a String in all lowercase as
     * written above.
     */
    public void draw()
    {   
        int ver = 200;
        int hor = 120;
        
        new Rect().changeSize(1000,1000)
                  .moveHorizontal(0)
                  .moveVertical(0)
                  .changeColor("blue")
                  .makeVisible();
                      
        new Circle().moveVertical(50)
                    .moveHorizontal(300)
                    .changeSize(30)
                    .changeColor("yellow")
                    .makeVisible();
        
        for(int i=0; i<10;i++){
            hor += 40;
            
            
            
            new Triangle().moveVertical(ver)
                          .moveHorizontal(hor)
                          .makeVisible();
                          
            new Triangle().moveVertical(ver + 20)
                          .moveHorizontal(hor)
                          .makeVisible();
                          
            new Triangle().moveVertical(ver + 40)
                          .moveHorizontal(hor)
                          .makeVisible();
                          
            new Square().moveVertical(ver + 70)
                        .moveHorizontal(hor - 5)
                        .changeSize(10)
                        .changeColor("brown")
                        .makeVisible();
                        
            new Rect().moveHorizontal(hor - 60)
                      .moveVertical(ver + 60)
                      .changeSize(100, 50)
                      .changeColor("brown")
                      .makeVisible();
                      
            new Rect().moveHorizontal(hor - 60)
                      .moveVertical(ver + 120)
                      .changeSize(100, 50)
                      .changeColor("brown")
                      .makeVisible();
                      
            new Rect().moveHorizontal(hor - 60)
                      .moveVertical(ver + 120)
                      .changeSize(5, 20)
                      .changeColor("yellow")
                      .makeVisible();
                        
        }
        /*
        Triangle triangle = new Triangle();
        triangle.moveVertical(ver);
        triangle.moveHorizontal(hor);
        triangle.makeVisible();
        
        Triangle triangle2 = new Triangle();
        triangle2.moveVertical(ver + 20);
        triangle2.moveHorizontal(hor);
        triangle2.makeVisible();
        
        Triangle triangle3 = new Triangle();
        triangle3.moveVertical(ver + 40);
        triangle3.moveHorizontal(hor);
        triangle3.makeVisible();
        
        Square stump = new Square();
        stump.moveVertical(ver + 60);
        stump.moveHorizontal(hor - 5);
        stump.changeSize(10);
        stump.changeColor("brown");
        stump.makeVisible();*/
        
    }
}
