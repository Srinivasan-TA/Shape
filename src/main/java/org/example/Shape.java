package org.example;

import java.util.*;

public class Shape {
    private String shapeType;
    private double[] shapeDimensions;

    public Shape(String shapeType, double[] shapeDimensions) {
        this.shapeType = shapeType;
        this.shapeDimensions = shapeDimensions;
    }

    public double getPerimeter() {
        double perimeter = 0;
        if (shapeType.equals("triangle")) {
            perimeter = shapeDimensions[0] + shapeDimensions[1] + shapeDimensions[2];
        } else if (shapeType.equals("rectangle")) {
            perimeter = 2 * (shapeDimensions[0] + shapeDimensions[1]);
        } else if (shapeType.equals("circle")) {
            perimeter = 2 * Math.PI * shapeDimensions[0];
        }
        return perimeter;
    }

    public double getArea() {
        double area = 0;
        if (shapeType.equals("triangle")) {
            double s = (shapeDimensions[0] + shapeDimensions[1] + shapeDimensions[2]) / 2;
            area = Math.sqrt(s * (s - shapeDimensions[0]) * (s - shapeDimensions[1]) * (s - shapeDimensions[2]));
        } else if (shapeType.equals("rectangle")) {
            area = shapeDimensions[0] * shapeDimensions[1];
        } else if (shapeType.equals("circle")) {
            area = Math.PI * shapeDimensions[0] * shapeDimensions[0];
        }
        return area;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double[] shapeDimensions=new double[3];

        System.out.println("Enter the type of shape");
        String shapeType=sc.next();

        for(int i=0;i<3;i++){
            System.out.println("Enter the "+ i +"value");
            shapeDimensions[i]=sc.nextInt();
        }

        Shape s1=new Shape(shapeType, shapeDimensions);

        System.out.println("Area is "+ s1.getArea());
        System.out.println("Perimeter is"+s1.getPerimeter());
    }
}


