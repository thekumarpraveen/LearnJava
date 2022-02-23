package com.praveen;

import java.util.Scanner;

public class RectangleAreaProgram {
    public static void main(String[] args) {
        System.out.println("Enter the sides of the triangle: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double area = Math.round(a * b * 100)/100.0;
        System.out.println("The area of the rectangle is: " + area);
    }
}


/*

******************OUTPUT******************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ 
IDEA Community Edition 2021.3.1\lib\idea_rt.jar=49238:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin"
-Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.RectangleAreaProgram
Enter the sides of the triangle: 
54.32	68.25
The area of the rectangle is: 3707.34

Process finished with exit code 0

*/
