package marioWorld.display;


import marioWorld.objects.GameObject;

import java.awt.*;

/**
 * Created by andres on 20/08/17.
 */

/**
 * Game sprites class
 */
public class Sprite {

    protected int spriteX; // Sprite positions
    protected int spriteY; //
    protected GameObject object; // Sprite object
    protected Image texture; // Sprite texture (grass)
    public boolean inUse = false; // Boolean for sprites in use for each level
    public boolean hasObject = false; // Boolean for checking object

    public Sprite(int spriteX, int spriteY){ // Constructor
        this.spriteX = spriteX;
        this.spriteY = spriteY;
        this.texture = ImageLoader.loadImage("/sprites/grass.png");
    }

    public void setObject(GameObject object){ // Sets the sprite object and other variables
        this.object = object;
        this.hasObject = true;
        this.object.setX(spriteX);
        this.object.setY(spriteY);
    }

    public GameObject getObject(){ //Getter
        return this.object;
    }



    public void clearObject(){ // Clear the object from sprite
        object = null;
        this.hasObject = false;
    }

    public Image getTexture() { // //Getter
        return texture;
    }
}
