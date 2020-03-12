package com.tiwson.planegame;

import java.awt.*;

public class HeroPlane extends FlyObject {
    public HeroPlane() {
        img = AppTools.getImage("/img/hero.png");
        x = 150-img.getWidth()/2;
        y = 500-img.getHeight()*2;
        w = img.getWidth();
        h = img.getHeight();
    }

    public void draw(Graphics g) {
        g.drawImage(img,x,y,w,h,null);
    }
}
