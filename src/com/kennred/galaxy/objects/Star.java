package com.kennred.galaxy.objects;

import java.util.Random;

public class Star extends ObjectAbstract {

    final int PLANETS = 9; // Legacy Pluto.

    Star(){

        this.setType("Star");

        for (int i = 0; i < PLANETS; i++) {

            Random random = new Random();

            int randomCircumference = random.nextInt(5,25);
            int randomXPosition = random.nextInt(0,800);
            int randomYPosition = random.nextInt(0,800);

            Planet planet = new Planet();

            planet.setName("Planet #" + (i+1));

            planet.setCircumference(randomCircumference);
            planet.setxPosition(randomXPosition);
            planet.setyPosition(randomYPosition);

            planet.build();

            this.addObject(planet);
        }

        this.build();
    }
}
