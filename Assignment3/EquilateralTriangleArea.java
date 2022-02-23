package com.praveen;

import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        System.out.println("Enter the equal side of the triangle:");
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        double area = Math.round(Math.sqrt(3)/4 * Math.pow(side, 2)*100)/100.0;
        System.out.println("The area of the equilateral triangle is: " + area);

    }
}


/*

**********************OUTPUT**********************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=52706:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.EquilateralTriangleArea
Enter the equal side of the triangle:
57
The area of the equilateral triangle is: 1406.86

Process finished with exit code 0

*/
