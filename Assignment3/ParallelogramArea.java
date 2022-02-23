package com.praveen;

import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        System.out.println("Enter the two sides of the parallelogram: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Enter the angle between the two sides in degrees: ");
        double angle = Math.toRadians((input.nextDouble()));
        double area = Math.round(a * b * Math.sin(angle) * 100)/100.0 ;
        System.out.println("The area of the parallelogram is: " + area);
    }
}

/*

*******************OUTPUT*******************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=64723:
C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" 
com.praveen.ParallelogramArea
Enter the two sides of the parallelogram: 
2
1.4142135623731
Enter the angle between the two sides in degrees: 
45
The area of the parallelogram is: 2.0

Process finished with exit code 0


*/
