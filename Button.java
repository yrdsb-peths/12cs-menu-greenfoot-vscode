import greenfoot.*;

public abstract class Button extends Actor {
    boolean performed = false;

    public Button() {
        GreenfootImage image = new GreenfootImage("images/buttonLong_beige.png");
        setImage(image);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            if (!performed) {
                performed = true;
                perform();
            }
        }
    }

    public void perform() {
        System.out.println("Hello World");
    }
}
