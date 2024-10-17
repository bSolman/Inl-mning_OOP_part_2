package assignment1;

import assignment1.interfaces.Figure;

public class Circle implements Figure {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        int powerOf = 2;
        return Math.PI * Math.pow(radius, powerOf);
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
