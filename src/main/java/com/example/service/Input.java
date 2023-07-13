package com.example.service;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Input {

    private static Path path = Path.of("src/main/resources/application.properties");
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 1 to calculate rectangle\n Please type 2 to calculate square");
        int a = scanner.nextInt();
        String s = a == 2? "true" : "false";
        try(BufferedWriter writer = Files.newBufferedWriter(path, Charset.defaultCharset())) {
            writer.write("chosen.shape = " + s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
