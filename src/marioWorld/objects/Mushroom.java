package marioWorld.objects;

import marioWorld.display.ImageLoader;

import java.awt.*;

/**
 * Created by andres on 21/08/17.
 */
public class Mushroom extends GameObject {

    public Mushroom(){
        image = ImageLoader.loadImage("/sprites/mushroom.png");
    }

}
