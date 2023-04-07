package org.example;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Triangle implements Shape{
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean isPrimeTriangle(){
        if( a>b && a>c){
            if((a*a) - (b*b + c*c) <= 0.1){
                return true;
            }
        }
        if( b>a && b>c){
            if((b*b) - (a*a + c*c) <= 0.1){
                return true;
            }
        }
        if( c>a && c>b){
            if((c*c) - (b*b + a*a) <= 0.1){
                return true;
            }
        }
        return false;
    }
    public double longest(){
        if(a>b && a>c)
            return a;
        if(b>a && b>c)
            return b;
       return  c;
    }

    public double haftPerimeter(){
        return (a+b+c)/2;
    }
    @Override
    public double calculateArea() {
        double p = haftPerimeter();
        double x = p*(p-a)*(p-b)*(p-c);
        return (Math.sqrt(x));
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 && Double.compare(triangle.b, b) == 0 && Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
