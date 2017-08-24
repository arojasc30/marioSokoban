package marioWorld.objects;

import marioWorld.controllers.Moves;
import marioWorld.display.ImageLoader;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 21/08/17.
 */
public class Rocks extends GameObject {

    public Rocks(){
        this.isSolid = true;
        image = ImageLoader.loadImage("/sprites/rocks.png");
    }

    @Override
    public void move(Moves move) {

    }

}
