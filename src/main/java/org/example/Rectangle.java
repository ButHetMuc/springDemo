package org.example;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (length * width);
    }

    @Override
    public double calculatePerimeter() {
        return ((length+width) * 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
