package com.example.service;


import com.example.model.Shape;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShapeService {

    private final Shape shape;

    public void getShapeArea(){
        System.out.println("Area of " + shape + " is: " + shape.getArea());
    }
}
