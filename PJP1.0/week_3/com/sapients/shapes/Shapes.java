package com.sapients.shapes;

public class Shapes {
    int numberOfSides;

    void calculateShapeArea(int numberOfSides, int sides) {
        if (numberOfSides == 1) {
            // circle
            Circle.calculateArea(sides);
        } else if (numberOfSides == 3) {
            // triangle
            Triangle.calculateArea(sides);
        } else if (numberOfSides == 4) {
            // square
            Square.calculateArea(sides);
        } else {
            System.out.println("No Shapes Present");
        }
    }

    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.numberOfSides = 3;

        // test case 1
        s.calculateShapeArea(3, 12);

        // test case 2
        s.calculateShapeArea(4, 15);

        // test case 3
        s.calculateShapeArea(5, 15);
    }
}