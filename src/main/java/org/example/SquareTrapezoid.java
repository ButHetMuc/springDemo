package org.example;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class SquareTrapezoid implements Shape{
    private Rectangle rectangle;
    private Triangle triangle;

    public SquareTrapezoid() {
    }

    public SquareTrapezoid(Rectangle rectangle, Triangle triangle) {
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        double width = rectangle.getWidth();
        if( triangle.isPrimeTriangle() && width == a || width == b || width == c ){
            this.rectangle = rectangle;
            this.triangle = triangle;
        }
        else throw  new RuntimeException("the condition of squareTrapezoid is not invalid");
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double calculateArea() {
        return rectangle.calculateArea() + triangle.calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return rectangle.calculatePerimeter() + triangle.calculatePerimeter();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SquareTrapezoid that = (SquareTrapezoid) o;
        return Objects.equals(rectangle, that.rectangle) && Objects.equals(triangle, that.triangle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rectangle, triangle);
    }

    @Override
    public String toString() {
        return "SquareTrapezoid{" +
                "rectangle=" + rectangle +
                ", triangle=" + triangle +
                '}';
    }
}
