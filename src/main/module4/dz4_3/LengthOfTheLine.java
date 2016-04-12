package main.module4.dz4_3;

/**
 * Created by Zenovii on 10.03.2016.
 */

import java.util.Scanner;

public class LengthOfTheLine {
    public static void main(String[] args) {
        double x1, x2, y1, y2, lengthLine;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 ");
        if (scanner.hasNextDouble()) {
            x1 = scanner.nextDouble();
            System.out.print("Enter x2 ");
            x2 = scanner.nextDouble();
            System.out.print("Enter y1 ");
            y1 = scanner.nextDouble();
            System.out.print("Enter y2 ");
            y2 = scanner.nextDouble();

            lengthLine = lengthOfTheLine(x1,x2,y1,y2);
            System.out.println("Length Of The Line = " + lengthLine);
        }
        else {
            System.out.println("You did not specify coordinates");
        }
    }
    public static double lengthOfTheLine(double x1,double x2,double y1,double y2){
        return (Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
    }
}