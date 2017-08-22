package marioWorld.display;

import marioWorld.objects.Mushroom;

/**
 * Created by andres on 21/08/17.
 */
public class GoombaSpot extends Sprite {

    public GoombaSpot(){}

    public GoombaSpot(Sprite sprite){
        this.object = sprite.getObject();
    }

    public boolean hasMushroom(){
        if (this.getObject() instanceof Mushroom){
            return true;
        }
        return false;
    }

}
