package org.sehkmet;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

// Asteroid class - for polygonal asteroid shape
@Getter
@Setter
public class Asteroid extends BaseVectorShape {

    // Define the asteroid polygonal shape
    private int[] asteroidX = {-20,-13, 0,20,22, 20, 12, 2,-10,-22,-16};
    private int[] asteroidY = { 20, 23,17,20,16,-20,-22,-14,-17,-20, -5};

    // Rotation speed
    protected double rotationVelocity;

    // Bounding rectangle
    public Rectangle getBounds() {
        return new Rectangle(
                (int)getPositionX() - 20,
                (int)getPositionY() - 20,
                40,
                40
        );
    }

    // Default constructor
    Asteroid() {
        setShape(new Polygon(asteroidX, asteroidY, asteroidX.length));
        setAlive(true);
        setRotationVelocity(0.0);
    }
}
