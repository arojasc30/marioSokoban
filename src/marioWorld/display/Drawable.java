package marioWorld.display;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 21/08/17.
 */
public class Drawable extends JPanel {

    public Drawable(){}

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(ImageLoader.loadImage("/images/sky.png"), 0, 0, null );
    }
}
