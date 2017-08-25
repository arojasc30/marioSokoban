package marioWorld;

/**
 * Created by andres on 21/08/17.
 */
public class WorldController {
    
    private int worldLevel = 3;
    public int mushrooms;
    private boolean lastWorld = false;
    private MarioWorld marioWorld;

    private int[][] world;

    public WorldController(MarioWorld marioWorld){
        this.marioWorld = marioWorld;
        world = createWorld();
    }

    private int[][] createWorld(){
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
        }
        return world;
    }

    public void nextWorld(){
        worldLevel++;
        if (worldLevel > 3){
            lastWorld = true;
            worldLevel = 1;
        }
        world = createWorld();
        marioWorld.setWorldDisplay();
    }

    public void setWorldLevel(int worldLevel) {
        this.worldLevel = worldLevel;
    }

    public int getWorldLevel() {
        return worldLevel;
    }

    public boolean isLastWorld() {
        return lastWorld;
    }

    public void setLastWorld(boolean lastWorld) {
        this.lastWorld = lastWorld;
    }

    public int[][] getWorld() {
        return world;
    }
}
