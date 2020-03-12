package com.tiwson.planegame;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class FlyObject {
    int x;
    int y;
    int w;
    int h;
    BufferedImage img;

    public abstract void draw(Graphics g);
}
