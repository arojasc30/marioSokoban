package marioWorld.display;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by andres on 21/08/17.
 */

/**
 * Load images class
 */
public class ImageLoader {

    public static BufferedImage loadImage(String path){ // Return given path image
        try {
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

}
