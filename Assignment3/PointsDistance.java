package com.praveen;

import java.util.Scanner;

public class PointsDistance {
    public static void main(String[] args) {
        System.out.println("Enter the first point coordinates (x1, y1):");
        Scanner input = new Scanner(System.in);
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        System.out.println("Enter the second point coordinates (x2, y2):");
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        double distance = Math.pow((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)), 0.5);
        System.out.println("The distance between the points is: " + distance);
    }
}


/*

*******************************OUTPUT*******************************

C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=52436:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.PointsDistance
Enter the first point coordinates (x1, y1):
45.25
98.45
Enter the second point coordinates (x2, y2):
17
6.5
The distance between the points is: 96.19181066380727

Process finished with exit code 0

*/
