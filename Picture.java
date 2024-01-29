/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square bluesky;
    private Square mgntasky;
    private Square orangsky;
    private Square basesand;
    private Square blackbase;
    private Triangle blackmound;
    private Square hut;
    private Circle hutdome;
    private Square sandcutoff;
    private Square sandcutoff2;
    private Square sandcutoff3;
    private Triangle sandmound;
    private Square moisturizer;
    private Square moist1;
    private Circle whitesun;
    private Circle redsun;
    private Person luke;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        bluesky = new Square();
        mgntasky = new Square();
        orangsky = new Square();
        basesand = new Square();
        blackbase = new Square();
        blackmound = new Triangle(); 
        hut = new Square();
        hutdome = new Circle();
        sandcutoff = new Square();
        sandcutoff2 = new Square();
        sandcutoff3 = new Square();
        sandmound = new Triangle();
        moisturizer = new Square();
        moist1 = new Square();
        whitesun = new Circle();
        redsun = new Circle();
        luke = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            bluesky.changeColor("blue");
            bluesky.moveHorizontal(-140);
            bluesky.moveVertical(20);
            bluesky.changeSize(120);
            bluesky.makeVisible();
            
            mgntasky.changeColor("purple");
            mgntasky.moveHorizontal(-140);
            mgntasky.moveVertical(20);
            mgntasky.changeSize(120);
            mgntasky.makeVisible();
            
            orangsky.changeColor("orange");
            orangsky.moveHorizontal(-140);
            orangsky.moveVertical(20);
            orangsky.changeSize(120);
            orangsky.makeVisible();
            
            basesand.changeColor("yellow");
            basesand.moveHorizontal(-140);
            basesand.moveVertical(20);
            basesand.changeSize(120);
            basesand.makeVisible();
            
            blackbase.changeColor("black");
            blackbase.moveHorizontal(-120);
            blackbase.moveVertical(40);
            blackbase.changeSize(40);
            blackbase.makeVisible();
            
            blackmound.changeColor("black");
            blackmound.changeSize(60, 180);
            blackmound.moveHorizontal(20);
            blackmound.moveVertical(-60);
            blackmound.makeVisible();
            
            hut.changeColor("yellow");
            hut.moveHorizontal(-120);
            hut.moveVertical(40);
            hut.changeSize(40);
            hut.makeVisible();
            
            hutdome.changeColor("yellow");
            hutdome.moveHorizontal(-120);
            hutdome.moveVertical(40);
            hutdome.changeSize(40);
            hutdome.makeVisible();

            sandcutoff.changeColor("yellow");
            sandcutoff.moveHorizontal(-120);
            sandcutoff.moveVertical(40);
            sandcutoff.changeSize(40);
            sandcutoff.makeVisible();
            
            sandcutoff2.changeColor("yellow");
            sandcutoff2.moveHorizontal(-120);
            sandcutoff2.moveVertical(40);
            sandcutoff2.changeSize(40);
            sandcutoff2.makeVisible();
            
            sandcutoff3.changeColor("yellow");
            sandcutoff3.moveHorizontal(-120);
            sandcutoff3.moveVertical(40);
            sandcutoff3.changeSize(40);
            sandcutoff3.makeVisible();
            
            sandmound.changeColor("black");
            sandmound.changeSize(60, 180);
            sandmound.moveHorizontal(20);
            sandmound.moveVertical(-60);
            sandmound.makeVisible();
            
            moisturizer.changeColor("black");
            moisturizer.changeSize(60);
            moisturizer.moveHorizontal(20);
            moisturizer.moveVertical(-60);
            moisturizer.makeVisible();
            
            moist1.changeColor("black");
            moist1.changeSize(60);
            moist1.moveHorizontal(20);
            moist1.moveVertical(-60);
            moist1.makeVisible();
            
            whitesun.changeColor("white");
            whitesun.moveHorizontal(100);
            whitesun.moveVertical(-40);
            whitesun.changeSize(80);
            whitesun.makeVisible();

            redsun.changeColor("red");
            redsun.moveHorizontal(100);
            redsun.moveVertical(-40);
            redsun.changeSize(80);
            redsun.makeVisible();
            
            luke.changeColor("white");
            luke.moveHorizontal(100);
            luke.moveVertical(-40);
            luke.changeSize(80,75);
            luke.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        
    }
}
