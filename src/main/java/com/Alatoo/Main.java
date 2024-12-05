package com.Alatoo;
import java.util.Random;
public class Main{
    public static void main(String[] args) {
        Random random = new Random();
        Shape3DInterface[] shapes = new Shape3DInterface[10];


        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0:
                    shapes[i] = new Sphere(1 + random.nextDouble() * 9);
                    break;
                case 1:
                    shapes[i] = new Cylinder(1 + random.nextDouble() * 9, 5 + random.nextDouble() * 15);
                    break;
                case 2:
                    shapes[i] = new Cube(1 + random.nextDouble() * 9);
                    break;
            }
        }

        for (Shape3DInterface shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n%n", shape.volume());
        }
    }
}