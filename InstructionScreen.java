import greenfoot.*;

public abstract class InstructionScreen extends World {
  public InstructionScreen(String text) {
    super(600, 400, 1);

    // The text to show
    addObject(new Label(text, 30), 100, 200);

    // Back button
    addObject(new NavButton(), 100, 350);

    // Next button
    addObject(new NavButton(), 500, 350);
  }
}
