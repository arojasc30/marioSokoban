package marioWorld.controllers;

import marioWorld.GamePanel;
import marioWorld.GameState;
import marioWorld.MarioWorld;
import marioWorld.display.MarioFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by andres on 22/08/17.
 */
public class WorldClickController implements ActionListener {

    private MarioFrame frame;
    private GamePanel panel;

    public WorldClickController(MarioFrame frame, GamePanel panel){
        this.frame = frame;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == panel.menu){
            frame.gameStateController(GameState.menu);
        }
//        if (actionEvent.getSource() == world.restart){
//            frame.gameStateController(GameState.menu);
//        }
    }

}
