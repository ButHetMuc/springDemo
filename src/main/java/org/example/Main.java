package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Rectangle rectangle = context.getBean("rectangle", Rectangle.class);
//        System.out.println(rectangle);
//        System.out.println("area: "+ rectangle.calculateArea());
//        System.out.println("perimeter: "+rectangle.calculatePerimeter());

        ShapeServices services = context.getBean("shapeServices",ShapeServices.class);
        System.out.println(services.toString());
        System.out.println(services.calculateArea());
        System.out.println(services.calculatePerimeter());

        Triangle triangle = context.getBean("triangle", Triangle.class);
        System.out.println(triangle.isPrimeTriangle());

        Shape shape = context.getBean("squareTrapezoid",SquareTrapezoid.class);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.toString());

    }
}