package org.example;

public class Sphere extends ShapeGenerator {
    private final double radius;

    // Constructor to initialize the radius
    public Sphere(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero.");
        }
        this.radius = radius;
    }

    // Calculate the surface area of the sphere
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Calculate the volume of the sphere
    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    // Override toString for better representation
    @Override
    public String toString() {
        return String.format("Sphere (Radius: %.2f)", radius);
    }
}
