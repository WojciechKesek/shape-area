package com.example;

import com.example.config.AppConfig;
import com.example.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
        ShapeService service = (ShapeService) applicationContext.getBean("shapeService");
        service.getArea();
    }
}