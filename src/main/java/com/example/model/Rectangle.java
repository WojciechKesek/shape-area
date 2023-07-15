package com.example.model;

import com.example.config.condition.RectangleCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component
@Conditional(RectangleCondition.class)
public class Rectangle implements Shape{

    @Override
    public double getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a: ");
        int a = scanner.nextInt();
        System.out.print("Please type b: ");
        int b = scanner.nextInt();
        scanner.close();
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
