package marioWorld.objects;

import marioWorld.MarioWorld;
import marioWorld.controllers.Moves;
import marioWorld.display.Sprite;

import java.awt.*;

/**
 * Created by andres on 20/08/17.
 */

/**
 * Game Objects abstract class
 */
public abstract class GameObject {

    protected MarioWorld world; // World instance
    protected int x;
    protected int y;
    protected Image image; //Object image
    protected Sprite nextSprite = null; // Next sprite to perform movement
    protected Sprite previousSprite = null; // Previous sprite after move
    protected boolean isSolid = false; // Object state

    public GameObject(MarioWorld world, int x, int y) { // Constructor
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public GameObject(){} // Empty constructor for static objects

    public void setNextSprite(Sprite nextSprite) { // Setter
        this.nextSprite = nextSprite;
    }

    public void setPreviousSprite(Sprite previousSprite) { // Setter
        this.previousSprite = previousSprite;
    }

    public Image getImage() {
        return image;
    }

    public abstract void move(Moves move); // Move abstract method

    protected void setNextSprite(Moves move){ // Setter
        switch (move){
            case up:
                this.setNextSprite(world.getSprite(this.x - 1, this.y));
                break;
            case down:
                this.setNextSprite(world.getSprite(this.x + 1, this.y));
                break;
            case left:
                this.setNextSprite(world.getSprite(this.x, this.y - 1));
                break;
            case right:
                this.setNextSprite(world.getSprite(this.x, this.y + 1));
                break;
        }
    }

    public void setX(int x) { // Setter
        this.x = x;
    }

    public void setY(int y) { // Setter
        this.y = y;
    }
}
