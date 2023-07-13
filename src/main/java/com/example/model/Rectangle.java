package com.example.model;

import com.example.config.condition.RectangleCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component
@Conditional(RectangleCondition.class)
public class Rectangle implements Shape{

    public Rectangle() {
    }

    @Override
    public int getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type length and width of rectangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle ";
    }
}
