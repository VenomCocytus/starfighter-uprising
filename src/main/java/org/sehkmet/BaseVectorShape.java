package org.sehkmet;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

// Base vector shape class for the polygonal shapes
@Getter
@Setter
public class BaseVectorShape {

    private Shape shape;
    private boolean alive;
    private double positionX, positionY;
    private double velocityX, velocityY;
    private double moveAngle, faceAngle;


    // Setters (mutator and helper methods)
    public void increasePositionX(double i) { this.positionX += i; }
    public void increasePositionY(double i) { this.positionY += i; }
    public void increaseVelocityX(double i) { this.velocityX += i; }
    public void increaseVelocityY(double i) { this.velocityY += i; }
    public void increaseFaceAngle(double i) { this.faceAngle += i; }
    public void increaseMoveAngle(double i) { this.moveAngle += i; }

    // Default constructor
    BaseVectorShape() {
        setShape(null);
        setAlive(false);
        setPositionX(0.0);
        setPositionY(0.0);
        setVelocityX(0.0);
        setVelocityY(0.0);
        setMoveAngle(0.0);
        setFaceAngle(0.0);
    }
}
