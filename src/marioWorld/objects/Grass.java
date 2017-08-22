package marioWorld.objects;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 21/08/17.
 */
public class Grass extends GameObject {

    public Grass(){
        imageIcon = new ImageIcon("/sprites/grass.png");
    }

    @Override
    public Image getImage() {
        image = imageIcon.getImage();
        return image;
    }

}
