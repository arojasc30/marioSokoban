package marioWorld;

import marioWorld.display.GoombaSpot;
import marioWorld.display.MarioFrame;
import marioWorld.display.Sprite;
import marioWorld.objects.Grass;
import marioWorld.objects.Mario;
import marioWorld.objects.Rocks;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by andres on 20/08/17.
 */
public class MarioWorld extends JPanel {

    private static final int rows = 16;
    private static final int columns = 16;
    private ImageIcon sky;

    private Sprite[][] sprites;
    private ArrayList<GoombaSpot> goombas;

    private Mario mario;
    private WorldController worldController;

    private boolean gameFinished = false;

    public MarioWorld(){
        sprites = new Sprite[rows][columns];
        sky = new ImageIcon("/images/sky.png");

        mario = new Mario();
        worldController = new WorldController();



    }

    private void setWorldDisplay(){
        goombas = new ArrayList<>();

        for (int x = 0; x < rows; x++){
            for (int y =0 ; y < columns; y++){
                sprites[x][y] = new Sprite();

                if (worldController.getWorld()[x][y] == 1){
                    sprites[x][y].setObject(new Rocks());
                }
                if (worldController.getWorld()[x][y] == 2){
                    sprites[x][y].setObject(new Grass());
                }
                if (worldController.getWorld()[x][y] == 3){
                    sprites[x][y] = new GoombaSpot();
                    goombas.add((GoombaSpot) sprites[x][y]);
                }
                if (worldController.getWorld()[x][y] == 8){
                    sprites[x][y].setObject(mario);
                }
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(sky.getImage(), 0,0, MarioFrame.WORLD_DIMENSION, MarioFrame.WORLD_DIMENSION, this);
//        for (int x = 0; x < rows; x++){
//            for (int y = 0; y< columns; y++){
//                g.drawImage(sprites[x][y].getImage(), x * 40, y * 40, this);
//            }
//        }
    }
}
