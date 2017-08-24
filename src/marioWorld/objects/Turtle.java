package marioWorld.objects;

import marioWorld.MarioWorld;
import marioWorld.controllers.Moves;
import marioWorld.display.ImageLoader;
import marioWorld.display.Sprite;

/**
 * Created by andres on 24/08/17.
 */
public class Turtle extends GameObject {
    public Turtle(MarioWorld world, int x, int y){
        super(world, x, y);
        image = ImageLoader.loadImage("/sprites/shell.png");
    }

    @Override
    public void move(Moves move) {
        Sprite currentSprite = world.getSprite(this.x, this.y);
        this.setNextSprite(move);
        if (this.nextSprite.hasObject){
            if (!(this.nextSprite.getObject().isSolid)){
                this.nextSprite.setObject(this);
                this.setPreviousSprite(currentSprite);
                currentSprite.clearObject();
            }
        }else {
            this.nextSprite.setObject(this);
            this.setPreviousSprite(currentSprite);
            currentSprite.clearObject();
        }
    }

}
