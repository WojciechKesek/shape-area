package com.example.model;

import com.example.config.condition.SquareCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Conditional(SquareCondition.class)
public class Square implements Shape{


    public Square() {
    }

    @Override
    public int getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type length of square");
        int a = scanner.nextInt();
        scanner.close();
        return a*a;
    }

    @Override
    public String toString() {
        return "Square ";
    }
}
