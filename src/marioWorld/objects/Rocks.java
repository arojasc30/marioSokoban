package marioWorld.objects;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 21/08/17.
 */
public class Rocks extends GameObject {

    public Rocks(){
        imageIcon = new ImageIcon("/sprites/rocks.png");
    }

    @Override
    public Image getImage() {
        image = imageIcon.getImage();
        return image;
    }
}
