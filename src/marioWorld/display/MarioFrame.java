package marioWorld.display;

import marioWorld.GamePanel;
import marioWorld.GameState;
import marioWorld.GameMenu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andres on 19/08/17.
 */

/**
 * Frame manager class
 *
 * Initialize and set the game frame
 */
public class MarioFrame extends JFrame {

    private JPanel gameMenu; // Starting layout, contains Play and Quit buttons, and game image
    private JPanel gamePanel; // On game layout, contains Restart and Menu buttons, and game display


    private static final int FRAME_WIDTH = 750; // Frame Dimensions
    private static final int FRAME_HEIGHT = 640; //

    private GameState state = GameState.menu;

    public MarioFrame(){ //Frame Constructor
        createFrame();
        gameStateController(state);
    }

    private void createFrame(){ // Method that sets the frame features
        gameMenu = new GameMenu(this);
        gamePanel = new GamePanel(this);
        this.setLayout(new BorderLayout());
        this.setTitle("Super Mario World - SokobanStyle");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void gameStateController(GameState state){ // Game state manager method {SWITCH}-(menu, game)
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

    private void setMenuDisplay(){ // Sets and print the menu state display
        this.remove(gamePanel);
        this.add(gameMenu);
        this.validate();
        this.repaint();
    }

    public void setGameDisplay(){ // Sets and print the game state display
        this.remove(gameMenu);
        this.setFocusable(false);
        this.add(gamePanel);
        gamePanel.grabFocus();
        this.validate();
        this.repaint();
    }

    public void quitgame(){ // Close the entire program
        this.dispose();
    }

}
