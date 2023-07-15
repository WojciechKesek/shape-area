package com.example.model;

import com.example.config.condition.SquareCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Conditional(SquareCondition.class)
public class Square implements Shape{

    @Override
    public double getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a: ");
        int a = scanner.nextInt();
        scanner.close();
        return a*a;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
