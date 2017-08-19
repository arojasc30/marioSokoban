package marioWorld.display;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 19/08/17.
 */
public class MarioFrame extends JFrame {

    //private MarioWorld world;

    private static final int FRAME_SIZE = 640;
    private static final int WORLD_DIMENSION = 640;

    public MarioFrame(){
        createFrame();
    }

    private void createFrame(){
        this.setLayout(new BorderLayout());
        this.setTitle("El Laberinto de Mario");
        this.setSize(FRAME_SIZE, FRAME_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


}
