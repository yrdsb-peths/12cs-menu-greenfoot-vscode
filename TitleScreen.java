import greenfoot.*;

public class TitleScreen extends World {
  public TitleScreen() {
    super(600, 400, 1);

    addObject(new NavButton(), 300, 340);
  }
}