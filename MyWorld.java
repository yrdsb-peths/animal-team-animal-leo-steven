import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() 
    {
        super(600, 400, 1);
    }
    
    /**
     * Game over
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game over", 100);
        addObject(gameOverLabel, 300, 200);
    }

    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);        
    }
}
//comment
