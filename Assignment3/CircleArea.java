package com.praveen;

import java.util.Scanner;

public class CircleAreaProgram {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle in metres: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = (Math.PI)*Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area + "metres square.");
    }
}


/*

*************OUTPUT*************

"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=63170:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.CircleAreaProgram
Enter the radius of the circle in metres: 
47
The area of the circle is: 6939.778171779853metres square.

Process finished with exit code 0
*/
