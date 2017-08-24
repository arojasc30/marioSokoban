package marioWorld.objects;

import marioWorld.display.ImageLoader;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 21/08/17.
 */
public class Grass extends GameObject {

    public Grass(){
        image = ImageLoader.loadImage("/sprites/grass.png");
    }

}
