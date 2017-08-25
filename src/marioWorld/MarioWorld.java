package marioWorld;

import marioWorld.display.*;
import marioWorld.objects.*;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 20/08/17.
 */

/**
 * Game world constructor class
 */
public class MarioWorld extends JPanel {

    private static final int rows = 16; // World matrix dimensions
    private static final int columns = 16; //

    private Sprite[][] sprites; // World sprites array

    private Mario mario; // Main player character
    protected WorldController worldController; // World controller

    public int mushroomsCollected; // Counter for level mushrooms

    public MarioWorld(){ // Constructor
        sprites = new Sprite[rows][columns];

        worldController = new WorldController(this);

        setWorldDisplay();
        setFocusable(true);
    }

    protected void setWorldDisplay(){ // World constructor method, sets the sprites array with game objects
        mushroomsCollected = 0;
        for (int x = 0; x < rows; x++){
            for (int y =0 ; y < columns; y++){
                sprites[x][y] = new Sprite(x, y);

                if (worldController.getWorld()[x][y] == 1){
                    sprites[x][y].inUse = true;
                    sprites[x][y].setObject(new Rocks());
                    sprites[x][y].hasObject = true;
                }
                if (worldController.getWorld()[x][y] == 2){
                    sprites[x][y].inUse = true;
                }
                if (worldController.getWorld()[x][y] == 3){
                    sprites[x][y].inUse = true;
                    sprites[x][y].setObject(new Goomba());
                    sprites[x][y].hasObject = true;
                }
                if (worldController.getWorld()[x][y] == 4){
                    sprites[x][y].inUse = true;
                    sprites[x][y].setObject(new Turtle(this, x, y));
                    sprites[x][y].hasObject = true;
                }
                if (worldController.getWorld()[x][y] == 8){
                    sprites[x][y].inUse = true;
                    mario = new Mario(this, x, y);
                    sprites[x][y].setObject(mario);
                    sprites[x][y].hasObject = true;
                }
            }
        }
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics g) { // World rendering method
        g.drawImage(ImageLoader.loadImage("/images/sky.png"), 0, 0, null);
        for (int x = 0; x < rows; x++){
            for (int y = 0; y< columns; y++){
                if (sprites[y][x].getObject() != null){
                    g.drawImage(this.sprites[y][x].getTexture(), x * 40, y * 40, null);
                    g.drawImage(this.sprites[y][x].getObject().getImage(), x * 40, y * 40, null);
                }else {
                    if (sprites[y][x].inUse){
                        g.drawImage(this.sprites[y][x].getTexture(), x * 40, y * 40, null);
                    }
                }
            }
        }
    }

    public Sprite getSprite(int x, int y) { // Getter
        return sprites[x][y];
    }

    public WorldController getWorldController() { // Getter
        return worldController;
    }

    public Mario getMario() { // Getter
        return mario;
    }

    public void restart(){ // Level reset method
        setWorldDisplay();

    }
}
