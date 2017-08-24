package marioWorld;

import marioWorld.display.*;
import marioWorld.objects.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by andres on 20/08/17.
 */
public class MarioWorld extends JPanel {

    private static final int rows = 16;
    private static final int columns = 16;

    private Sprite[][] sprites;

    private Mario mario;
    protected WorldController worldController;

    private boolean gameFinished = false;

    public MarioWorld(){
        sprites = new Sprite[rows][columns];

        worldController = new WorldController();

        setWorldDisplay();
        setFocusable(true);
    }

    private void setWorldDisplay(){
        for (int x = 0; x < rows; x++){
            for (int y =0 ; y < columns; y++){
                sprites[x][y] = new Sprite();

                if (worldController.getWorld()[x][y] == 1){
                    sprites[x][y].inUse = true;
                    sprites[x][y].setObject(new Rocks());
                }
                if (worldController.getWorld()[x][y] == 2){
                    sprites[x][y].setObject(new Grass());
                }
                if (worldController.getWorld()[x][y] == 3){
                    sprites[x][y].setObject(new Goomba());
                }
                if (worldController.getWorld()[x][y] == 4){
                    sprites[x][y].setObject(new Turtle(this, x, y));
                }
                if (worldController.getWorld()[x][y] == 8){
                    mario = new Mario(this, x, y);
                    sprites[x][y].setObject(mario);
                }
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(ImageLoader.loadImage("/images/sky.png"), 0, 0, null);
        for (int x = 0; x < rows; x++){
            for (int y = 0; y< columns; y++){
                if (sprites[y][x].getObject() != null){
                    g.drawImage(this.sprites[y][x].getTexture(), x * 40, y * 40, null);
                    g.drawImage(this.sprites[y][x].getObject().getImage(), x * 40, y * 40, null);
                }
            }
        }
    }

//    public void restart(){
//        this.setWorldDisplay();
//    }


    public Sprite getSprite(int x, int y) {
        return sprites[x][y];
    }

    public WorldController getWorldController() {
        return worldController;
    }

    public Mario getMario() {
        return mario;
    }
}
