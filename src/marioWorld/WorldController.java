package marioWorld;

/**
 * Created by andres on 21/08/17.
 */

/**
 * Level Manager class
 */
public class WorldController {
    
    private int worldLevel = 1; // Level counter
    public int mushrooms; // Mushrooms variable for each level
    private boolean lastWorld = false; // Last world boolean listener
    private MarioWorld marioWorld; // World to export

    private int[][] world; // World int matrix

    public WorldController(MarioWorld marioWorld){ // Constructor
        this.marioWorld = marioWorld;
        world = createWorld();
    }

    private int[][] createWorld(){ // Sets the world matrix for each level by SWITCH
        switch (worldLevel){
            case 1:
                mushrooms = 4;
                world = new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 2, 1, 1, 1, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 1, 1, 4, 2, 4, 3, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 3, 2, 4, 8, 1, 1, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 1, 1, 1, 4, 1, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
                };
                break;
            case 2:
                mushrooms = 3;
                world = new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 8, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 2, 4, 4, 1, 0, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 1, 2, 4, 2, 1, 0, 1, 3, 1, 0, 0, 0},
                        {0, 0, 0, 0, 1, 1, 1, 2, 1, 1, 1, 3, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 3, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 2, 2, 2, 1, 2, 2, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
                };
                break;
            case 3:
                mushrooms = 4;
                world = new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 2, 2, 2, 2, 2, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 1, 1, 4, 1, 1, 1, 2, 2, 2, 1, 0, 0, 0},
                        {0, 0, 0, 1, 2, 8, 2, 4, 2, 2, 4, 2, 1, 0, 0, 0},
                        {0, 0, 0, 1, 2, 3, 3, 1, 2, 4, 2, 1, 1, 0, 0, 0},
                        {0, 0, 0, 1, 1, 3, 3, 1, 2, 2, 2, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
                };
                break;
            case 4:
                mushrooms = 7;
                world = new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0, 0, 0},
                        {0, 0, 0, 1, 2, 4, 1, 2, 2, 2, 4, 2, 1, 0, 0, 0},
                        {0, 0, 1, 1, 2, 2, 1, 2, 1, 1, 1, 1, 1, 1, 0, 0},
                        {0, 0, 1, 3, 4, 2, 3, 8, 2, 3, 3, 4, 3, 1, 0, 0},
                        {0, 0, 1, 1, 2, 1, 1, 4, 4, 1, 1, 1, 1, 1, 0, 0},
                        {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 4, 2, 1, 0, 0, 0},
                        {0, 0, 0, 1, 2, 2, 2, 2, 1, 2, 2, 2, 1, 0, 0, 0},
                        {0, 0, 0, 1, 1, 1, 2, 3, 1, 1, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
                };
                break;
            case 5:
                mushrooms = 8;
                world = new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                        {0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0, 0},
                        {0, 0, 1, 2, 2, 2, 2, 1, 4, 1, 1, 1, 2, 1, 0, 0},
                        {0, 0, 1, 2, 4, 1, 3, 2, 2, 2, 2, 1, 2, 1, 0, 0},
                        {0, 0, 1, 1, 3, 1, 1, 1, 2, 2, 2, 1, 2, 1, 0, 0},
                        {0, 0, 1, 2, 4, 3, 2, 1, 1, 1, 2, 1, 2, 1, 0, 0},
                        {0, 0, 1, 2, 2, 1, 2, 2, 2, 3, 3, 4, 3, 1, 0, 0},
                        {0, 0, 1, 2, 1, 1, 1, 4, 4, 1, 1, 1, 1, 1, 0, 0},
                        {0, 0, 1, 2, 2, 1, 2, 2, 2, 2, 4, 2, 1, 1, 0, 0},
                        {0, 0, 1, 1, 3, 1, 1, 2, 1, 2, 2, 2, 1, 1, 0, 0},
                        {0, 0, 1, 2, 4, 2, 2, 3, 1, 1, 1, 1, 1, 1, 0, 0},
                        {0, 0, 1, 8, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                        {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
                };
                break;
            case 6:
                mushrooms = 24;
                world = new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 1, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0},
                        {0, 1, 2, 1, 1, 1, 4, 1, 4, 1, 4, 1, 1, 2, 1, 0},
                        {0, 1, 2, 1, 3, 2, 4, 3, 2, 3, 2, 3, 1, 2, 1, 0},
                        {0, 1, 2, 4, 2, 3, 4, 2, 3, 2, 3, 2, 4, 2, 1, 0},
                        {0, 1, 2, 1, 3, 2, 4, 3, 4, 3, 2, 3, 1, 2, 1, 0},
                        {0, 1, 2, 4, 2, 3, 4, 4, 4, 4, 3, 2, 4, 2, 1, 0},
                        {0, 1, 2, 1, 3, 2, 4, 3, 4, 3, 2, 3, 1, 2, 1, 0},
                        {0, 1, 2, 4, 2, 3, 2, 3, 2, 4, 3, 2, 4, 2, 1, 0},
                        {0, 1, 2, 1, 3, 2, 3, 2, 3, 4, 2, 3, 1, 2, 1, 0},
                        {0, 1, 2, 1, 1, 4, 1, 4, 1, 4, 1, 1, 1, 2, 1, 0},
                        {0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
                };
                break;
        }
        return world;
    }

    public void nextWorld(){ // Sets next level - called after finish current level
        worldLevel++;
        if (worldLevel > 6){
            lastWorld = true;
            worldLevel = 1;
        }
        world = createWorld();
        marioWorld.setWorldDisplay();
    }

    public boolean isLastWorld() { // Getter
        return lastWorld;
    }

    public void setLastWorld(boolean lastWorld) { //Setter
        this.lastWorld = lastWorld;
    }

    public int[][] getWorld() { // Getter
        return world;
    }
}
