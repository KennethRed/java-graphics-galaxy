package com.kennred;

import com.kennred.galaxy.objects.Galaxy;
import com.kennred.galaxy.objects.ObjectAbstract;
import java.util.ArrayList; // import the ArrayList class

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GraphicsPanel extends JPanel {

    final int FPS = 144;

    final int TIMEOUT_IN_MS = (int) Math.ceil((double) 1000 / FPS);

    final int FLOW_AMOUNT = 44;

    ArrayList<ObjectAbstract> objects = new ArrayList<ObjectAbstract>();

    GraphicsPanel() {
        this.setPreferredSize(new Dimension(800, 800));
        this.setBackground(Color.black);
        this.createObjects();
//        new Timer(TIMEOUT_IN_MS, paintTimer).start();
    }

    public void paint(Graphics g) {

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;


        // lets add some distant stars...

        for (int i = 0; i < 567; i++) {

            Random random = new Random();
            Color randomColor = new Color(255,255,255, random.nextInt(0,255));
            g.setColor(randomColor);

            g.drawRect(random.nextInt(0,800),random.nextInt(0,800), 1,1);
        }
        g.setColor(Color.white);
        for (ObjectAbstract object : objects) {
            object.draw(g);
        }


        g.dispose();
    }

    private void createObjects(){
        objects.add(new Galaxy());
    }

}
