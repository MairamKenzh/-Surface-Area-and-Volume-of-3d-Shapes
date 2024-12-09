package org.example;

public class Cylinder extends ShapeGenerator {
    private final double radius;
    private final double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException("Radius and height must be greater than zero.");
        }
        this.radius = radius;
        this.height = height;
    }

    // Calculate the surface area of the cylinder
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Calculate the volume of the cylinder
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // Override toString for better representation
    @Override
    public String toString() {
        return String.format("Cylinder (Radius: %.2f, Height: %.2f)", radius, height);
    }
}
