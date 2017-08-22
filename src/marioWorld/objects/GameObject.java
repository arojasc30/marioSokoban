package marioWorld.objects;

import marioWorld.display.Sprite;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 20/08/17.
 */
public abstract class GameObject {

    protected Sprite sprite;

    protected ImageIcon imageIcon;
    protected Image image;

    public GameObject(){}

    public void setSprite(Sprite sprite){
        this.sprite = sprite;
    }

    public Sprite getSprite(){
        return sprite;
    }

    public abstract Image getImage();
    //public abstract void move();

}
