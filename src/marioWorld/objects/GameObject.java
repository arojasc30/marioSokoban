package marioWorld.objects;

import marioWorld.MarioWorld;
import marioWorld.controllers.Moves;
import marioWorld.display.Sprite;

import java.awt.*;

/**
 * Created by andres on 20/08/17.
 */
public abstract class GameObject {

    protected MarioWorld world;
    protected int x;
    protected int y;
    protected Image image;
    protected Sprite nextSprite = null;
    protected Sprite previousSprite = null;

    public GameObject(MarioWorld world, int x, int y) {
        this.world = world;
        this.x = x;
        this.y = y;
    }

    public GameObject(){}

    public Sprite getNextSprite() {
        return nextSprite;
    }

    public void setNextSprite(Sprite nextSprite) {
        this.nextSprite = nextSprite;
    }

    public Sprite getPreviousSprite() {
        return previousSprite;
    }

    public void setPreviousSprite(Sprite previousSprite) {
        this.previousSprite = previousSprite;
    }

    public Image getImage() {
        return image;
    }

    public abstract void move(Moves move);

    protected void setMove(Moves move){
        switch (move){
            case up:
                this.x -= 1;
                this.setNextSprite(world.getSprite(this.x, this.y));
                break;
            case down:
                this.x += 1;
                this.setNextSprite(world.getSprite(this.x, this.y));
                break;
            case left:
                this.y -= 1;
                this.setNextSprite(world.getSprite(this.x, this.y));
                break;
            case right:
                this.y += 1;
                this.setNextSprite(world.getSprite(this.x, this.y));
                break;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
