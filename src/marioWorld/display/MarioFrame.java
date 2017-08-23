package marioWorld.display;

import marioWorld.GamePanel;
import marioWorld.GameState;
import marioWorld.MarioWorld;
import marioWorld.GameMenu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 19/08/17.
 */
public class MarioFrame extends JFrame {

    private JPanel gamePanel;
    private JPanel gameMenu;

    private static final int FRAME_WIDTH = 750;
    private static final int FRAME_HEIGHT = 640;
    public static final int WORLD_DIMENSION = 640;

    private GameState state = GameState.menu;

    public MarioFrame(){
        createFrame();
        gameStateController(state);
    }

    private void createFrame(){
        gameMenu = new GameMenu(this);
        gamePanel = new GamePanel(this);
        this.setLayout(new BorderLayout());
        this.setTitle("Super Mario World 2D");
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
        this.remove(gamePanel);
        this.add(gameMenu);
        this.validate();
        this.repaint();
    }

    private void setGameDisplay(){
        this.remove(gameMenu);
        this.setFocusable(false);
        this.add(gamePanel);
        this.validate();
        this.repaint();
    }

    public GameState getGameState() {
        return state;
    }

    public void quitgame(){
        this.dispose();
    }

}
