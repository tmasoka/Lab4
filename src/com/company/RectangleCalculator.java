package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleCalculator {
    public static void main(String[] args) throws IOException {
        Rectangle.finalResult();
    }
}

class Rectangle {
    static float width, height, result; // Formula = W * H

    public static void getData() throws NumberFormatException, IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Rectangle Area Calculator!");
        System.out.print("Please, tell us how wide it is: ");
        width = Float.parseFloat(BR.readLine());
        System.out.print("Great! Now please, tell us how tall it is: ");
        height = Float.parseFloat(BR.readLine());

    }

    public static void computeField() {
        result = width * height;
    }

    public static void displayField() {
        System.out.println("Your rectangle result is: " + result);
    }

    public static void finalResult() throws NumberFormatException, IOException {
        getData();
        computeField();
        displayField();
    }
}


