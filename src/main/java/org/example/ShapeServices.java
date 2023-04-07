package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeServices implements Shape {
    private  Shape shape;

    public  ShapeServices(@Qualifier("rectangle") Shape shape){
        this.shape = shape;
    }
    @Override
    public double calculateArea() {
        return shape.calculateArea();
    }
    @Override
    public double calculatePerimeter() {
        return shape.calculatePerimeter();
    }

    @Override
    public String toString() {
        return "ShapeServices{" +
                "shape=" + shape +
                '}';
    }
}
