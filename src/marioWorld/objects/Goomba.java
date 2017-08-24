package marioWorld.objects;

import marioWorld.display.ImageLoader;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 20/08/17.
 */
public class Goomba extends GameObject {

    public Goomba(){
        image = ImageLoader.loadImage("/sprites/goomba.png");
    }

}
