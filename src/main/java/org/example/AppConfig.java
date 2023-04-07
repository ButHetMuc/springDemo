package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    @Bean
    public Circle circle(){
        return new Circle(4);
    }
    @Bean
    public Rectangle rectangle(){
        return new Rectangle(7,6);
    }

    @Bean
    public Triangle triangle(){
        return new Triangle(3,4,5);
    }
    @Bean
    public  ShapeServices shapeServices(){
        return new ShapeServices(rectangle());
    }
    @Bean
    public SquareTrapezoid squareTrapezoid(){
        return new SquareTrapezoid(rectangle(),triangle());
    }

}
