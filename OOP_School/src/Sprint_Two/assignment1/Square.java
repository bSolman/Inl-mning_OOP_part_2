package assignment1;

import assignment1.interfaces.Figure;

public class Square implements Figure {
    private int width;
    private int length;
    public Square(int width, int length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getCircumference() {
        return (this.length * 2) + (this.width * 2);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
