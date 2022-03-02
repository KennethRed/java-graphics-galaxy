package com.kennred.galaxy.objects;

public class Galaxy extends ObjectAbstract{

    final int STARS = 1;

    public Galaxy(){

        this.setType("Galaxy");
        this.setName("Our Galaxy");

        this.setCircumference(9001);

        for (int i = 0; i < STARS; i++) {

            ObjectAbstract star = new Star();
            star.setName("Star #"+ (i+1));

            // it's at the center.
            star.setxPosition(400);
            star.setyPosition(400);
            star.setCircumference(75);
            star.build();

            this.addObject(star);
        }

        this.build();
    }
}
