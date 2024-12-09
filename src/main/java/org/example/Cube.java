package org.example;

public class Cube extends ShapeGenerator {
    private final double sideLength;

    // Constructor to initialize the side length
    public Cube(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be greater than zero.");
        }
        this.sideLength = sideLength;
    }

    // Calculate the surface area of the cube
    public double surfaceArea() {
        return 6 * sideLength * sideLength;
    }

    // Calculate the volume of the cube
    @Override
    public double volume() {
        return sideLength * sideLength * sideLength;
    }

    // Override toString for better representation
    @Override
    public String toString() {
        return String.format("Cube (Side Length: %.2f)", sideLength);
    }
}
