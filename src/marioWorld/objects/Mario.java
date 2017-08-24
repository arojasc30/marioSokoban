package marioWorld.objects;

import marioWorld.controllers.Moves;
import marioWorld.display.ImageLoader;

/**
 * Created by andres on 20/08/17.
 */
public class Mario extends GameObject {


    public Mario(){
        setMarioView(Moves.down);
        //image = ImageLoader.loadImage("/sprites/marioStopDown.png");

    }

    public void setMarioView(Moves move){
        switch (move){
            case up:
                image = ImageLoader.loadImage("/sprites/marioStopUp.png");
                break;
            case down:
                image = ImageLoader.loadImage("/sprites/marioStopDown.png");
                break;
            case left:
                image = ImageLoader.loadImage("/sprites/marioStopLeft.png");
                break;
            case right:
                image = ImageLoader.loadImage("/sprites/marioStopRight.png");
                break;
        }
    }

    public void move(Moves move){
        setMarioView(move);
    }

}
