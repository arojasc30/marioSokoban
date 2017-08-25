package marioWorld.controllers;

import marioWorld.GameState;
import marioWorld.MarioWorld;
import marioWorld.display.MarioFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by andres on 23/08/17.
 */

/**
 * Game key listener class
 */
public class KeyController implements KeyListener {

    private MarioWorld world; // Executed actions receivers
    private MarioFrame frame; //

    public KeyController(MarioWorld world, MarioFrame frame){ // Constructor
        this.world = world;
        this.frame = frame;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) { // Key pressed actions executor
        int keycode = keyEvent.getKeyCode();

        //Walk
        if (keycode == KeyEvent.VK_UP) {
            world.getMario().move(Moves.up);
        }
        if (keycode == KeyEvent.VK_DOWN) {
            world.getMario().move(Moves.down);
        }
        if (keycode == KeyEvent.VK_LEFT) {
            world.getMario().move(Moves.left);
        }
        if (keycode == KeyEvent.VK_RIGHT) {
            world.getMario().move(Moves.right);
        }
        if (world.mushroomsCollected == world.getWorldController().mushrooms){
            world.getWorldController().nextWorld();
        }
        if (world.getWorldController().isLastWorld()){
            world.getWorldController().setLastWorld(false);
            frame.gameStateController(GameState.menu);
        }
        world.repaint();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
