package marioWorld.controllers;

import marioWorld.GameState;
import marioWorld.GameMenu;
import marioWorld.display.MarioFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by andres on 21/08/17.
 */

/**
 * Menu click listener class
 */
public class ClickController implements ActionListener {

    private MarioFrame frame; // Executed actions receivers
    private GameMenu menu; //

    public ClickController(MarioFrame frame, GameMenu menu){ // Constructor
        this.frame = frame;
        this.menu = menu;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) { //Listening override method
        if (actionEvent.getSource() == menu.play){
            frame.gameStateController(GameState.game);
        }
        if (actionEvent.getSource() == menu.quit){
            frame.quitgame();
        }
    }
}
