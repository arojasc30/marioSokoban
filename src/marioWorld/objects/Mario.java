package marioWorld.objects;

import marioWorld.MarioWorld;
import marioWorld.controllers.Moves;
import marioWorld.display.ImageLoader;
import marioWorld.display.Sprite;

/**
 * Created by andres on 20/08/17.
 */
public class Mario extends GameObject {

    public Mario(MarioWorld world, int x, int y){
        super(world, x, y);
        setMarioView(Moves.down);
    }

    public void setMarioView(Moves move){
        switch (move){
            case up:
                image = ImageLoader.loadImage("/sprites/marioStopUp.png");
                break;
            case down:
                image = ImageLoader.loadImage("/sprites/marioStopDown.png");
                break;
            case left:
                image = ImageLoader.loadImage("/sprites/marioStopLeft.png");
                break;
            case right:
                image = ImageLoader.loadImage("/sprites/marioStopRight.png");
                break;
        }
    }

    public void move(Moves move){
        Sprite currentSprite = this.world.getSprite(this.x, this.y);
        this.setMarioView(move);
        this.setNextSprite(move);
        if (this.nextSprite.hasObject) {
            if (this.nextSprite.getObject() instanceof Mushroom) {
                this.nextSprite.setObject(this);
                this.setPreviousSprite(currentSprite);
                currentSprite.clearObject();
                world.mushroomsCollected += 1;
                return;
            }else if (this.nextSprite.getObject() instanceof Goomba){
                world.restart();
            }else {
                this.nextSprite.getObject().move(move);
            }
        }

        if (!(this.nextSprite.hasObject)){
            this.nextSprite.setObject(this);
            this.setPreviousSprite(currentSprite);
            currentSprite.clearObject();
        }
    }

}
