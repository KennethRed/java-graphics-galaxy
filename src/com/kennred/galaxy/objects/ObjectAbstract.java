package com.kennred.galaxy.objects;

import java.awt.*;
import java.util.ArrayList;

public abstract class ObjectAbstract {

    public String name;
    public String type;

    ArrayList<ObjectAbstract> objects = new ArrayList<>();

    public int circumference;
    public int xPosition;
    public int yPosition;

    final String TYPE_GALAXY = "Galaxy";
    final String TYPE_PLANET = "Planet";
    final String TYPE_STAR   = "Star";

    public void build() {

    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCircumference() {
        return circumference;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public String getType() {

        if (type == null) {
            return "object";
        }

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<ObjectAbstract> getObjects() {
        return objects;
    }

    public void addObject(ObjectAbstract object) {
        this.objects.add(object);
    }

    public void draw(Graphics g) {

        if (this.getType().equals(this.TYPE_GALAXY)) {
            // do nothing
        }


        if (this.getType().equals(this.TYPE_STAR)) {
            g.setColor(Color.yellow);
            // fill in the line to prevent background stars shining through
            g.fillOval(xPosition - (this.getCircumference() / 2), yPosition - (this.getCircumference() / 2), circumference, circumference);
        }

        if (this.getType().equals(this.TYPE_PLANET)) {

            g.setColor(Color.black);
            // fill in the shape to prevent background stars shining through
            g.fillOval(xPosition - (this.getCircumference() / 2), yPosition - (this.getCircumference() / 2), circumference, circumference);

            g.setColor(Color.white);
            // then draw the line
            g.drawOval(xPosition - (this.getCircumference() / 2), yPosition - (this.getCircumference() / 2), circumference, circumference);


        }





            // add the object name to the top left of the planet
            if (this.getName() != null) {
                g.drawString(
                        this.getName(),
                        this.getxPosition() - (this.getCircumference() / 2),
                        this.getyPosition() - (this.getCircumference() / 2)
                );
            }

        this.debug();

        for (ObjectAbstract object : this.getObjects()) {
            object.draw(g);
        }

    }

    public void debug() {
        System.out.println("name: " + this.getName());
        System.out.println("- circumference: " + this.getCircumference());
        System.out.println("- type: " + this.getType());
        System.out.println("- coordinates: " + this.getxPosition() + "," + this.getyPosition());
        System.out.println();
    }

}
