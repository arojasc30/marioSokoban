package marioWorld.display;


import marioWorld.objects.GameObject;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 20/08/17.
 */
public class Sprite {

    protected GameObject object;
    protected ImageIcon imageIcon;
    protected Image image;

    public Sprite(){

    }

    public void setObject(GameObject object){
        this.object = object;
        Sprite lastSprite = object.getSprite();

        if (lastSprite != null){
            lastSprite.clearObject();
        }
        object.setSprite(this);
    }

    public GameObject getObject(){
        return this.object;
    }

    public void clearObject(){
        object = null;
    }

    public Image getImage(){
        this.imageIcon = new ImageIcon("/sprites/grass.png");
        this.image = imageIcon.getImage();
        return this.image;
    }



}
