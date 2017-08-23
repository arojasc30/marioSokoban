package marioWorld.display;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 21/08/17.
 */
public class GameMenuDraw extends JPanel {

    public GameMenuDraw(){}

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(ImageLoader.loadImage("/images/sky.png"), 0, 0, null );
        g.drawImage(ImageLoader.loadImage("/images/mariologo.png"), 120, 200, null );
        g.drawImage(ImageLoader.loadImage("/images/sokobanlogo.png"), 220, 330, null );
    }
}
