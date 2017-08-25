package marioWorld.controllers;

import marioWorld.MarioWorld;
import marioWorld.objects.Mario;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by andres on 23/08/17.
 */
public class KeyController implements KeyListener {

    private MarioWorld world;

    public KeyController(MarioWorld world){
        this.world = world;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
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
        world.repaint();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
