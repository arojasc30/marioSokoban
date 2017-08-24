package marioWorld.objects;

import marioWorld.MarioWorld;
import marioWorld.controllers.Moves;
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

    @Override
    public void move(Moves move) {

    }
}
