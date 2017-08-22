package marioWorld.display;

import marioWorld.GameState;
import marioWorld.MarioWorld;
import marioWorld.StartMenu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 19/08/17.
 */
public class MarioFrame extends JFrame {

    private MarioWorld world;
    private JPanel startMenu;

    private static final int FRAME_WIDTH = 750;
    private static final int FRAME_HEIGHT = 640;
    public static final int WORLD_DIMENSION = 640;

    private GameState state = GameState.menu;

    public MarioFrame(){
        createFrame();
        gameStateController(state);
    }

    private void createFrame(){
        startMenu = new StartMenu(this);
        this.setLayout(new BorderLayout());
        this.setTitle("El Laberinto de Mario");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void gameStateController(GameState state){
        switch (state){
            case menu:
                setMenuDisplay();
                break;
            case game:
                setGameDisplay();
                break;
            default:
                setMenuDisplay();
                break;
        }
    }

    private void setMenuDisplay(){
        if (world != null){
            this.remove(world);
        }
        this.add(startMenu);
        this.repaint();
    }

    private void setGameDisplay(){
        this.setFocusable(false);

        world = new MarioWorld();
        world.setPreferredSize(new Dimension(WORLD_DIMENSION, WORLD_DIMENSION));

        this.add(world, BorderLayout.CENTER);

        world.grabFocus();
        this.revalidate();
        this.repaint();
    }

}
