package com.tiwson.planegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel {
    BufferedImage background;
    HeroPlane hero;

    public GamePanel(Frame frame) {
        //获取背景图片
        background = AppTools.getImage("/img/bg.jpg");
        hero = new HeroPlane();
        MouseAdapter madapter = new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                hero.x = e.getX() - hero.w/2;
                hero.y = e.getY() - hero.h/2;
                repaint();
            }
        };
        addMouseListener(madapter);
        addMouseMotionListener(madapter);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画背景图片
        g.drawImage(background,0,0,300,500,null);
        //画英雄机
        //g.drawImage(hero.img,hero.x,hero.y,hero.w,hero.h,null);
        hero.draw(g);

    }


}
