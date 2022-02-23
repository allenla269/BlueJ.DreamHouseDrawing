
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square door;
    private Square wall2;
    private Square garage;
    private Square car1;
    private Square car2;
    private Circle wheel1;
    private Circle wheel2;
    private Square chimney;
    private Circle bush1;
    private Circle bush2;
    private Circle bush3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(80);
        sun.makeVisible();
        
        door = new Square();
        door.changeSize(30);
        door.makeVisible();
        door.changeColor("brown");
        door.moveHorizontal(70);
        door.moveVertical(150);
        
        wall2 = new Square();
        wall2.changeSize(70);
        wall2.makeVisible();
        wall2.changeColor("green");
        wall2.moveHorizontal(100);
        wall2.moveVertical(110);
        
        garage = new Square();
        garage.changeSize(50);
        garage.makeVisible();
        garage.changeColor("blue");
        garage.moveHorizontal(110);
        garage.moveVertical(130);

        car1 = new Square();
        car1.changeSize(20);
        car1.makeVisible();
        car1.changeColor("blue");
        car1.moveHorizontal(110);
        car1.moveVertical(200);
        
        car2 = new Square();
        car2.changeSize(20);
        car2.makeVisible();
        car2.changeColor("blue");
        car2.moveHorizontal(120);
        car2.moveVertical(200);
        
        wheel1 = new Circle();
        wheel1.changeSize(10);
        wheel1.makeVisible();
        wheel1.changeColor("black");
        wheel1.moveHorizontal(150);
        wheel1.moveVertical(206);
        
        wheel2 = new Circle();
        wheel2.changeSize(10);
        wheel2.makeVisible();
        wheel2.changeColor("black");
        wheel2.moveHorizontal(166);
        wheel2.moveVertical(206);
        
        chimney = new Square();
        chimney.changeSize(20);
        chimney.makeVisible();
        chimney.changeColor("yellow");
        chimney.moveHorizontal(10);
        chimney.moveVertical(50);
        
        bush1 = new Circle();
        bush1.changeSize(30);
        bush1.makeVisible();
        bush1.changeColor("green");
        bush1.moveHorizontal(40);
        bush1.moveVertical(155);
        
        bush2 = new Circle();
        bush2.changeSize(30);
        bush2.makeVisible();
        bush2.changeColor("green");
        bush2.moveHorizontal(0);
        bush2.moveVertical(155);
        
        bush3 = new Circle();
        bush3.changeSize(30);
        bush3.makeVisible();
        bush3.changeColor("green");
        bush3.moveHorizontal(20);
        bush3.moveVertical(155);
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            door.changeColor("black");
            wall2.changeColor("green");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("green");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            door.changeColor("black");
            wall2.changeColor("green");
        }
    }

}
