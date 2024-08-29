package org.sehkmet;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

// Bullet class - polygonal shape of a bullet
@Getter
@Setter
public class Bullet extends BaseVectorShape {

    // Bounding rectangle
    public Rectangle getBounds() {
        return new Rectangle(
                (int)getPositionX(),
                (int)getPositionY(),
                1,
                1
        );
    }

    // Default constructor
    Bullet () {
        // Creating the bullet shape
        setShape(new Rectangle(0, 0, 1, 1));
        setAlive(false);
    }
}
