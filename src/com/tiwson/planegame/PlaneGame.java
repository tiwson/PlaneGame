package com.tiwson.planegame;

import javax.swing.*;

public class PlaneGame extends JFrame {
    public static void main(String[] args) {
        PlaneGame frame = new PlaneGame();
        GamePanel panel = new GamePanel(frame);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public PlaneGame() {
        setTitle("飞机大战");
        setSize(300,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
