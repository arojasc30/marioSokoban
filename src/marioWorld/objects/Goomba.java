package marioWorld.objects;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 20/08/17.
 */
public class Goomba extends GameObject {

    public Goomba(){
        imageIcon = new ImageIcon("/sprites/goomba.png");
    }

    @Override
    public Image getImage() {
        image = imageIcon.getImage();
        return image;
    }

}
