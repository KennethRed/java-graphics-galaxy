package com.kennred;

import javax.swing.*;

public class GalaxyApplication extends JFrame {

    GraphicsPanel graphicsPanel;

    GalaxyApplication() {
        graphicsPanel = new GraphicsPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(graphicsPanel);
        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
