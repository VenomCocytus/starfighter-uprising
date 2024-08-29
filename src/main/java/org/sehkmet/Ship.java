package org.sehkmet;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

// Ship class polygonal shape of the player's ship
@Getter
@Setter
public class Ship extends BaseVectorShape {

    // Define the ship polygon
    private int[] shipX = { -6, -3, 0, 3, 6, 0 };
    private int[] shipY = { 6, 7, 7, 7, 6, -7 };

    // Bounding rectangle
    public Rectangle getBounds() {
        return new Rectangle((int)getPositionX() - 6,
                (int)getPositionY() -6,
                    12, 12);
    }

    // Default constructor
    Ship() {
        setShape(new Polygon(shipX, shipY, shipX.length));
        setAlive(true);
    }
}
