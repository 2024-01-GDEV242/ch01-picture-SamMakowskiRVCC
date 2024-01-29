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
    private Square hut2;
    private Square hut3;
    private Circle hutdome;
    private Square sandcutoff;
    private Square sandcutoff2;
    private Square sandcutoff3;
    private Triangle sandmound;
    private Square moisturizer;
    private Square moistsky1;
    private Square moistsky2;
    private Square moist1;
    private Square moist2;
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
        hut2 = new Square();
        hut3 = new Square();
        hutdome = new Circle();
        sandcutoff = new Square();
        sandcutoff2 = new Square();
        sandcutoff3 = new Square();
        sandmound = new Triangle();
        moisturizer = new Square();
        moistsky1 = new Square();
        moistsky2 = new Square();
        moist1 = new Square();
        moist2 = new Square();
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
            bluesky.moveHorizontal(-320);
            bluesky.moveVertical(-400);
            bluesky.changeSize(800);
            bluesky.makeVisible();
            
            mgntasky.changeColor("magenta");
            mgntasky.moveHorizontal(-320);
            mgntasky.moveVertical(-730);
            mgntasky.changeSize(800);
            mgntasky.makeVisible();
            
            orangsky.changeColor("red");
            orangsky.moveHorizontal(-320);
            orangsky.moveVertical(-770);
            orangsky.changeSize(800);
            orangsky.makeVisible();
            
            basesand.changeColor("yellow");
            basesand.moveHorizontal(-320);
            basesand.moveVertical(100);
            basesand.changeSize(800);
            basesand.makeVisible();
            
            blackbase.changeColor("black");
            blackbase.moveHorizontal(-320);
            blackbase.moveVertical(130);
            blackbase.changeSize(800);
            blackbase.makeVisible();
            
            blackmound.changeColor("black");
            blackmound.changeSize(60, 180);
            blackmound.moveHorizontal(320);
            blackmound.moveVertical(80);
            blackmound.makeVisible();
            
            hut.changeColor("yellow");
            hut.moveHorizontal(-150);
            hut.moveVertical(140);
            hut.changeSize(100);
            hut.makeVisible();
            
            hut2.changeColor("yellow");
            hut2.moveHorizontal(-250);
            hut2.moveVertical(140);
            hut2.changeSize(100);
            hut2.makeVisible();
            
            hut3.changeColor("yellow");
            hut3.moveHorizontal(-340);
            hut3.moveVertical(140);
            hut3.changeSize(100);
            hut3.makeVisible();
            
            hutdome.changeColor("yellow");
            hutdome.moveHorizontal(-230);
            hutdome.moveVertical(70);
            hutdome.changeSize(200);
            hutdome.makeVisible();

            sandcutoff.changeColor("yellow");
            sandcutoff.moveHorizontal(-40);
            sandcutoff.moveVertical(140);
            sandcutoff.changeSize(100);
            sandcutoff.makeVisible();
            
            sandcutoff2.changeColor("yellow");
            sandcutoff2.moveHorizontal(60);
            sandcutoff2.moveVertical(140);
            sandcutoff2.changeSize(600);
            sandcutoff2.makeVisible();
            
            sandcutoff3.changeColor("yellow");
            sandcutoff3.moveHorizontal(-320);
            sandcutoff3.moveVertical(250);
            sandcutoff3.changeSize(800);
            sandcutoff3.makeVisible();
            
            sandmound.changeColor("yellow");
            sandmound.changeSize(60, 180);
            sandmound.moveHorizontal(320);
            sandmound.moveVertical(86);
            sandmound.makeVisible();
            
            moisturizer.changeColor("black");
            moisturizer.changeSize(30);
            moisturizer.moveHorizontal(380);
            moisturizer.moveVertical(60);
            moisturizer.makeVisible();
            
            moistsky1.changeColor("blue");
            moistsky1.changeSize(30);
            moistsky1.moveHorizontal(378);
            moistsky1.moveVertical(60);
            moistsky1.makeVisible();
            
            moistsky2.changeColor("magenta");
            moistsky2.changeSize(30);
            moistsky2.moveHorizontal(378);
            moistsky2.moveVertical(40);
            moistsky2.makeVisible();
            
            moist1.changeColor("black");
            moist1.changeSize(14);
            moist1.moveHorizontal(403);
            moist1.moveVertical(90);
            moist1.makeVisible();
            
            moist2.changeColor("black");
            moist2.changeSize(20);
            moist2.moveHorizontal(400);
            moist2.moveVertical(104);
            moist2.makeVisible();
            
            whitesun.changeColor("white");
            whitesun.moveHorizontal(340);
            whitesun.moveVertical(40);
            whitesun.changeSize(30);
            whitesun.makeVisible();

            redsun.changeColor("red");
            redsun.moveHorizontal(380);
            redsun.moveVertical(95);
            redsun.changeSize(30);
            redsun.makeVisible();
            
            luke.changeColor("white");
            luke.moveHorizontal(100);
            luke.moveVertical(20);
            luke.changeSize(75,35);
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
