package marioWorld.controllers;

import marioWorld.GamePanel;
import marioWorld.GameState;
import marioWorld.display.MarioFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by andres on 22/08/17.
 */

/**
 * Game click listener class
 */
public class WorldClickController implements ActionListener {

    private MarioFrame frame; // Executed actions receivers
    private GamePanel panel; //

    public WorldClickController(MarioFrame frame, GamePanel panel){ // Constructor
        this.frame = frame;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) { //Listening override method
        if (actionEvent.getSource() == panel.menu){
            frame.gameStateController(GameState.menu);
        }
        if (actionEvent.getSource() == panel.restart){
            panel.getDrawPanel().restart();
        }
    }

}
