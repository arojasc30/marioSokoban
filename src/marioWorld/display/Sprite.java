package marioWorld.display;


import marioWorld.objects.GameObject;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 20/08/17.
 */
public class Sprite {

    protected int spriteX;
    protected int spriteY;
    protected GameObject object;
    protected Image texture;
    public boolean inUse = false;
    public boolean hasObject = false;

    public Sprite(int spriteX, int spriteY){
        this.spriteX = spriteX;
        this.spriteY = spriteY;
        this.texture = ImageLoader.loadImage("/sprites/grass.png");
    }

    public void setObject(GameObject object){
        this.object = object;
        this.hasObject = true;
        this.object.setX(spriteX);
        this.object.setY(spriteY);
    }

    public GameObject getObject(){
        return this.object;
    }



    public void clearObject(){
        object = null;
        this.hasObject = false;
    }

    public Image getTexture() {
        return texture;
    }
}
