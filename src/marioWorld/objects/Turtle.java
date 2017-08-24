package marioWorld.objects;

import marioWorld.display.ImageLoader;

/**
 * Created by andres on 24/08/17.
 */
public class Turtle extends GameObject {
    public Turtle(){
        image = ImageLoader.loadImage("/sprites/shell.png");
    }
}
