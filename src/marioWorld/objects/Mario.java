package marioWorld.objects;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 20/08/17.
 */
public class Mario extends GameObject {

    public Mario(){
        imageIcon = new ImageIcon("/sprites/marioStopDown.png");
    }

    @Override
    public Image getImage() {
        image = imageIcon.getImage();
        return image;
    }
}
