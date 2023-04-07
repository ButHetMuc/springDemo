package org.example;

import org.springframework.stereotype.Component;

import java.util.Objects;
@Component
public class Circle implements Shape{
    private double diameter;

    public Circle() {
    }

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double calculateArea() {
        return ((diameter*diameter*Math.PI)/4);
    }

    @Override
    public double calculatePerimeter() {
        return (diameter*Math.PI);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                '}';
    }
}
