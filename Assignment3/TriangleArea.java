package com.praveen;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Enter the sides of the triangle: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double s = (a + b + c)/2;
        double area = Math.round(Math.sqrt(s*(s-a)*(s-b)*(s-c))*100.0)/100.0;
        System.out.println("The area of the triangle is: " + area);
    }
}



/*
************OUTPUT************

  "C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=63351:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.TriangleArea
Enter the sides of the triangle: 
87	54	56
The area of the triangle is: 1463.66

Process finished with exit code 0
*/
