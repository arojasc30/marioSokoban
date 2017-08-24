package marioWorld.display;


import marioWorld.objects.GameObject;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 20/08/17.
 */
public class Sprite {

    protected GameObject object;
    protected Image texture;

    public Sprite(){
        this.texture = ImageLoader.loadImage("/sprites/grass.png");
    }

    public void setObject(GameObject object){
        this.object = object;
    }

    public GameObject getObject(){
        return this.object;
    }

    public Image getTexture() {
        return texture;
    }
}
