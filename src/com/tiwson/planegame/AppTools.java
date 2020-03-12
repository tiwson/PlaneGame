package com.tiwson.planegame;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class AppTools {
    public static BufferedImage getImage(String path) {
        try {
            BufferedImage img = ImageIO.read(AppTools.class.getResource(path));
            return img;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
