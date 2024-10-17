package assignment1;

import assignment1.interfaces.Figure;

public class Triangle implements Figure {
    private double height;
    private double width;
    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (this.height * this.width) / 2;
    }

    @Override
    public double getCircumference() {
        int powerOf = 2;
        return Math.sqrt(Math.pow(this.height, powerOf) + Math.pow(this.width, powerOf)) + this.height + this.width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
